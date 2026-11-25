package calculadora;
/**
 * Classe responsável por executar testes funcionais da calculadora
 * utilizando entradas predefinidas.
 *
 * Verifica o funcionamento das operações de soma, subtração,
 * multiplicação e divisão, além de testar situações de erro,
 * como divisão por zero e operações inválidas.
 *
 * Os resultados dos testes são apresentados no console,
 * permitindo comparar o comportamento obtido com o esperado.
 * 
 * @author Enzo Koga
 * @version 1.0
 * 
 * Teste da calculadora com entradas pre-definidas
 */
public class TesteCalculadora {
    
    /**
     * Método principal responsável por executar os testes
     * das operações matemáticas e das situações de erro.
     *
     * Utiliza valores predefinidos como entrada e apresenta
     * no console as operações realizadas e seus resultados.
     *
     * @param args argumentos recebidos pela linha de comando
     */

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("-=TESTE DA CALCULADORA=-");
        
        //Teste de soma
        System.out.println("\nTeste de soma");
        System.out.println("10 + 5");
        System.out.println("Resultado = " + calculadora.calc(10,5, "+"));
        
        //Teste de subtração
        System.out.println("\nTeste de subtração");
        System.out.println("10 - 5");
        System.out.println("Resultado = " + calculadora.calc(10,5, "-"));
        
        //Teste de multiplicação
        System.out.println("\nTeste de multiplicação");
        System.out.println("10 * 5");
        System.out.println("Resultado = " + calculadora.calc(10,5, "*"));
        
        //Teste de divisão
        System.out.println("\nTeste de divisão");
        System.out.println("10 / 5");
        System.out.println("Resultado = " + calculadora.calc(10,5, "/"));
        
        //Teste de erro: Divisão por zero
        System.out.println("\nTeste de divisão por zero");
        System.out.println("10 / 0");
        System.out.println("Resultado = " + calculadora.calc(10,0, "/"));
        
        //Teste de erro: Operação inválida
        System.out.println("\nTeste de operação inválida");
        System.out.println("10 % 5");
        System.out.println("Resultado = " + calculadora.calc(10,5, "%"));
        
    }    
}
