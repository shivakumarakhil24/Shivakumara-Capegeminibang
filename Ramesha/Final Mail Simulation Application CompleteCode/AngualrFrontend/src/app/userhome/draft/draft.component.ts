import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-draft',
  templateUrl: './draft.component.html',
  styleUrls: ['./draft.component.css']
})
export class DraftComponent implements OnInit {
  id;
  msg: any;
  mails;
  constructor(private router: Router, private service: UserService) {
    this.getAllMails();
  }

  ngOnInit() {
  }

  getAllMails() {
    this.service.getAllMails().subscribe(responseData => {
      this.msg = responseData.description;
      this.mails = responseData;
      console.log('Response of login', responseData);
    }, err => {
      console.log(err);
      this.msg = err.description;
    });

    // delmail(); {
    //   this.service.deleteById(this.id).subscribe(responseData => {
    //     this.msg = responseData.description;
    //     this.mails = responseData;
    //     console.log('Response of login', responseData);
    //   }, err => {
    //     console.log(err);
    //     this.msg = err.description;
    //   });
  }
}
