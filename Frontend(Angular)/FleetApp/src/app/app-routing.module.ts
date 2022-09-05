import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SigninComponent } from './signin/signin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FullviewComponent } from './fullview/fullview.component';

const routes: Routes = [
  {path:'', component:SigninComponent},
  {path:'dashboard', component:DashboardComponent},
  {path:'fullview', component:FullviewComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents =[DashboardComponent]