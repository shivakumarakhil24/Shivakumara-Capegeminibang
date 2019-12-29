import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  msg;
  constructor(private service: UserService, private router: Router) { }

  ngOnInit() {
  }
  registeruser(registerForm: NgForm) {
    this.msg = null;
    console.log(registerForm.value);
    this.service.register(registerForm.value).subscribe(data => {
      this.msg = data.description;
      if (data && data.description === 'User register Successfully') {
        this.router.navigateByUrl('/login');
      } else {
        this.router.navigateByUrl('/register');
      }
      registerForm.reset();
    }, err => {
      this.msg = err.description;
      console.log(err);
    }, () => {
      console.log('data posted successfully');
    });
  }

}
