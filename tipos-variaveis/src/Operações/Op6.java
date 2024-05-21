package Operações;
public class Op6 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        
        boolean simNao = n1 == n2;

        System.out.println("Numero um é igual a numero dois? " + simNao);
       
        simNao = n1 != n2;

        System.out.println("Numero um é diferente a numero dois? " + simNao);

        simNao = n1 > n2;

        System.out.println("Numero um é maior que numero dois? " + simNao);
    }
}
