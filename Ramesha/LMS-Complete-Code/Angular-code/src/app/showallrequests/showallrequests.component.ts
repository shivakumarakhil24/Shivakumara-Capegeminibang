import { Component, OnInit } from '@angular/core';
import { LibrarianService } from '../librarian.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showallrequests',
  templateUrl: './showallrequests.component.html',
  styleUrls: ['./showallrequests.component.css']
})
export class ShowallrequestsComponent implements OnInit {

  msg: string;

  requests: any[];
  constructor(private service: LibrarianService, private router: Router) {
    this.getAllUsers();
  }

  getAllUsers() {
    this.service.showAllRequest().subscribe(responseData => {
      console.log(responseData);
      this.requests = responseData.reg;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Request  got successfully');
    });
  }

  acceptBookRequest(regId) {
    this.service.acceptRequest(regId).subscribe(data => {
      console.log(data);
      if (data && data.description === 'Requesting for Book is Accepted') {
        this.router.navigateByUrl('/librarian');
        this.msg = data.description;
      } else {
        this.router.navigateByUrl('/showallrequests');
      }
    }, err => {
      console.log(err);
      this.msg = err.description;
    }, () => {
      console.log('Book Request is Accepted');
    })
  }

  issueBook(res) {
    this.service.issueBooks(res)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Issued Book', responseData);
        if (responseData && responseData.description === 'Book is Issued Successfully') {
          this.router.navigateByUrl('/librarian');
        } else {
          this.router.navigateByUrl('/showallrequests');
        }
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }
  ngOnInit() {
  }

}
