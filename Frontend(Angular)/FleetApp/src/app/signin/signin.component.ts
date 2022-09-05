import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserloginService } from '../userlogin.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  user: User = new User();

  constructor(private userloginservice: UserloginService,
    private router: Router) { }

  ngOnInit(): void {
  }

  userLogin() {
    console.log(this.user)
    this.userloginservice.loginUser(this.user).subscribe(Logindata => {

      console.log("User credentials verified successfully")
      this.router.navigate(['/', 'dashboard']);
    }, error => alert("User Authorization Failed")
    );
  }

}
