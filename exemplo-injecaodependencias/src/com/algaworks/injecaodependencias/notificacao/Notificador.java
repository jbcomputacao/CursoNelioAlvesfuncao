package com.algaworks.injecaodependencias.notificacao;

import com.algaworks.injecaodependencias.modelo.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);

}
