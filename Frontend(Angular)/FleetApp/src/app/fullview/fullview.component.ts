import { Component, OnInit } from '@angular/core';
import { ReportService } from '../report.service';
@Component({
  selector: 'app-fullview',
  templateUrl: './fullview.component.html',
  styleUrls: ['./fullview.component.css']
})
export class FullviewComponent implements OnInit {

  drivers:any;
  
  constructor(private service: ReportService) {
    
   }

  ngOnInit(): void {
    this.service.getDriver()
        .subscribe(response => {
          this.drivers = response;
        });
  }

}
