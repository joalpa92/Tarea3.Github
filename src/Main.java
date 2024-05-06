import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("¿Que quieres hacer?\n1.Imprimir Hola mundo\n2.Salir del programa");
        n=scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Hello world!");
                break;
            case 2:
                System.out.println("Goodbye!!");
        }
    }
}