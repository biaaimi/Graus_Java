package exercicios;
import java.util.Scanner;

public class Graus {

	public static void main(String[] args) {
	   
		Scanner input= new Scanner(System.in);
		
		double C,F;
		
		System.out.print("Digite a temperatura em graus celsius: ");
		C= input.nextDouble();
		
		F= (9*C + 160)/5;
		
		System.out.print("A temperatura convertida para Fahrenheit é: "+F);
		

	}

}
