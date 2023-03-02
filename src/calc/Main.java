package calc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double num[] = new Double[3];
		Scanner in = new Scanner(System.in);
			int operador = 0;
			
		System.out.println("\n                     escolha a Operacao \n\n 1 = divisao"
				+ "| 2 = multiplicacao | 3 = subtracao | 4 = adicao");
		operador = in.nextInt();
		
		System.out.println("Digite o primeiro Numero");
		num[0] = in.nextDouble();
		
		System.out.println("Digite o segundo Numero");
		num[1] = in.nextDouble();
		
		if(operador == 1)
			num[2] = divisao(num[0],num[1]);
		if(operador == 2)
			num[2] = multiplicacao(num[0],num[1]);
		if(operador == 3)
			num[2] = subtracao(num[0],num[1]);
		if(operador == 4)
			num[2] = adicao(num[0],num[1]);
		System.out.println(NumberFormat.getInstance().format(num[2]));
	}
	public static Double divisao(Double num_1, Double num_2) {
		return num_1 / num_2;
	}
	public static Double multiplicacao(Double num_1, Double num_2) {
		return num_1 * num_2;
	}
	public static Double subtracao(Double num_1, Double num_2) {
		return num_1 - num_2;
	}
	public static Double adicao(Double num_1, Double num_2) {
		return num_1 + num_2;
	}

}
