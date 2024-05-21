package Operações;
public class Op7 {

    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = false;

        if (cond1 && cond2){
            System.out.println("As duas concições são verdadeiras");
        }
        if (cond1 || cond2){
            System.out.println("Uma das condiçoes é verdadeiras");
        }
        System.out.println("Fim");
    }
}