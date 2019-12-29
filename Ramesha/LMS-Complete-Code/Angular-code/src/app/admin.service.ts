import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http: HttpClient) { }

  addStudent(user): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagementsystem/add-student`, user);
  }
  addLibrarian(user): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagementsystem/add-librarian`, user);
  }
  searchAllUsers(): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/search-allUser`);
  }
  searchUserById(user): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/search-user/${user.userId}`);
  }
  removeUser(user): Observable<any> {
    return this.http.delete(`http://localhost:8080/librarymanagementsystem/delete-user/${user.userId}`);
  }
  updateUser(user): Observable<any> {
    return this.http.put(`http://localhost:8080/librarymanagementsystem/update-user`, user);
  }
}
