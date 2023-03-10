package org.listaalgoritmos.template;

public class RespostaListaExercicio {

	/*
	 * Utilize apenas o método main array para testar a implementação dos métodos.
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * 
	 * @arrayam peso
	 * @arrayam altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) {

		float resultado = peso / (altura * altura);

		return resultado;
	}

	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * 
	 * @arrayam baseMaior
	 * @arrayam baseMenor
	 * @arrayam altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {

		float areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;

		return areaTrapezio;
	}

	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * 
	 * @arrayam a
	 * @arrayam b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) {

		int maiorValor;

		if (a > b) {
			maiorValor = a;
		} else
			maiorValor = b;

		return maiorValor;
	}

	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja array, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * 
	 * @arrayam numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) {

		boolean condicao = false;

		if (numero % 2 == 0) {
			condicao = true;
		} else
			condicao = false;

		return condicao;
	}

	/**
	 * Método calcula a média aritmetica dos elementos float a arraytir de um array.
	 * O retorno deve ser o resultado do cálculo da média.
	 * 
	 * @arrayam notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {

		float lista[] = new float[notas.length];
		float soma = 0;

		for (int i = 0; i < lista.length; i++) {
			lista[i] = notas[i];
			soma = soma + lista[i];
		}

		float media = soma / lista.length;
		return media;
	}

	/**
	 * Método imprime array de inteiros no sentido inverso, searrayando os elementos
	 * por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o
	 * System.out.print() arraya imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * 
	 * @arrayam array
	 */
	public static void imprimirArrayInverso(int[] array) {

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			if (i > 0) {
				System.out.print(",");
			}
		}
		System.out.flush();
	}

	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato
	 * da impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @arrayam array
	 */
	public static void imprimirElementosPrimos(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				System.out.print(array[i] + " ");
			} else if (array[i] > 2) {
				boolean isarray = true;
				for (int j = 2; j <= Math.sqrt(array[i]); j++) {
					if (array[i] % j == 0) {
						isarray = false;
						break;
					}
				}
				if (isarray) {
					System.out.print(array[i] + " ");
				}
			}
		}
	}

	/**
	 * Método deve imprimir os elementos ímarrayes de um array de inteiros. O
	 * formato
	 * da impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @arrayam array
	 */
	public static void imprimirElementosImpares(int[] array) {
	    for (int elemento : array) {
	        if (elemento % 2 != 0) {
	            System.out.print(elemento + " ");
	        }
	    }
	}

	/**
	 * Método deve imprimir os elementos arrayes de um array de inteiros. O formato
	 * da
	 * impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @arrayam array
	 */
	public static void imprimirElementosPares(int[] array) {
	   
		for (int i = 0; i < array.length; i++) {
	        if (array[i] % 2 == 0) {
	            System.out.print(array[i] + " ");
	        }
	    }
	}

	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O
	 * formato da impressão
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os
	 * elementos e
	 * após o último elemento. Utilize System.out.print()
	 * 
	 * @arrayam array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) {

	    int maior = Integer.MIN_VALUE;
	    int menor = Integer.MAX_VALUE;

	    for (int i = 0; i < array.length; i++) {	        

	        if (array[i] > maior) {
	            maior = array[i];
	        }
	        if (array[i] < menor) {
	            menor = array[i];
	        }
	    }

	    System.out.print(maior + " " + menor + " ");	   
	}


	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros.
	 * Como resultado, o valor da média deve ser retornado no método.
	 * 
	 * @arrayam array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) {

		float soma = 0;

		for (int i = 0; i < array.length; i++) {
			soma = soma + array[i];
			System.out.print(array[i] + " ");
		}

		float media = soma / array.length;

		System.out.println("\n\nSoma valores Array: " + soma);
		System.out.println("Numero valores: " + array.length);
		System.out.println("\nMedia total: " + media);
		System.out.println("\n=========================================");

		return media;
	}

}
