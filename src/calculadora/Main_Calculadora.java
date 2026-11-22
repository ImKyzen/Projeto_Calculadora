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
 * @version 1.0
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
        Scanner scn = new Scanner(System.in);
        int option = 0;
        double a, b, resultado;
        String opt = "";
        Calculadora calculadora = new Calculadora();

        do {
            try {
                System.out.println("\n====- Calculadora Simples -===="
                        + "\nSelecione uma opção"
                        + "\n\nCalcular - [1]"
                        + "\nSair     - [2]");
                option = scn.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números");
                scn.nextLine();
            }
            switch (option) {
                case 1:
                    try {
                        System.out.println("Digite o primeiro número");
                        a = scn.nextDouble();
                        System.out.println("Digite o segundo número");
                        b = scn.nextDouble();
                        System.out.println("Digite uma operação");
                        opt = scn.next();
                        resultado = calculadora.calc(a, b, opt);
                        if (!Double.isNaN(resultado)) {
                            System.out.println("Resultado: " + resultado);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Digite apenas números");
                        scn.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Saindo");
                    option = 2;
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (option != 2);
    }
}

