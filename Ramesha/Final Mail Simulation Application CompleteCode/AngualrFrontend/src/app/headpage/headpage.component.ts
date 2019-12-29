import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { RouterModule, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';

@Component({
  selector: 'app-headpage',
  templateUrl: './headpage.component.html',
  styleUrls: ['./headpage.component.css']
})
export class HeadpageComponent implements OnInit {
  msg: any;


  constructor(private user: UserService, private router: Router, http: HttpClient) { }

  ngOnInit() {
  }

  send(form: NgForm) {
    this.user.send(form.value).subscribe(res => {
      this.msg = res.description;
      console.log('Response of Send', res);
      if (res && res.description === 'Success') {
        this.router.navigateByUrl('/');
      }
    })
  }

}
