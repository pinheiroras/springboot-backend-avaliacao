package br.com.evandrocustodio.aula01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.evandrocustodio.aula01.models.Despesa;
import br.com.evandrocustodio.aula01.services.ServiceDespesas;

@Controller
@RequestMapping(path = "/despesas")
@CrossOrigin(origins = "*")
public class ControlDespesas {

	@Autowired
	ServiceDespesas despesas;

	@GetMapping
	public ResponseEntity<List<Despesa>> listaDesesa() {
		return new ResponseEntity<List<Despesa>>(this.despesas.getDespesas(), HttpStatus.OK);
	}
}
	