import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { LibrarianService } from '../librarian.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchallbookbylibrarian',
  templateUrl: './searchallbookbylibrarian.component.html',
  styleUrls: ['./searchallbookbylibrarian.component.css']
})
export class SearchallbookbylibrarianComponent implements OnInit {
  selectedBook;
  books: any[];
  constructor(private router: Router, private service: StudentService, private librarianService: LibrarianService) {
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
  delete(book){
    this.selectedBook=book;
  }
  deleteBook(id) {
    console.log(id);
    this.librarianService.removeBook(id.bookId).subscribe(data => {
      console.log(data);
      console.log('Response of Removed Book', data);
      if (data && data.description === 'Book Removed from the DataBase') {
        this.router.navigateByUrl('/librarian');
      } else {
        this.router.navigateByUrl('/searchallbookbylibrarian');
      }
    }, err => {
      console.log(err);
    }, () => {
      console.log("Book Deleted Successfully");
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
      console.log('Books responseData got successfully');

    });
  }
  ngOnInit(): void {

  }
}
