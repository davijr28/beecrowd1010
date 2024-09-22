import java.util.Scanner;
public class Beecrowd1010 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
       String sequencia1,sequencia2;
       String[] partes1,partes2;
       int code1,units1,code2,units2;
       float price1,price2,total;
       
       //ler as sequências e armazenar em string
       sequencia1 = leitor.nextLine();
       sequencia2 = leitor.nextLine();
       
       //dividir os valores de cada string
       partes1 = sequencia1.split(" ");
       partes2 = sequencia2.split(" ");
       
       //atribuir os valores da string para as variáveis
       code1 = Integer.parseInt(partes1[0]);
       units1 = Integer.parseInt(partes1[1]);
       price1 = Float.parseFloat(partes1[2]);
       code2 = Integer.parseInt(partes2[0]);
       units2 = Integer.parseInt(partes2[1]);
       price2 = Float.parseFloat(partes2[2]);
       
       //calcular o total
       total = price1*units1 + price2*units2;

        //mostrar resultado no console
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}