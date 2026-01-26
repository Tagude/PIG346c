import { Injectable } from '@angular/core';
/* importar HttpClient */
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private http: HttpClient) {}

  /* método para obtener usuarios */
  getUsers() {
    return this.http.get<any[]>('users.json');
  }
}
