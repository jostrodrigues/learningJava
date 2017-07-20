package br.com.cdraentregacerta.adega.visao;

import javax.swing.JOptionPane;

import br.com.cdraentregacerta.adega.modelo.Armazem;
import br.com.cdraentregacerta.adega.modelo.Transportadora;
import br.com.cdraentregacerta.adega.modelo.Vinho;
import br.com.cdraentregacerta.adega.modelo.Vinicola;

public class Wms {
	
	public static void main(String[] args) {

		Transportadora transportadora = new Transportadora();
		transportadora.nome = JOptionPane.showInputDialog("Informe o Nome da Transportadora");
		transportadora.estado = JOptionPane.showInputDialog("Informe o estado da transportadora");

		Vinicola vinicola = new Vinicola();
		vinicola.fundacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de funda��o da Vin�cola"));
		vinicola.nome = JOptionPane.showInputDialog("Informe o nome da Vin�cola");
		vinicola.pais = JOptionPane.showInputDialog("Informe o pa�s de origem da vin�cola");

		Armazem endereco1 = new Armazem();
		endereco1.rua = JOptionPane.showInputDialog("Informe a rua do armaz�m");
		endereco1.predio = Integer.parseInt(JOptionPane.showInputDialog("Informe o pr�dio da rua"));
		endereco1.apto = Integer.parseInt(JOptionPane.showInputDialog("Informe o apto do pr�dio"));

		endereco1.vinho = new Vinho();
		endereco1.vinho.nome = JOptionPane.showInputDialog("Informe o nome do vinho");
		endereco1.vinho.safra = Integer.parseInt(JOptionPane.showInputDialog("Informe a safra do vinho"));
		endereco1.vinho.tipo = JOptionPane.showInputDialog("Informe o tipo de Vinho");
		endereco1.vinho.vinicola = vinicola;
		endereco1.vinho.transportadora = transportadora;

		Armazem endereco2 = new Armazem();
		endereco2.rua = JOptionPane.showInputDialog("Informe a rua do armaz�m");
		endereco2.predio = Integer.parseInt(JOptionPane.showInputDialog("Informe o pr�dio da rua"));
		endereco2.apto = Integer.parseInt(JOptionPane.showInputDialog("Informe o apto do pr�dio"));

		endereco2.vinho = new Vinho();
		endereco2.vinho.nome = JOptionPane.showInputDialog("Informe o nome do vinho");
		endereco2.vinho.safra = Integer.parseInt(JOptionPane.showInputDialog("Informe a safra do vinho"));
		endereco2.vinho.tipo = JOptionPane.showInputDialog("Informe o tipo de Vinho");
		endereco2.vinho.vinicola = vinicola;
		endereco2.vinho.transportadora = transportadora;
		
		String texto = "Rua: " + endereco1.rua + " Pr�dio: " + endereco1.predio + " Apto: " + endereco1.apto + " Vinho: " + endereco1.vinho.nome + " Vin�cola: " + endereco1.vinho.vinicola.nome + 
				" Foi entregue por: " + transportadora.nome + "\n";
		texto = texto + "Rua: " + endereco2.rua + " Pr�dio: " + endereco2.predio + " Apto: " + endereco2.apto + " Vinho: " + endereco2.vinho.nome + " Vin�cola: " + endereco2.vinho.vinicola.nome + 
				" Foi entregue por: " + transportadora.nome ;
		JOptionPane.showMessageDialog(null, texto);

	}
}
