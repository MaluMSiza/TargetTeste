
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

	Double FaturamentoMes[] = {22174.1664,24537.6698,
            26139.6134,0.0,0.0,26742.6612,0.0,42889.2258,
            46251.174,11191.4722,0.0,0.0,3847.4823,373.7838,
            2659.7563,48924.2448,18419.2614,0.0,0.0,35240.1826,
            43829.1667,18235.6852,4355.0662,13327.1025,0.0,0.0,
            25681.8318,1718.1221,13220.495,8414.61};
    
        int diasSup=0, diasCont=0;
        double maior = 0, menor, soma = 0,media;
        
        menor = FaturamentoMes[0];
        
        for(int i = 0; i<30;i++){
            if(FaturamentoMes[i]> maior){
                maior = FaturamentoMes[i];
             }
            if(FaturamentoMes[i]< menor && FaturamentoMes[i]!=0.0){
                menor = FaturamentoMes[i];
             }
            if(FaturamentoMes[i]!=0.0){
               diasCont++;
               soma = soma + FaturamentoMes[i];
            }   
        }
        media = soma / diasCont;
        
        for(int i = 0; i<30;i++){
            if(FaturamentoMes[i]> media){
             diasSup++;
            }   
        }
        
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês "+menor);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês "+maior);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal. "+diasSup);
    }
}