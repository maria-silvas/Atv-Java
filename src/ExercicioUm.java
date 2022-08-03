import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {

            case 1:
                // media(double notaUm, double notaDois, double notaTres)
                 // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`
                 double notaUm = 1.5;
                 double notaDois = 5.0;
                 double notaTres = 10; 

                 media (notaUm,notaDois,notaTres);
                
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            // area(double ladoUm, double ladoDois)
            case 2:
                double ladoUm = 1;
                double ladoDois=3;
                double area = area (ladoUm , ladoDois);
              
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
               // volume(double largura, double altura, double profundidade)
            case 3:
                 double largura=10;
                 double altura=30;
                 double profundidade=40;

                 double volume=  volume (largura,altura,profundidade);

                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
             // valorMaiorQueDobro(double base, double verificar)
            case 4:
                double base = 40;
                double verificar = 50;

              boolean valormaior =  valorMaiorQueDobro(base,verificar);
              System.out.println(valormaior);
   
                break;
            case 5:
                // bhaskara(int a, int b, int c);
                // 5) Crie um programa que calcule _bhaskara_
                int a;
                int b;
                int c;

                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
             // mediaViagem(double distancia, double tempo)
            case 6:
                
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            // percentualImposto(double faturamento, double qtdImposto)
            case 7:
            double faturamento = 1000;
            double qtdImposto = 50;
            double percentualImposto =  percentualImposto (faturamento / qtdImposto)
         
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                // parOuImpar(int valor)
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) { //1
        
        double media = (notaUm +notaDois + notaTres ) /3; 
    
        return  media;
    }


    public static double area(double ladoUm, double ladoDois){ //2
      double area =  (ladoUm * ladoDois);
        return area;
    }


    public static double volume(double largura, double altura, double profundidade) { //3
      double volume= (largura * altura * profundidade);
       
        return volume;
    }


    public static boolean valorMaiorQueDobro(double base, double verificar) { //4 
    
        if((base*2) > verificar){
            System.out.println("maior que dobro");
            return true ;
         }else{
            System.out.println("Menor que o dobro");
            return false;
         }
    
      
    
    }


    public static double[] bhaskara(int a, int b, int c) { //5

        return new double[2];
    }


    public static double mediaViagem(double distancia, double tempo) { //6
        return 0;
    }


    public static double percentualImposto(double faturamento, double qtdImposto) { //7
        
        return 
    }


    public static boolean parOuImpar(int valor) { //8
        return false;
    }


    public static boolean compareString(String stringUm, String stringDois) {//8
        return false;
    }


    public static int convertString(String valor) { //9
        return 0;
    }



    public static double percentualImpostoSalario(double salario) { //10
        return -1;
    }


    public static boolean testePrimo(int valor) { //11
        return false;
    }


}