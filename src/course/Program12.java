package course;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qtde = sc.nextInt();
		
		double total;
		if (cod == 1) {
			total = qtde * 4.0;

		} else if (cod == 2) {
			total = qtde * 4.5;
			
			
		} else if (cod == 3) {
			 total = qtde * 5.0;
		
			
		} else if (cod == 4) {
			total = qtde * 2.0;
			
		} else {
			
			
			total = qtde * 1.5;
				
				}
		
		System.out.printf("total = %.2f%n", total);
		
		sc.close();

	}
}
