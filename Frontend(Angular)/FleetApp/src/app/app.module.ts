import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SigninComponent } from './signin/signin.component';
import {Routes, RouterModule} from '@angular/router';
import { FullviewComponent } from './fullview/fullview.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


const appRoutes: Routes =[
  { path: '', component:SigninComponent},
  { path:'dashboard', component: DashboardComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    SigninComponent,
    FullviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
