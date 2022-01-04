import java.util.Scanner;

public class Numeros_pimos {

	public static void main(String[] args) {
		boolean numPrimo = true;
		int numero;
		Scanner tc = new Scanner(System.in);
		while (true) {
		   System.out.println("Digite um numero positivo");
		   numero = tc.nextInt();	
		   if (numero < 0) {
			  System.out.println("Numero invalido!");
		   } else {
			   break;
		   }
		}
		if (numero > 3) {
			for (int numDiv = 2; numDiv < 8; ++numDiv) {
			    if ( numero % numDiv == 0) {	
			    	numPrimo = false;
			    	break;
			    }
			    if (numDiv > 2) {
			    	numDiv += 1;
			    }
		    }	
		} else if (numero < 2) {
			numPrimo = false;
		}
		if (numPrimo) {
			System.out.println("NUmero digitado é primo!");
		} else {
			System.out.println("NUmero digitado não é primo!");
		}
		tc.close();
	}

}
