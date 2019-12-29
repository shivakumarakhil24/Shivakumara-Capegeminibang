import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) { }
  searchBookByName(book): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/search-bookByName/${book.bookName}`);
  }

  showAllBooks(): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/search-allbooks`);
  }

  requestBooks(book): Observable<any> {
    return this.http.get(`http://localhost:8080/librarymanagementsystem/requestBook/${book.userId}/${book.bookId}`)
  }

  cancelBookRequest(book): Observable<any> {
    return this.http.post(`http://localhost:8080/librarymanagementsystem/cancelRequest/${book.registrationId}`, book);
  }
}
