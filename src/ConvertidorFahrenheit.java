import java.util.Scanner;

public class ConvertidorFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese grados Cent�grados");
		
		int C=sc.nextInt();
		
		System.out.println("Equivale a " + (C*(1.8)+32) + "� Fahrenheit");
	}

}
