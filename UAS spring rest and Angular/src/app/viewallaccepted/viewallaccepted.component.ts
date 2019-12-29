import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-viewallaccepted',
  templateUrl: './viewallaccepted.component.html',
  styleUrls: ['./viewallaccepted.component.css']
})
export class ViewallacceptedComponent implements OnInit {
  viewAllAcceptedApplications;

  constructor(private service: AdminService) {
    this.viewAllAccepted();
   }

  ngOnInit() {
  }

  viewAllAccepted() {
    this.service.viewAllAccepted().subscribe(data => {
      console.log(data);
      this.viewAllAcceptedApplications = data.applicationsList;
      console.log(this.viewAllAcceptedApplications);
    }, err => {
      console.log(err);
    });
  }

}
