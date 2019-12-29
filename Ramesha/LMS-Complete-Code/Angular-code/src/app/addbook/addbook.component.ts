import { Component, OnInit } from '@angular/core';
import { LibrarianService } from '../librarian.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  msg: string;
  constructor(private service: LibrarianService, private router: Router) { }

  addBook(form: NgForm) {
    this.msg = null;
    this.service.addbook(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Add Book', responseData);
        if (responseData && responseData.description === 'Book is added to the Library') {
          this.router.navigateByUrl('/librarian');
        } else {
          this.router.navigateByUrl('/addbook');
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
