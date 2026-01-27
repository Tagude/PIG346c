import { Component } from '@angular/core';
/* Librerias */
import { UserService } from '../../../services/user.service/user.service';
import { CommonModule, JsonPipe } from '@angular/common';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-user.component',
  imports: [JsonPipe, CommonModule],
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
})
export class UserComponent {
//signals 

  users : any[] = [];

  constructor(private userService: UserService, private cdr: ChangeDetectorRef) {
    this.userService.getUsers().subscribe((data: any) => {
      this.users = data;
      console.log(this.users);
      this.cdr.detectChanges();
    });
  }
}
