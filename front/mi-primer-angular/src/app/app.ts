import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserService } from './services/user.service/user.service';
import { JsonPipe } from '@angular/common';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, JsonPipe],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('mi-primer-angular');

  users: any[] = [];

  constructor(private userService: UserService, private cdRef: ChangeDetectorRef) {
    this.userService.getUsers().subscribe(data => {
      this.users = data;
      this.cdRef.detectChanges(); // Asegura que la vista se actualice
      console.log(this.users);
    });
  }
}
