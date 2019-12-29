import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-cancelrequest',
  templateUrl: './cancelrequest.component.html',
  styleUrls: ['./cancelrequest.component.css']
})
export class CancelrequestComponent {

  msg: string;
  constructor(private service: StudentService, private router: Router) { }

  cancelRequest(form: NgForm) {
    this.msg = null;
    this.service.cancelBookRequest(form.value)
      .subscribe(Data => {
        this.msg = Data.description;
        console.log('Response of Cancel Book Request', Data);
        if (Data && Data.description === 'The Request for book is Canceled') {
          this.router.navigateByUrl('/student');
        } else {
          this.router.navigateByUrl('/cancelrequest');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.Data.description;
      });
  }
}
