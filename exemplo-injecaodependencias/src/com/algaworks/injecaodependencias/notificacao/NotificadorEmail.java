package com.algaworks.injecaodependencias.notificacao;

import com.algaworks.injecaodependencias.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	

	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificação %s através do e-mail %s: %s\n0",
				         cliente.getNome(),cliente.getEmail(), mensagem);
		
		
	}

	

}
