import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class UserloginService {

  private baseUrl="http://localhost:8088/login/loginUser"

  constructor(private http: HttpClient) { }

  loginUser(login: User):Observable<Object>{
    
    return this.http.post(`${this.baseUrl}`,login);
  }
}
