import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  msg: string;

  constructor(private auth: AuthService, private router: Router) { }

  ngOnInit() {
  }

  login(form: NgForm) {
    this.msg = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(responseData => {
      this.msg = responseData.description;
      console.log('Response of login', responseData);
      if (responseData && responseData.description === 'User Login Successfully') {
        localStorage.setItem('userDetails', JSON.stringify(responseData))
        if (responseData.user.userType === 'Admin') {
          this.router.navigateByUrl('/admin');
        } else if (responseData.user.userType === 'Student') {
          this.router.navigateByUrl('/student');
        } else if (responseData.user.userType === 'Librarian') {
          this.router.navigateByUrl('/librarian');
        } else {
          this.router.navigateByUrl('/');
        }
      }
      form.reset();
    }, err => {
      console.log(err);
      this.msg = err.description;
    });
  }
}
