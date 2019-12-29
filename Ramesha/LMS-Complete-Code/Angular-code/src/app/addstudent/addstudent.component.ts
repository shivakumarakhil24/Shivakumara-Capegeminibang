import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addstudent',
  templateUrl: './addstudent.component.html',
  styleUrls: ['./addstudent.component.css']
})
export class AddstudentComponent implements OnInit {

  msg: string;
  constructor(private adminService: AdminService, private router: Router) { }

  addStudent(form: NgForm) {
    this.msg = null;
    this.adminService.addStudent(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Add Student', responseData);
        if (responseData && responseData.description === 'Student Data added to the DataBase Successfully') {
          this.router.navigateByUrl('/admin');
        } else {
          this.router.navigateByUrl('/addstudent');
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
