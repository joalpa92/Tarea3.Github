import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("¿Que quieres hacer?" +
                "\n1.Imprimir Hola mundo" +
                "\n2.Imprime un numero aleatorio" +
                "\n3.Salir del programa");
        n=scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Hello world!");
                break;
            case 2:
                System.out.println(Math.random()*3);
                break;
            case 3:
                 System.out.println("Goodbye!!");
            case 4:
                System.out.println("Paco con P mayuscula");
            break;
        }
    }
}