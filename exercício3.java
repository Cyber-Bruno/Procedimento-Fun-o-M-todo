import java.util.Scanner;

public class exerc�cio3 {

	public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
		
		double x,y,k,z;
		
		System.out.println("Digite suas 4 notas e descubra se est� aprovado!");
		
		System.out.print("1� nota:");
		x=leitor.nextDouble();
		
	    System.out.print("2� nota:");
		y=leitor.nextDouble();
		
		System.out.print("3� nota:");
		k=leitor.nextDouble();
		
		System.out.print("4� nota:");
		z=leitor.nextDouble();
		
		if((x+y+k+z)/4 >=7) {
			
			System.out.println("Sua m�dia � "+(x+y+k+z)/4+" est� APROVADO!");
		}
		
		else {
			System.out.println("Sua m�dia � "+(x+y+k+z)/4+" est� REPROVADO!");
		}		
}
	}
