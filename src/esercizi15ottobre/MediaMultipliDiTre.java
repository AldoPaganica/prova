package esercizi15ottobre;
import java.util.Scanner;

public class MediaMultipliDiTre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?");
      int num = input.nextInt();
      int somma = 0;
      int media = 0;
      boolean x = false;
      int j = 0;
      for ( int i = 0; i < num; i++) {
    	  int n = input.nextInt();
      x = (n % 3 == 0);
     if(x) {
    	 somma += n;
    	 j++;
    	 media = somma / j;
     }
      }
      System.out.println(media);
}
}