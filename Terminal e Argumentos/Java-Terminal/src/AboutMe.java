import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        

        System.out.println("Digite seu nome: ");
        Scanner scanner;
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobreNome = scanner.next();
    
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
    
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

   
        System.out.println("Olá, me chamo "+ nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("minha altura é " + altura + "cm ");
    }
}
