import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  backendURL = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('user'));
    if (userDetails && userDetails.role) {
      return true;
    } else {
      return false;
    }
  }

  login(data) {
    console.log('service', data);
    return this.http.post<any>(`${this.backendURL}/university_admission_system/adminLogin`, data);
  }
}
