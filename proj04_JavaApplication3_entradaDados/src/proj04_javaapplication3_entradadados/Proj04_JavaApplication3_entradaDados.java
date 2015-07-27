/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj04_javaapplication3_entradadados;

import java.util.Scanner;


/**
 *
 * @author roney
 */
public class Proj04_JavaApplication3_entradaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in) ;
        
        System.out.print("Qual o nome ?");
        String nome = teclado.nextLine() ; // metodo para ler TEXTO
        
        System.out.print("Entre com a nota :");
        float nota = teclado.nextFloat(); // metodo para ler FLOAT
        
        System.out.format("A nota de %s eh %.1f \n", nome, nota);
    }
    
}
