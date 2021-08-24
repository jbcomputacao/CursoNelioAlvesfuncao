package com.algaworks.injecaodependencias.notificacao;

import com.algaworks.injecaodependencias.modelo.Cliente;

public class NotificadorSMS implements Notificador {
	
	public void notificarS(Cliente cliente, String mensagem) {
		
		System.out.printf("Notificando %s por SMS através do telefone %s: %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		// TODO Auto-generated method stub
		
	}

}
