import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("==ICIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Area                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Calculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salArio                   |");
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
            // 2) Crie um programa que calcule a Area (`lado1 * lado2`)
            // area(double ladoUm, double ladoDois)
            case 2:
                double ladoUm = 1;
                double ladoDois=3;
                double area = area (ladoUm , ladoDois);
              System.out.println(area);
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
               // volume(double largura, double altura, double profundidade)
            case 3:
                 double largura=10;
                 double altura=30;
                 double profundidade=40;

                 double volume=  volume (largura,altura,profundidade);
                 System.out.println(volume);

                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            // valorMaiorQueDobro(double base, double verificar)

            case 4:
                double base = 7;
                double verificar = 4;

              boolean valormaior =  valorMaiorQueDobro(base,verificar);
              System.out.println(valormaior);
   
                break;

             // bhaskara(int a, int b, int c);
            // 5) Crie um programa que calcule _bhaskara_
            // double delta =(b*b)
            case 5:
            int a = 6 ;
            int b = 8;
            int c = 10;  
            bhaskara(a, b, c);       
            
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
             // mediaViagem(double distancia, double tempo)
            case 6:
            double distancia  = 40 ;
            double tempo = 60 ;
            double mediaViagem = mediaViagem(distancia,tempo);
            System.out.println(mediaViagem);
                
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            // percentualImposto(double faturamento, double qtdImposto)
            case 7:
            double faturamento = 1000;
            double qtdImposto = 50;
            double percentualImposto =  percentualImposto(faturamento , qtdImposto);
            System.out.println(percentualImposto);

            // 8) Crie um programa que teste se um valor é par ou ímpar
            // parOuImpar(int valor)
            case 8:
             int valorr= 9;
             parOuImpar(valorr);
 

                break;
            // 9) Crie um programa que compare dois valores Strings
            // compareString(String stringUm, String stringDois)
            case 9:
            String stringum ="stringUM";
            String stringdois ="StringDois";
            compareString(stringum,stringdois);

            
                
                break;
            // 10) Crie um programa que tenha uma variAvel com ponto em String e converta seu valor para inteiro
            // convertString(String valor);
             // convertString(String valor);
            case 10:
            String stringumm ="10.5";
            convertString(stringumm);
            break;


            // 11) Crie um programa que receba o salArio e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            // percentualImpostoSalario(double salario);
            case 11:
                Double salario "";
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação invAlida");
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
    
        if((verificar*2) < base){
            System.out.println("maior que dobro");
            return true ;
         }else{
            System.out.println("Menor que o dobro");
            return false;
         }
    
      
    
    }


    public static double[] bhaskara(int a, int b, int c) { //5
    
   double delta = (b*b) - (4*a*c);
   double raiz = Math.sqrt(delta);

   double[] x = new double [2];
     x[0]=( ((b*(-1) )+ raiz) / (2*a));
     x[1]=( ((b*(-1) )- raiz) / (2*a));


        return x;
    }


    public static double mediaViagem(double distancia, double tempo) { //6
       double mediaViagem = (distancia / tempo  ) ; //6
        return mediaViagem;

    }


    public static double percentualImposto(double faturamento, double qtdImposto) {
        double pago = (faturamento / qtdImposto) ; //7
       
        return pago;
    }


    public static boolean parOuImpar(int valor) { //8
        
      if ((valor %2) == 0){
         return true;
      }else 
      return false;
       
    }


    public static boolean compareString(String stringUm, String stringDois) {//9
    if(stringUm.equals(stringDois)){
        return true;   
    }else {
         return false;

    }
  
    }


    public static int convertString(String valor) {//10
        double valorDuble = Double.parseDouble (valor);
        int valorint =(int) valorDuble;
        return valorint; 
     
    }



    public static double percentualImpostoSalario(double salario) { //11

        return -1;
    }


    public static boolean testePrimo(int valor) { //12
        return false;
    }


}