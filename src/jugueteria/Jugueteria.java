package jugueteria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carmeloportesgarcia
 */
public class Jugueteria {

    private static String nombre;
    private static ArrayList<Muñecos> almacen = new ArrayList<Muñecos>();

    public static void nuevoMuñeco() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("------------------------");
            System.out.println("------ " + nombre + " ------");
            System.out.println("------------------------");
            System.out.println("¿Que tipo de muñeco quieres? ");
            System.out.println("1. Bebé ");
            System.out.println("2. Animal ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        nuevoBebe();
                        break;
                    case 2:
                        nuevoAnimal();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 9");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }

    public static void nuevoBebe() {
        Bebes b = new Bebes();
        almacen.add((Bebes) (b));
        System.out.println("Muñeco tipo Bebé creado con exito. ");
    }

    public static void nuevoAnimal() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("¿Que tipo de Animal quieres? ");
            System.out.println("1. Perro ");
            System.out.println("2. Gato ");
            System.out.println("3. Sin especificar ");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Perro p = new Perro();
                        almacen.add((Perro) (p));
                        System.out.println("Muñeco tipo Perro creado con exito. ");
                        break;
                    case 2:
                        Gato g = new Gato();
                        almacen.add((Gato) (g));
                        System.out.println("Muñeco tipo Gato creado con exito. ");
                        break;
                    case 3:
                        Animales a = new Animales();
                        almacen.add((Animales) (a));
                        System.out.println("Muñeco tipo Animal sin especificar creado con exito. ");
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }
}
