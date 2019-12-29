import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { UserService } from './user.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private service: UserService) { }
  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): boolean {
    const expectedRoleArray = next.data.expectedRole;
    const userDetails = JSON.parse(localStorage.getItem('user'));
    let expectedRole = '';
    for (const index in expectedRoleArray) {
      if (expectedRoleArray[index] === userDetails.role) {
        expectedRole = expectedRoleArray[index];
      }
    }

    if (userDetails && this.service.isLoggedIn() && expectedRole === userDetails.role) {
      console.log('user activated');
      return true;
    } else {
      console.log('user not activated');
      return false;
    }
  }

}
