import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su primer número");
        int nmr1 = scanner.nextInt();

        System.out.println("Ingrese su segundo número");
        int nmr2 = scanner.nextInt();

        System.out.println("¿Qué operacion desea realizar? (s(suma), r(resta), m(multiplicación), d(división))");
        String operacion = scanner.next();

        int resultado = 0;
        boolean operacionValida=true;

        switch (operacion) {
            case "s":
                resultado=nmr1+nmr2;
                break;
            case "r":
                resultado=nmr1-nmr2;
                break;
            case "m":
                resultado=nmr1*nmr2;
                break;
            case "d":
                if (nmr2!=0){
                    resultado=nmr1/nmr2;
                }
                else {
                    System.out.println("No se puede dividir entre 0");
                    operacionValida=false;
                }
                break;
            default:
                System.out.println("Operación no valida");
                operacionValida=false;

        }
        if (operacionValida) {
            System.out.println("El resultado de la operación es: " + resultado);
        }



    }
}
