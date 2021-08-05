import java.text.DecimalFormat;
import java.util.Scanner;
public class imc {

   

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        System.out.println("Insira seu nome completo:  ");
        nome = ler.nextLine();
        
        System.out.println("Insira o peso:  ");
        float peso = ler.nextFloat();
        
        System.out.println("Insira a altura:  ");
        float altura = ler.nextFloat();
         
        float imc;
        imc = peso / (altura * altura);
        System.out.println( nome.toUpperCase() + " "   + new DecimalFormat(".##").format(imc));
         
    }
    
}
