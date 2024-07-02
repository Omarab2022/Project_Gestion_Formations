import { Component, OnInit } from '@angular/core';
import { CondidatService } from '../../../Services/condidat.service';
import { Candidat } from '../../../Models/candidat.model';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-candidat',
  templateUrl: './candidat.component.html',
  styleUrl: './candidat.component.css'
})
export class CandidatComponent implements OnInit{


  public candidats: any;

  constructor(private candidatservice : CondidatService) { }

  ngOnInit(): void {
   
    this.getAllCandidats();
 
  }


  getAllCandidats(){

    this.candidatservice.getCondidats().subscribe( {
      next: value => {
  
        this.candidats = value;
        console.log('Received data:', value);
      },
  
      error: (error) => {
        console.log(error);
      }
    });
  }


  onDelete(id: any) {
    Swal.fire({
      title: 'Êtes-vous sûr?',
      text: "Cette action est irréversible!",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Oui, supprimer!',
      cancelButtonText: 'Annuler'
    }).then((result) => {
      if (result.isConfirmed) {
        this.candidatservice.deleteCondidat(id).subscribe({
          next: (response) => {
            console.log(response);
            this.getAllCandidats();
            Swal.fire(
              'Supprimé!',
              'Le candidat a été supprimé.',
              'success'
            );
          },
          error: (error) => {
            console.error(error);
            Swal.fire(
              'Erreur!',
              'Une erreur est survenue lors de la suppression.',
              'error'
            );
          }
        });
      }
    });
  }


}
