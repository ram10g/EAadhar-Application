import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { AdminServiceService } from '../admin-service.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  signupForm!: FormGroup;
  admin:Admin=new Admin();
  constructor(private adminServ:AdminServiceService, private router: Router,private fb: FormBuilder) { }

  ngOnInit(): void {this.signupForm = this.fb.group({
    uName: 'admin1234',
    pass: 'pass@1234'
  });
  }
  onSubmit() {
    if(this.signupForm.value.uName=="admin" && this.signupForm.value.pass=="Qwerty@098!"){
      this.router.navigate(['/adminpage']);
    }
    else{
      alert("Invalid credentials");
    }
  }

}
