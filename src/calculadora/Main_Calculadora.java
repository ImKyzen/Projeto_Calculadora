package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principal responsável pela execução da aplicação.
 * Apresenta um menu interativo ao usuário, recebe os valores
 * informados, valida as entradas e utiliza a classe Calculadora
 * para realizar as operações matemáticas.
 * 
 * @author Enzo Koga
 * @version 2.0
 */
public class Main_Calculadora {
    
    /**
     * Método principal responsável por iniciar a aplicação.
     * Exibe o menu de opções, permite ao usuário realizar cálculos
     * ou encerrar o programa e trata entradas inválidas por meio
     * de InputMismatchException.
     *
     * @param args argumentos recebidos pela linha de comando
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        double a, b, resultado;
        String operador = "";
        Calculadora calculadora = new Calculadora();

        do {
            try {
                System.out.println("\n====- Calculadora Simples -===="
                        + "\nSelecione uma opção"
                        + "\n\nCalcular - [1]"
                        + "\nSair     - [2]");
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números");
                scanner.nextLine();
            }
            switch (option) {
                case 1:
                    try {
                        System.out.println("\nDigite o primeiro número");
                        a = scanner.nextDouble();
                        System.out.println("\nDigite o segundo número");
                        b = scanner.nextDouble();
                        System.out.println("\nDigite uma operação");
                        operador = scanner.next();
                        resultado = calculadora.calc(a, b, operador);
                        if (!Double.isNaN(resultado)) {
                            System.out.println("\nResultado: " + resultado);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Digite apenas números");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Saindo");
                    option = 2;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (option != 2);
    }
}

