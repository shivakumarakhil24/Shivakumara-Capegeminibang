import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-viewallrejected',
  templateUrl: './viewallrejected.component.html',
  styleUrls: ['./viewallrejected.component.css']
})
export class ViewallrejectedComponent implements OnInit {

  viewAllRejectedApplication;

  constructor(private service: AdminService) {
    this.viewAllRejected();
   }

  ngOnInit() {
  }


  viewAllRejected() {
     this.service.viewAllRejected().subscribe(data => {
       console.log(data);
       this.viewAllRejectedApplication = data.applicationsList;
     }, err => {
       console.log(err);
     });
  }

}
