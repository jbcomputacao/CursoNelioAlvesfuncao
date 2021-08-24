package com.algaworks.injecaodependencias.service;

import com.algaworks.injecaodependencias.modelo.Cliente;
import com.algaworks.injecaodependencias.notificacao.Notificador;


public class AtivacaoClienteService{
	
	 
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
	}
	
	public void ativar (Cliente cliente) {
		cliente.Ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");
	}


}
