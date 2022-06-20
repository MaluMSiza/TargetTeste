
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
    System.out.println("Digite a string");
    String palavra = ler.nextLine();
    char[] caracters = palavra.toCharArray();
    int inicio = 0;
    int fim = caracters.length-1;
    char aux;
    
         while(fim>inicio){
	        aux = caracters[inicio];
	        caracters[inicio] = caracters[fim];
	        caracters[fim] = aux;
	        fim--;
	        inicio++;
	    }
	    String strInversa = new String(caracters);
	    System.out.println(strInversa);
	}
        
}
