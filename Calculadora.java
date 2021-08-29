import java.util.Scanner; 

	public class Calculadora{

        public static void main(String args[]){
	
	Scanner entrada = new Scanner(System.in);
	
	int num1;
	int num2;
	int op;
	int soma, subtração, multiplicação, divisão; 
	
	 
	
	System.out.print("Digite o primeiro valor: ");
	num1 = entrada.nextInt();
	
	System.out.println("Qual a operação?");
	System.out.println("[1] Soma");
	System.out.println("[2] Subtração");
	System.out.println("[3] Multiplicação");
	System.out.println("[4] Divisão");
	System.out.print ("Selecione uma operação: ");
	
	op = entrada.nextInt();
	
	
	System.out.print("Digite o segundo valor: ");
	num2 = entrada.nextInt();
	
	switch (op){
		
		case 1: soma=num1+num2;
		System.out.print("O resutado é: " + soma);
		break;
		case 2:subtração=num1-num2;
		System.out.print("O resutado é: " + subtração);
		break;
		case 3:multiplicação=num1*num2;
		System.out.print("O resutado é: " + multiplicação);
		break;
		case 4:divisão=num1/num2;
		System.out.print("O resutado é: " + divisão);
		break;
		
    }	 
	
}	
}