import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-view-all-applications',
  templateUrl: './view-all-applications.component.html',
  styleUrls: ['./view-all-applications.component.css']
})
export class ViewAllApplicationsComponent implements OnInit {

  selectviewallapplication ;
  constructor( private adminservice:AdminService, private router: Router ) { 
    this.getAllApplication();
  }

  getAllApplication() {
    this.adminservice.getAllApplication().subscribe(data => {
      console.log(data);
      this.selectviewallapplication = data.applicationsList;
      console.log("data" , this.selectviewallapplication);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
    // this.adminservice.getApplications();
    // setTimeout(() => {
    //   this.router.navigateByUrl('/adminoperation');
    // }, 30000);
  }
  // selectViewAllAllocation(viewallapplicatiton){
  //   console.log(viewallapplicatiton);
  //   this.selectViewAllAllocation = viewallapplicatiton;
  // }

}
