import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  constructor(private router: Router) { }

  ngOnInit() {
  }
  isLoggedIn() {
    const userDetails = JSON.parse(localStorage.getItem('mailDetails'));
    if (userDetails && userDetails.info) {
      return true;
    } else {
      return false;
    }
  }
  logout() {
    localStorage.removeItem('mailDetails');
    this.router.navigateByUrl('/');
  }

}
