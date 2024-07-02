import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Candidat } from '../Models/candidat.model';

@Injectable({
  providedIn: 'root'
})
export class CondidatService {

  constructor(private http : HttpClient) { }

  public getCondidats():Observable<Array<Candidat>>{
    return this.http.get<Array<Candidat>>("http://localhost:8080/candidats");
  }

  public deleteCondidat(id: number):Observable<any>{
    return this.http.delete("http://localhost:8080/deletecandidats/"+id);
  }
}
