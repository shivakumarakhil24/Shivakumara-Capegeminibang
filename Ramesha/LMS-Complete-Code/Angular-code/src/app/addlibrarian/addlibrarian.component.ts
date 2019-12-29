import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addlibrarian',
  templateUrl: './addlibrarian.component.html',
  styleUrls: ['./addlibrarian.component.css']
})
export class AddlibrarianComponent {

  msg: string;
  constructor(private adminService: AdminService, private router: Router) { }

  addLibrarian(form: NgForm) {
    this.msg = null;
    this.adminService.addLibrarian(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Add Librarian', responseData);
        if (responseData && responseData.description === 'Librarian Data added to the DataBase Successfully') {
          this.router.navigateByUrl('/admin');
        } else {
          this.router.navigateByUrl('/addlibrarian');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }
}