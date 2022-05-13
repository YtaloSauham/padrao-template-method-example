package Relatorio;

public class RelatorioComplexo extends Relatorio {

		
		public RelatorioComplexo(String titular,String banco,float saldo,String agencia,String conta) {
			
			this.titular=titular;
			this.banco=banco;
			this.saldo=saldo;
			this.agencia=agencia;
			this.conta=conta;
		}
		
		
		public String imprimirRelatorio() {
			String mensagem ="";
			mensagem +="Titular:" + this.titular+"\n";
			mensagem +="Saldo:" + this.saldo +"\n";
			mensagem +="banco:" + this.banco +"\n";
			mensagem +="agencia:" + this.agencia +"\n";
			mensagem +="conta:" + this.conta +"\n";
			
			return mensagem;
		}

	

}
