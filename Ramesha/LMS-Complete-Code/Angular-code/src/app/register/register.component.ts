import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


  msg: string;
  constructor(private auth: AuthService, private router: Router) { }

  register(form: NgForm) {
    this.msg = null;
    this.auth.registerUser(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Register', responseData);
        if (responseData && responseData.description === 'Admin Register Successfully') {
          this.router.navigateByUrl('/login');
        } else {
          this.router.navigateByUrl('/register');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }
  ngOnInit() {
  }

}
