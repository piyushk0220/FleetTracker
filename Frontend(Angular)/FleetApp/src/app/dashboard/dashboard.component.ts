import { Component, OnInit } from '@angular/core';
import { Loader } from '@googlemaps/js-api-loader';
import { styles } from '../mapstyles';
import { ReportService } from '../report.service';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {


  data:any;
  vehicle:any;
  private map: google.maps.Map
  constructor(private service: ReportService) { }

  ngOnInit(): void {
    let loader = new Loader({
      apiKey: 'AIzaSyCPOx5INqvqehg94aio805LK73QLi-q1Bg',
    });

    loader.load().then(() => {
      console.log('loaded gmaps')

      const location = { lat: 35.17287917, lng:-114.0595564 }
      const location2 = { lat:35.57404306, lng:-114.0810342 }
      const location3 = { lat:35.87500083, lng:-114.0915661}

      this.map = new google.maps.Map(document.getElementById("map"), {
        center: location,
        zoom: 6,
        styles:styles
      })
      console.log('loaded styles')
      const marker = new google.maps.Marker({
        position: location,
        map: this.map,
      })
      const marker2 = new google.maps.Marker({
        position: location2,
        map: this.map,
    })
    const marker3 = new google.maps.Marker({
      position: location3,
      map: this.map,
  })
  const infoWindowOptions ={
    content:'Testing info window ',
    position:location
  }
  const infoWindow = new google.maps.InfoWindow(infoWindowOptions)
  const infoWindowopenOptions = {
    map: this.map
  }


  infoWindow.open(infoWindowopenOptions);
      
    })

    this.service.getPosts()
        .subscribe(response => {
          this.data = response;
        })
    this.service.getVehicle()
    .subscribe(response => {
      this.vehicle = response;
    })
    
  }
  

}
