import java.util.Scanner;

public class exerc�cio4 {

	public static void main(String[] args) {
    Scanner leitor = new Scanner ( System.in);
		
		double x,y;
		int opr;
		
		System.out.println("Escreva dois n�meros\n");
		
		System.out.print("Primeiro: ");
		x=leitor.nextDouble();
		
		System.out.print("Segundo: ");
		y=leitor.nextDouble();
		System.out.println();
		
		System.out.println("Em sequ�ncia a opera��o desejada:\n");
	
		System.out.println("1- Soma");
		System.out.println("2- Subtra��o");
		System.out.println("3- Divis�o");
		System.out.println("4- Multiplica��o");
		opr=leitor.nextInt();
		
		switch (opr) {
		
	case 1:
		System.out.println("O resultado �: "+(x+y));
		break;
	case 2:
		System.out.println("O resultado �: "+(x-y));
		break;
	case 3 :
		System.out.println("O resultado �: "+(x/y));
		break;
	case 4 :	
		System.out.println("O resultado �: "+(x*y));
		break;
		
		default: System.out.println("N�o � poss�vel completar essa opera��o.");			
		}
	}
}


