package esercizi15ottobre;
import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci una sequenza di numeri: ");
		boolean x = false;
		int n = 1;
		while (n != 0) {
			n = input.nextInt();
			int z = n;
			if( z>0 && n<0 ) x = true;
		}
		
		if(x) System.out.println("OK");
		else System.out.println("NO");

	}

}
