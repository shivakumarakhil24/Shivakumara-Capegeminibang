import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  msg: any;

  constructor(private auth: UserService, private router: Router) { }

  ngOnInit() {
  }

  login(form: NgForm) {
    this.msg = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(responseData => {
      this.msg = responseData.description;
      console.log('Response of login', responseData);
      if (responseData && responseData.description === 'User Login Successfully') {
        localStorage.setItem('mailDetails', JSON.stringify(responseData))
        this.router.navigateByUrl('/userhome');
      } else {
        this.router.navigateByUrl('/register');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.msg = err.description;
    });
  }

}
