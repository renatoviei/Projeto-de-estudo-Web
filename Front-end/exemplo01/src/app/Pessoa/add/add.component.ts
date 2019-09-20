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

  prepararParaGuardar(nome: String, apelidos: String){
    var pessoa = new Pessoa(nome, apelidos);
    this.salvar(pessoa);
  }


  salvar(pessoa: Pessoa ){
    this.service.createPessoa(pessoa).subscribe( value => {
      alert("Pessoa adicionada com sucesso!")
      this.router.navigate(["listar"]);
    })
  }
}
