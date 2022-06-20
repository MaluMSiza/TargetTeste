
import java.text.DecimalFormat;

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
        Double sp = 67836.43, rj = 36678.66, 
               mg = 29229.88, es = 27165.48,
               outros = 19849.53,
               total = 0.0;
       
        total = sp + rj + mg + es + outros;
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Porcentagens");
        System.out.println("SP "+fmt.format(sp*100/total)+"%");
        System.out.println("RJ "+fmt.format(rj*100/total)+"%");
        System.out.println("MG "+fmt.format(mg*100/total)+"%");
        System.out.println("ES "+fmt.format(es*100/total)+"%");
        System.out.println("Outros "+fmt.format(outros*100/total)+"%");
    }
}
