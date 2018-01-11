import java.util.Scanner;

public class ConvertidorCentigrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese grados Fahrenheit");
		
		int F=sc.nextInt();
		
		System.out.println("Equivale a " + ((F-32)/1.8) + "º Centígrados");
	}

}
