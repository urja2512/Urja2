import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'src/app/service/user.service'; 

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userService:UserService,private snack:MatSnackBar) { }
   
  public user={
    username:'',
    password:'',
    name:'',
    email:'',
    phone:'',

  };

  ngOnInit(): void {
  }
  formSubmit(){
    console.log(this.user );
    if(this.user.username=='' ||this.user.username==null){
      //alert('User is required');
      this.snack.open('username is required!!','ok')
      return;
    }
    if(this.user.password=='' ||this.user.password==null){
      //alert('userpassword is required');
      this.snack.open('password is required!!','ok')
      return;
    }
    if(this.user.name=='' ||this.user.name==null){
      //alert('User is required');
      this.snack.open('name is required!!','ok')
      return;
    }
   
    if(this.user.email=='' ||this.user.email==null){
      //alert('User is required');
      this.snack.open('email is required!!','ok')
      return;
    }
    if(this.user.phone=='' ||this.user.phone==null){
      //alert('User is required');
      this.snack.open('phone is required!!','ok')
      return;
    }
    this.userService.addUser(this.user).subscribe(
      (data)=>{
        //success
        console.log(data);
        alert("Success");
        
      },
      (error)=>{
        //error
        console.log(error);
        //alert("error! Something");
        this.snack.open('something went wrong!!','ok')
      }
    )
  }
}
