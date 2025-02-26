import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable, timestamp } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ComicsService {
  private apiUrl = 'http://localhost:8080/api/comic';

  private password = '2c1b9ba1-a773-4fe4-a1e1-0b7741352409';

  constructor(private http: HttpClient) {}

  getCharacters(): Observable<any> {
    return this.http.get(`${this.apiUrl}/characters`, {
      headers: {
        Authorization: 'Basic ' + btoa('user:' + this.password),
      },
    });
  }

  getCharacterById(id: string): Observable<any> {
    return this.http.get(`${this.apiUrl}/characters/${id}?t=${Date.now()}`, {
      headers: {
        Authorization: 'Basic ' + btoa('user:' + this.password),
      },
    });
  }

  getLogs(): Observable<any> {
    return this.http.get(`${this.apiUrl}/logs`, {
      headers: {
        Authorization: 'Basic ' + btoa('user:' + this.password),
      },
    });
  }
}
