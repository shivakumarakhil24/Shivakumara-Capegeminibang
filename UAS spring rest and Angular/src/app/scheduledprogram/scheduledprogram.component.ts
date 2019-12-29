import { Component, OnInit } from '@angular/core';
import { Scheduledprogram } from 'src/scheduledprogram';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-scheduledprogram',
  templateUrl: './scheduledprogram.component.html',
  styleUrls: ['./scheduledprogram.component.css']
})
export class ScheduledprogramComponent implements OnInit {

  scheduledprogram: any;
  // selectedScheduledprogram: Scheduledprogram = this.scheduledprogram[0];
  constructor(private service: AdminService) {
    this.getAllSheduledProgram();
   }

  addApplicant(form) {
    console.log(form.value);
    this.service.addApplicant(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    });
  }
  selectScheduledprogram(scheduledprogram) {
    this.selectScheduledprogram = scheduledprogram;
  }
  getAllSheduledProgram() {
    this.service.getAllProgramm().subscribe(data => {
      console.log(data);
      this.scheduledprogram = data.programsOfferedList;
      console.log(this.scheduledprogram);
    }, err => {
      console.log('error' , err);
    })
  }


  ngOnInit() {
  }

}
