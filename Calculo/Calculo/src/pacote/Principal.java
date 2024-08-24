/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.util.Scanner;

/**
 *
 * @author eduardo.sfigueiredo2
 */
public class Principal {
    
    //Criando uma instancia//
    
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        double a, b, x, resto;
        
        Scanner leia = new Scanner(System.in);
        
            System.out.println("Digite o valor de A: ");
        a = leia.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        b = leia.nextDouble();
        
        
        System.out.println("Digite o valor de X: ");
        x = leia.nextDouble();
        
        System.out.println("A soma e: " + calc.soma(a, b));
        System.out.println("A diferença e: " + calc.diferenca(a, b));
        System.out.println("A some multiplicação: " + calc.mult(a, b));
        System.out.println("A some divisao: " + calc.div(a, b));
        
        //Chamando o método static//
        System.out.println("O dobro é: " +  Calculadora.elevado(x));
        
    }
    
    
      
    
    
    
}
