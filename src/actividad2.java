import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resultado;

        System.out.println("Ingrese su primer número");
        int nmr1 = scanner.nextInt();

        System.out.println("Ingrese su segundo número");
        int nmr2 = scanner.nextInt();

        System.out.println("¿Qué operacion desea realizar? (s(suma), r(resta), m(multiplicación), d(división))");
        String operacion = scanner.next();

        if (operacion.equals("s")){
            resultado = nmr1+nmr2;
            System.out.println("El total de la suma es " + resultado);
        }
        else {
            if (operacion.equals("r")){
                resultado = nmr1-nmr2;
                System.out.println("El total de la resta es " + resultado);
            }
            else {
                if (operacion.equals("m")){
                    resultado = nmr1*nmr2;
                    System.out.println("El total de la multiplicación es " + resultado);
                }
                else {
                    if (operacion.equals("d")){
                        resultado = nmr1/nmr2;
                        System.out.println("El total de la división es " + resultado);
                    }
                }
            }
        }

        scanner.close();
    }
}
