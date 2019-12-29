import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchallbooks',
  templateUrl: './searchallbooks.component.html',
  styleUrls: ['./searchallbooks.component.css']
})
export class SearchallbooksComponent implements OnInit {

  books: any[];
  constructor(private service: StudentService) {
    this.getAllbooks();
  }

  getAllbooks() {
    this.service.showAllBooks().subscribe(responseData => {
      console.log(responseData);
      this.books = responseData.bookBean;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Users got successfully');
    });
  }

  searchBook(form: NgForm) {
    this.service.searchBookByName(form.value).subscribe(responseData => {
      console.log(responseData);
      this.books = responseData.bookBean;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('Books Data got successfully');
    });
  }
  ngOnInit() {
  }

}
