import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pessoa } from '../Modelo/pessoa';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  
  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/exemplo01/pessoas';

  getPessoas(){
    return this.http.get<Pessoa[]>(this.Url)
  }
}
