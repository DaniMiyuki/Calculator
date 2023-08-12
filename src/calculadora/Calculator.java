package calculadora;

/*
 * ---->   Constructor   <------
 * 1 Inicialização: Quando você deseja configurar o estado inicial dos objetos ao serem criados.
 * 2 Dependências: Se a classe precisar de dependências externas para funcionar corretamente, você pode passá-las como argumentos para o construtor.
 * 3 Configuração: Quando você precisa configurar certos parâmetros ou valores iniciais que são importantes para o funcionamento da classe.
 * 4 Validações: Se houver validações que precisam ser feitas durante a criação do objeto, um construtor é um bom lugar para implementá-las.
 */

public class Calculator {
	private double result;
	
	// Creating a initial state of object when it is turned ON.
	public Calculator() {
		result = 0;
		
	}
	public void add(double value) {
		result += value;
	}
	
	public void subtract(double value) {
		result -= value;
	}
	
	public void multiply(double value) {
		result *= value;
	}
	
	public void divide(double value) {
		if (value !=0) {
			result /= value;
		}else {
			System.out.println("Cannot divide by zero.");
		}
	}
	
	public double getResult() {
		return result;
	}
	
}
