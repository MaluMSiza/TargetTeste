/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class main {
    
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
    public static void main(String[] args) {

	boolean encontrado=false;
        int index=0;
        long numero;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número que deseja encontrar");
        numero = ler.nextLong();
        
        while(fibo(index)<=numero)
	{
            if(fibo(index)==numero){
                encontrado = true;
                System.out.print("O número "+numero+" pertence a sequência de Fibonacci");
            }
            index++;
            
        }
            if(!encontrado){
                System.out.print("O número "+numero+" não pertence a sequência de Fibonacci");
            }
    }
}
