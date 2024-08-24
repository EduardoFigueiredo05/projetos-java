/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import javax.xml.transform.Source;

/**
 *
 * @author eduardo.sfigueiredo2
 */
public class Calculadora {
     
    public /*tipo do método - */ double /* nome do método -> */ soma /* passando as instruções para o método */(double x, double y){
        
        
        //Retorna o valor da função para a classe principal//
        return x + y;
    }
             
    public  double  diferenca (double x, double y){
        
        return x - y;
    }
    
    
    public  double  mult (double x, double y){
        
        return x * y;
    }
             
    
    public  double  div (double x, double y){
        
        return x / y;
    }
         
        
    
        public void exponecia (double x ){
            
            double expo = Math.pow(x, 2);
            
            System.out.println("O valor elevado ao quadrado é: " + expo);
        }
       
        public static double elevado(double x) {
            
          return x*2;
            
    }
    
        
    
}
