import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int resultado,numero;
	
		String op;
		
		resultado = 0;
		numero = 0;
		op = "";
		
		System.out.print("digite um numero:\n");
		
		try {
			resultado = input.nextInt();
			
		} catch (Exception e) {
			System.out.println("invalid number");
			return;
			
		}

		while(true){
			
			System.out.println("escolha a opeção:\n+)soma\n-)subtração\n*)multiplicação\n/)divisão\n=)resultado");
			op = input.next();
			
			if (op.equalsIgnoreCase("=")) {
				break;
			}
			
			System.out.print("digite um numero:\n");
			
			try {
				numero = input.nextInt();
				
			} catch (Exception e) {
				System.out.println("invalid number");
				return;
				
			}
			
			switch (op) {
			case "+": {
				resultado = resultado + numero;
			break;			
				}
			case "-": {
				resultado = resultado - numero;
			break;			
				}
			case "*": {
				resultado = resultado * numero;
			break;			
				}
			case "/": {
				resultado = resultado / numero;
			break;
				}	
			case "=": {
				resultado = resultado / numero;
			break;
				}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
				
		}
		} 
			
		System.out.println(resultado);
	}
}
