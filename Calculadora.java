import java.util.Scanner; 

	public class Calculadora{

        public static void main(String args[]){
	
	Scanner entrada = new Scanner(System.in);
	
	int num1;
	int num2;
	int op;
	int soma, subtra��o, multiplica��o, divis�o; 
	
	 
	
	System.out.print("Digite o primeiro valor: ");
	num1 = entrada.nextInt();
	
	System.out.println("Qual a opera��o?");
	System.out.println("[1] Soma");
	System.out.println("[2] Subtra��o");
	System.out.println("[3] Multiplica��o");
	System.out.println("[4] Divis�o");
	System.out.print ("Selecione uma opera��o: ");
	
	op = entrada.nextInt();
	
	
	System.out.print("Digite o segundo valor: ");
	num2 = entrada.nextInt();
	
	switch (op){
		
		case 1: soma=num1+num2;
		System.out.print("O resutado �: " + soma);
		break;
		case 2:subtra��o=num1-num2;
		System.out.print("O resutado �: " + subtra��o);
		break;
		case 3:multiplica��o=num1*num2;
		System.out.print("O resutado �: " + multiplica��o);
		break;
		case 4:divis�o=num1/num2;
		System.out.print("O resutado �: " + divis�o);
		break;
		
    }	 
	
}	
}