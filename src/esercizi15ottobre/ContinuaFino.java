package esercizi15ottobre;
import java.util.Scanner;

public class ContinuaFino {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		boolean x;
		int somma = 0;
	do {
		System.out.println("inserisci un numero: ");
		int n = input.nextInt();
	   x = ( n <0 && n %2==0) || ( n >=0 && n %3==0);
		if(x) somma+=n;
	} while (x);
	
	System.out.println(somma);
	}
	
}
