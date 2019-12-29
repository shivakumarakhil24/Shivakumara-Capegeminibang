import { Component, OnInit } from '@angular/core';
import { LibrarianService } from '../librarian.service';

@Component({
  selector: 'app-showallissuedbooks',
  templateUrl: './showallissuedbooks.component.html',
  styleUrls: ['./showallissuedbooks.component.css']
})
export class ShowallissuedbooksComponent implements OnInit {


  issued: any[];
  constructor(private service: LibrarianService) {
    this.getAllIssuedBookDetails();
  }

  getAllIssuedBookDetails() {
    this.service.showAllIssuedBooks().subscribe(responseData => {
      console.log(responseData);
      this.issued = responseData.details;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Issued Books Details got successfully');
    });
  }
  ngOnInit() {
  }
}
