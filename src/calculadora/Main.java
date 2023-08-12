package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instaciar: Criar a existencia de um ou mais objeto(no caso calculator foi criado como a primeira calculadora).
		Calculator calculator = new Calculator();
		
		
		// Menu com sistema de input.
		String menu;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\nMenu");
            System.out.println("[+] Add a number");
            System.out.println("[-] Subtract a number");
            System.out.println("[*] Multiply a number");
            System.out.println("[/] Divide a number");
            System.out.println("S-End");
            menu = scanner.nextLine();
            
            switch (menu) {
	            case "+": {
	            	System.out.println("Enter two numbers:");
                    double num1 = scanner.nextInt();
                    double num2 = scanner.nextInt();
                    scanner.nextLine();
                    double result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
	            }
	            
	            case "-": {
	            	System.out.println("Enter two numbers:");
                    double num1 = scanner.nextInt();
                    double num2 = scanner.nextInt();
                    scanner.nextLine();
                    double result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
	            }
	            
	            case "*": {
	            	System.out.println("Enter two numbers:");
	            	double num1 = scanner.nextInt();
	            	double num2 = scanner.nextInt();
	            	scanner.nextLine();
	            	double result = num1 * num2;
	            	System.out.println("Result: " + result);
	            	break;
	            }
	            
	            case "/": {
	            	System.out.println("Enter two numbers:");
	            	double num1 = scanner.nextInt();
	            	double num2 = scanner.nextInt();
	            	scanner.nextLine();
	            	double result = num1 / num2;
	            	System.out.println("Result: " + result);
	            	break;
	            }
            }
            
		} while (!menu.equalsIgnoreCase("S"));
 		
		System.out.println("Finalizando Calculadora.....");
		scanner.close();
		
	}
	

}
