package course;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 int d = sc.nextInt();
		 
		 int direfenca =  (a * b - c * d);
		 
		 System.out.println("DIFERENCA = " + direfenca);
		 
		 sc.close();
		 

	}

}
