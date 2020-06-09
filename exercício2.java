import java.util.Scanner;

public class exercício2 {

public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int x,y;
		int soma=0;
		
		System.out.print("Digite um número:");
		x=leitor.nextInt();
		
		System.out.print("Digite outro número:");
		y=leitor.nextInt();
		
		if (x < y) {
			
			do {
			
			soma=x+soma;
			x++;
		
			}while (x < y);
		
		
		System.out.println("A soma dos números interios de um ao outro é igual á: "+(soma+y));}
		
		if(x > y) {
		
			do {
				
			soma=y+soma;
			y++;
			
			}while (y<x);
		
			System.out.println("A soma dos números interios de um ao outro é igual á: "+(soma+x));
			
		}			
}
    }