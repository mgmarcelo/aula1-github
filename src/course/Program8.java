package course;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		
		
		if (numero < 0) {
			System.out.println(" NEGATIVO");
		} 
		else {
			
			System.out.println("NAO NEGATIVO ");
		}

		sc.close();

	}
}
