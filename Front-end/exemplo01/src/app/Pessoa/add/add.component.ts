import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Pessoa } from 'src/app/Modelo/pessoa';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Salvar(pessoa:Pessoa){
    this.service.createPessoa(pessoa)
    .subscribe(data=>{
      alert("Salvo com sucesso!");
      this.router.navigate(["listar"]);    
    })
  }
}
