/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("dados.json");
            Scanner leitor = new Scanner(arquivo);

            StringBuilder jsonData = new StringBuilder();
            while (leitor.hasNextLine()) {
                jsonData.append(leitor.nextLine());
            }
            leitor.close();

            String jsonString = jsonData.toString();

            jsonString = jsonString.substring(1, jsonString.length() - 1); 
            String[] objetos = jsonString.split("\\},\\{"); 

            double[] faturamento = new double[objetos.length];

            for (int i = 0; i < objetos.length; i++) {
                String objeto = objetos[i].replace("{", "").replace("}", "").trim();
                String[] pares = objeto.split(",");
                for (String par : pares) {
                    if (par.contains("valor")) {
                        String valorStr = par.split(":")[1].trim();
                        faturamento[i] = Double.parseDouble(valorStr);
                    }
                }
            }

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            for (double valorDia : faturamento) {
                if (valorDia > 0) { 
                    if (valorDia < menorFaturamento) {
                        menorFaturamento = valorDia;
                    }
                    if (valorDia > maiorFaturamento) {
                        maiorFaturamento = valorDia;
                    }
                    somaFaturamento += valorDia;
                    diasComFaturamento++;
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;

            int diasAcimaDaMedia = 0;
            for (double valorDia : faturamento) {
                if (valorDia > 0 && valorDia > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento superior à média mensal: " + diasAcimaDaMedia);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}
