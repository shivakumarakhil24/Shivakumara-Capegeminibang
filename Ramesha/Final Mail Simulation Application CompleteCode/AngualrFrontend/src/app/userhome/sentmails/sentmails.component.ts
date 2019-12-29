import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-sentmails',
  templateUrl: './sentmails.component.html',
  styleUrls: ['./sentmails.component.css']
})
export class SentmailsComponent implements OnInit {
  check;
  mails = new Array();
  constructor(private service: UserService) {
    this.getAll();
  }

  ngOnInit() {
  }
  getAll() {
    this.service.getAllMails().subscribe(responseData => {
      console.log(responseData);
      this.check = JSON.parse(localStorage.getItem('mailDetails'));
      console.log('logged in user', this.check.info, ' responseData', responseData.mailinfo);
      for (let val of responseData.mailinfo) {
        if (val.user.id === this.check.info[0].id) {
          this.mails.push(val);
        }
      }
      console.log(this.mails);
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Mails got successfully');
    });
  }
}
