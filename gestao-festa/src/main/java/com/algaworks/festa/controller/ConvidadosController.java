package com.algaworks.festa.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ConvidadosController {
	
    @GetMapping("/convidados")
	public String listar() {
		return "ListaConvidados";
		

	}

}
