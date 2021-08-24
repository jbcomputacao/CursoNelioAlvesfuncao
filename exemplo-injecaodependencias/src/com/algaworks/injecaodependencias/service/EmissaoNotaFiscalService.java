package com.algaworks.injecaodependencias.service;

import com.algaworks.injecaodependencias.modelo.Cliente;
import com.algaworks.injecaodependencias.modelo.Produto;
import com.algaworks.injecaodependencias.notificacao.NotificadorEmail;
import com.algaworks.injecaodependencias.notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService {
	
	public void emitir(Cliente cliente, Produto produto) {
		//TODO emite a nota fiscal aqui...
		
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.notificar(cliente, "Nota fiscal do produto"
				+ produto.getNome() + "foi emitido");
		
		//NotificadorSMS notificador = new NotificadorSMS();
		//notificador.notificar(cliente, "Nota fiscal do produto"
		//		+ produto.getNome() + "foi emitido");
		
		
		
	}

}
