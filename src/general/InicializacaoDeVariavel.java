package general;

public class InicializacaoDeVariavel {

	public static void main(String[] args) {
		inicializacao();
	}
	
	public static void inicializacao() {
		int x;
		x=0; //sem inicializacao nao compila.
		
		for (int i=0; i<10; i++) {
			x = x + i;
			System.out.println("O valor de x eh: "+ x);
		}
	}

}
