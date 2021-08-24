package com.algaworks.injecaodependencia;

import com.algaworks.injecaodependencias.modelo.Cliente;
import com.algaworks.injecaodependencias.notificacao.Notificador;
import com.algaworks.injecaodependencias.notificacao.NotificadorSMS;
import com.algaworks.injecaodependencias.service.AtivacaoClienteService;

public class Main {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao", "joao@xyz.com", "34999888");
		Cliente maria = new Cliente("Maria","maria@xyz.com", "1177885544");
		
		Notificador notificador =  new NotificadorSMS();
		
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
		
	}

}
