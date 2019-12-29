import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-requestbook',
  templateUrl: './requestbook.component.html',
  styleUrls: ['./requestbook.component.css']
})
export class RequestbookComponent implements OnInit {


  msg: string;
  constructor(private service: StudentService, private router: Router) { }

  requestBook(form: NgForm) {
    this.msg = null;
    this.service.requestBooks(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Request Book', responseData);
        if (responseData && responseData.description === 'Book Request Successfully') {
          this.router.navigateByUrl('/student');
        } else {
          this.router.navigateByUrl('/requestbook');
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
