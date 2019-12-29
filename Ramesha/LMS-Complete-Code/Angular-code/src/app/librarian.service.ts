import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LibrarianService {
  constructor(private http: HttpClient) { }

  addbook(book): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagementsystem/add-book`, book);
  }
  removeBook(book): Observable<any> {
    return this.http.delete(`http://localhost:8080/librarymanagementsystem/remove-book/${book}`);
  }
  showAllRequest(): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/showAllRequests`);
  }
  showAllIssuedBooks(): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/show-allIssuedBooks`);
  }
  acceptRequest(regId): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/accept-request/${regId}`)

  }
  issueBooks(res): Observable<any> {
    return this.http.delete(`http://localhost:8080/librarymanagementsystem/issue-book/${res.studentId}/${res.bookId}`)

  }
}