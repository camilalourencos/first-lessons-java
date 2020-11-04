public class exercicioIR {
	public static void main(String[] args) { 
		
		//Lesson# 11 - Alura Course
		//O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota. Ele descobriu no site da receita:

	    //De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
	    //De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
	    //De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
	    
		double salario = 3300.0;
		String frase = "A alíquota do IR é de ";
		String frase2 = " e pode deduzir na declaração o valor de ";
		
		if(salario >= 1900.0 && salario <= 2800.00) {
			System.out.println(frase+"7.5%"+frase2+"R$ 142.");
			
		}else if (salario >= 2800.01 && salario <= 3751.0){
			System.out.println(frase +"15%"+frase2+"R$ 350.");
			
		}else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println(frase+"22.5%"+frase2+"R$ 636.");
		}
		
		
	}
}
