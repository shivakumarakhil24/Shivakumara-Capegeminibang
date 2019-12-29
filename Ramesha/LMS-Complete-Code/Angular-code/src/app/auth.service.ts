import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagementsystem/registerUser`, user);
  }

  loginUser(user): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/librarymanagementsystem/user-login/${user.userId}/${user.userPassword}`);
  }
}
