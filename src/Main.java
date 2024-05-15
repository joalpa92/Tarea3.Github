import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("¿Que quieres hacer?" +
                "\n0.¿Jugamos a adivinar un numero?" +
                "\n1.Imprimir Hola mundo" +
                "\n2.Imprime un numero aleatorio" +
                "\n3.Salir del programa");
        n=scanner.nextInt();
        switch (n){
            case 0:
                AdivinarNumero();
                break;
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
    private static void  AdivinarNumero (){
        System.out.println("Aun no implementado");
    }
}
