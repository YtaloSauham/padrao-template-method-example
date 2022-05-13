package demo;

import Relatorio.Relatorio;
import Relatorio.RelatorioComplexo;
import Relatorio.RelatorioSimples;

public class Main {
	  public static void main(String[] args) {
		  Relatorio relatorioSimples = null;
		  Relatorio relatorioComplexo = null;
		  String titular="Fulana";
		  String banco="Brasil";
		  String agencia="9999-9";
		  String conta = "99999";
		  float saldo = 5823;
		  
		  relatorioSimples = new RelatorioSimples(titular,saldo);
		  relatorioComplexo = new RelatorioComplexo(titular,banco,saldo,agencia,conta);
		  
		  System.out.println(relatorioSimples.imprimirRelatorio());
		  System.out.println(relatorioComplexo.imprimirRelatorio());
		
		
	  }
}
