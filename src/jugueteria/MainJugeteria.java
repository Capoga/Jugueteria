package jugueteria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carme
 */
public class MainJugeteria {

    public static void main(String[] args) {
        Bebes be = new Bebes();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("------------------------");
            System.out.println("------ Jugueteria ------");
            System.out.println("------------------------");
            System.out.println("1. Encender chip");
            System.out.println("2. Dormir");
            System.out.println("3. Despertar");
            System.out.println("4. Comer");
            System.out.println("5. Beber");
            System.out.println("6. Tipo de muñeco");
            System.out.println("7. Salir");
            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        be.setEncendido();
                        break;
                    case 2:
                        System.out.println(be.dormir());
                        break;
                    case 3:
                        System.out.println(be.despertar());
                        break;
                    case 4:
                        System.out.println(be.comer());
                        break;
                    case 5:
                        System.out.println(be.beber());
                        break;
                    case 6:
                        System.out.println(be.soyUn());
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }

}
