import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from 'src/app/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-compose',
  templateUrl: './compose.component.html',
  styleUrls: ['./compose.component.css']
})
export class ComposeComponent implements OnInit {
  msg;
  constructor(private user: UserService, private router: Router) { }

  ngOnInit() {
  }

  addMail(form: NgForm) {
    console.log(form.value);
    this.user.send(form.value).subscribe(res => {
      this.msg = res.description;
      console.log('Response of Send', res);
      if (res && res.message === 'Success') {
        this.router.navigate(['/userhome']);
      } else {
        this.router.navigateByUrl('/compose');
      }
    })
  }
}
