import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

    constructor(private service: UserService, private route : Router) { }
    users = [];
  printForm(loginForm: NgForm) {
    console.log('login details ', loginForm.value);
    this.service.login(loginForm.value).subscribe(data => {
      console.log(data);
      loginForm.reset();
      localStorage.setItem('user', JSON.stringify(data));
      this.route.navigateByUrl('/');
    }, err => {
      console.log('error' , err);
    });
  }


  ngOnInit() {
  }

}
