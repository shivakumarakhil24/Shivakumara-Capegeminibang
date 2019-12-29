import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {

  constructor(private service: UserService, private router: Router) { }
  password: any;
  cpassword: any;

  ngOnInit() {
  }

  changePass(form: NgForm) {
    console.log(form.value);
    console.log(form.value.password);
    console.log(form.value.cpassword);
    if (form.value.userPassword === form.value.cpassword) {
      this.service.changePassword(form.value).subscribe(responseData => {
        this.router.navigateByUrl('/login');
        console.log(form.value.password);
        form.reset();
      }, err => {
        console.log(err);
      });
    }
  }
}
