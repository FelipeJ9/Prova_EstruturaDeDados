package exercicio2;

public class Main {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		// inser��o dos dados na fila -- ok 
		fila.enfileirar(new Motorista("Selmini", "ABC-4546"));
		fila.enfileirar(new Motorista("Flavio", "BYZ-7576"));
		fila.enfileirar(new Motorista("Surjan", "BBB-1234"));
		fila.enfileirar(new Motorista("Surian", "DDD-7777"));
		
		// remo��o de alguns motoristas da fila -- ok 
		fila.desenfileirar();
		fila.desenfileirar();
		
		// impress�o dos dados dos motoristas que ainda est�o na fila -- ok 
		fila.mostrarDados();		

	}
}
