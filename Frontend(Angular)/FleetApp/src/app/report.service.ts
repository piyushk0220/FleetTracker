import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ReportService {

  private url = 'http://localhost:8082/report/gen_report';
  private url2 = 'http://localhost:8080/vehicle/details';
  private url3 = 'http://localhost:8085/driver/details';
  constructor(private httpClient: HttpClient) { }

  getPosts(){
    return this.httpClient.get(this.url);
  }

  getVehicle(){
    return this.httpClient.get(this.url2);
  }

  getDriver(){
    return this.httpClient.get(this.url3);
  }
}
