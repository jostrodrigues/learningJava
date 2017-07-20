package br.com.cdraentregacerta.jetcolor.visao;

import javax.swing.JOptionPane;

import br.com.cdraentregacerta.jetcolor.modelo.DespachoEncomenda;
import br.com.cdraentregacerta.jetcolor.modelo.Destino;
import br.com.cdraentregacerta.jetcolor.modelo.Encomenda;
import br.com.cdraentregacerta.jetcolor.modelo.Origem;
import br.com.cdraentregacerta.jetcolor.modelo.Tarifa;
import br.com.cdraentregacerta.jetcolor.modelo.TipoTarifa;

public class Entrega {
	
	public static void main(String[] args) {
		
		Origem origemEncomenda = new Origem();
		origemEncomenda.rua = JOptionPane.showInputDialog("Informe a rua de origem");
		origemEncomenda.numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da rua de origem"));
		origemEncomenda.complemento = JOptionPane.showInputDialog("Informe o complemento do endereço de origem");
		origemEncomenda.pontoReferencia = JOptionPane.showInputDialog("Informe o ponto de referência do endereço de origem");
		origemEncomenda.remetente = JOptionPane.showInputDialog("Informe o nome do remetente");
		
		Destino destinoEncomenda = new Destino();
		destinoEncomenda.rua = JOptionPane.showInputDialog("Informe a rua de Destino");
		destinoEncomenda.numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da rua de Destino"));
		destinoEncomenda.complemento = JOptionPane.showInputDialog("Informe o complemento do endereço de Destino");
		destinoEncomenda.pontoReferencia = JOptionPane.showInputDialog("Informe o ponto de referência do endereço de Destino");
		destinoEncomenda.destinatario = JOptionPane.showInputDialog("Informe o nome do destinatário");
		
		Encomenda encomenda = new Encomenda();
		encomenda.pesoEmGrama = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da sua encomenda"));
		encomenda.volumeMetroCubico = Float.parseFloat(JOptionPane.showInputDialog("Informe o volume da sua encomenda"));
		encomenda.valorDaEncomenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da sua encomenda"));
		
		DespachoEncomenda despacho = new DespachoEncomenda();
		despacho.origem = origemEncomenda;
		despacho.destino = destinoEncomenda;
		despacho.encomenda = encomenda;
		despacho.tarifa = new Tarifa();
		despacho.tarifa.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da tarifa"));
		String opcaoTarifa = JOptionPane.showInputDialog("Informe 0 para Promocional e 1 para Comum");
		if (opcaoTarifa.equals("0")) {
			despacho.tarifa.tipoTarifa = TipoTarifa.PROMOCIONAL;			
		} else {
			despacho.tarifa.tipoTarifa = TipoTarifa.COMUM;			
		}
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("Endereço de Origem\n");
		mensagem.append("\tRemetente: ").append(despacho.origem.remetente).append("\n");
		mensagem.append("\tRua: ").append(despacho.origem.rua).append("\n");
		mensagem.append("\tNumero: ").append(despacho.origem.numero).append("\n");
		mensagem.append("\tComplemento: ").append(despacho.origem.complemento).append("\n");
		mensagem.append("\tPonto de Referência: ").append(despacho.origem.pontoReferencia).append("\n");
		
		mensagem.append("Endereço de Destino\n");
		mensagem.append("\tDestinatário: ").append(despacho.destino.destinatario).append("\n");
		mensagem.append("\tRua: ").append(despacho.destino.rua).append("\n");
		mensagem.append("\tNumero: ").append(despacho.destino.numero).append("\n");
		mensagem.append("\tComplemento: ").append(despacho.destino.complemento).append("\n");
		mensagem.append("\tPonto de Referência: ").append(despacho.destino.pontoReferencia).append("\n");
		
		mensagem.append("Encomenda\n");
		mensagem.append("\tPeso: ").append(despacho.encomenda.pesoEmGrama).append("\n");
		mensagem.append("\tVolume: ").append(despacho.encomenda.volumeMetroCubico).append("\n");
		mensagem.append("\tValor: ").append(despacho.encomenda.valorDaEncomenda).append("\n");
		
		mensagem.append("Dados\n");
		mensagem.append("\tValor cobrado: ").append(despacho.tarifa.valor).append("\n");
		mensagem.append("\tTarifa: ").append(despacho.tarifa.tipoTarifa).append("\n");		
		
		JOptionPane.showMessageDialog(null, mensagem.toString(), "Entrega", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
