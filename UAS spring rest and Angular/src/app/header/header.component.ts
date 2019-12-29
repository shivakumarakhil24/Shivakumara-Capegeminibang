import { Component, OnInit, DoCheck } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit, DoCheck {

  role = 'null';

  constructor(private route: Router) { }

  ngOnInit() {
  }


  ngDoCheck(): void {
    const userDetails = JSON.parse(localStorage.getItem('user'));
    if (userDetails) {
      this.role = userDetails.role;
      console.log(this.role);
    }
  }

  logout() {
    localStorage.clear();
    this.role = 'null';
    this.route.navigateByUrl('/login');
  }

}
