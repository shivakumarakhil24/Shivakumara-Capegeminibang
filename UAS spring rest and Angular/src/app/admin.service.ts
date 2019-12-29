import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { map } from 'rxjs/operator';
import { HttpHeaders } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  // isManagerLoggedIn:false;
  // isAdminLoggedIn:false;
  viewallassets: any;
  viewallallocation: any;
  backendUrl = 'http://localhost:8080';
  viewallapplication: Object;


  constructor(private http: HttpClient) { }
  Application: any[];

  addApplicant(data) {
    return this.http.post<any>(`${this.backendUrl}/university_admission_system/addApplicant`, data);
  }

  getAllProgramm() {
    return this.http.get<any>(`${this.backendUrl}/university_admission_system/getAllProgram`);
  }

  getAllApplication() {
    return this.http.get<any>(`${this.backendUrl}/university_admission_system/getAllApplications`);
  }

  viewAllAccepted() {
    return this.http.get<any>(`${this.backendUrl}/university_admission_system/viewAllAccepted`);
  }

  viewAllRejected() {
    return this.http.get<any>(`${this.backendUrl}/university_admission_system/viewAllRejected`);
  }


  getData() {
    return this.http.get(`${this.backendUrl}/allasset`)
      .subscribe(resData => {
        // this.Assests = resData;
        console.log(resData);
        this.viewallassets = resData;
        console.log(this.viewallassets);
      })
  }
  postData(data) {
    return this.http.post(`${this.backendUrl}/add`, data);
  }
  loginPage(login) {
    return this.http.post(`${this.backendUrl}/login`, login);
  }
    raiseApplicationRequests(data)
    {
      return this.http.post(`${this.backendUrl}/raiseApplicationRequests`, data);

    }
  viewStatus(data) {
    return this.http.post(`${this.backendUrl}/viewstatus`, data);
  }
  updateData(data) {
    console.log("test", data);
    console.log("applicationId", data.applicationid);
    return this.http.put(`${this.backendUrl}/updateasset/${data.assetid}`, data);
  }
  deleteData(data) {
    return this.http.delete(`${this.backendUrl}/delete/${data}`);
  }
  setApplicationStatus(data) {
    console.log('service is ', data);
    return this.http.put(`${this.backendUrl}/setstatus`, data);
  }
    postApplications(data)
    {
      return this.http.post(`${this.backendUrl}/addcourse`, data);
    }
  getApplications() {
    return this.http.get(`${this.backendUrl}/allapplication`)
      .subscribe(resData => {
        console.log(resData);
        this.viewallapplication = resData
        console.log(this.viewallapplication);
      });
  }
}

