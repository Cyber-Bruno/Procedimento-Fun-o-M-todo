import java.util.Scanner;

public class exerc�cio2 {

public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int x,y;
		int soma=0;
		
		System.out.print("Digite um n�mero:");
		x=leitor.nextInt();
		
		System.out.print("Digite outro n�mero:");
		y=leitor.nextInt();
		
		if (x < y) {
			
			do {
			
			soma=x+soma;
			x++;
		
			}while (x < y);
		
		
		System.out.println("A soma dos n�meros interios de um ao outro � igual �: "+(soma+y));}
		
		if(x > y) {
		
			do {
				
			soma=y+soma;
			y++;
			
			}while (y<x);
		
			System.out.println("A soma dos n�meros interios de um ao outro � igual �: "+(soma+x));
			
		}			
}
    }