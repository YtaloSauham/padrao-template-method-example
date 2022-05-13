package Relatorio;

public class RelatorioSimples extends Relatorio {
	
	public RelatorioSimples(String titular,float saldo) {
		
		this.titular=titular;
		this.saldo=saldo;
		
	}
	
	
	public String imprimirRelatorio() {
		String mensagem ="";
		mensagem +="Titular:" + this.titular +"\n";
		mensagem +="Saldo:" + this.saldo +"\n";
		return mensagem;
	}

}
