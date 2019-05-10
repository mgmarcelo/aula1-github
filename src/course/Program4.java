package course;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		int idFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("NUMBE = " + idFuncionario);
		System.out.printf("SALARY = U$ %.2f%n",  salario);
		
		
		 
		 System.out.println();
		 
		 sc.close();
		 

	}

}
