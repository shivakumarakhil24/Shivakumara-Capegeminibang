import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit {

  ProgramName: string;
  description: string;
  applicant_eligibility: string;
  duration: number;
  degree_certificate_offered: string;

  error: string;

  constructor(private adminService: AdminService, private router: Router) { }

  ngOnInit() {
  }
  addCourses(courseForm: NgForm) {
    console.log(courseForm.value);
    console.log(this.ProgramName)
    this.error = null;
    this.adminService.postData(courseForm.value).subscribe(data => {
      console.log(data);
      alert("Course Added Successful...")
      this.router.navigate(['./adminoperation'])
      if(data === null){
        this.error = "Course Already present, give new Course Name";
      }
      courseForm.reset();
    }, err => {
      console.log(err);
    } );
  }
}
