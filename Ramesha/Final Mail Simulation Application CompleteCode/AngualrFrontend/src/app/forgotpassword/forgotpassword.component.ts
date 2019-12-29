import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {
  msg: any;

  constructor(private user: UserService, private router: Router) { }

  ngOnInit() {
  }
  goToPage() {
    this.router.navigateByUrl('/changepassword');
  }

}
