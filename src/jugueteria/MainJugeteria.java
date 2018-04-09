package jugueteria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carme
 */
public class MainJugeteria {

    public static void main(String[] args) throws CloneNotSupportedException {
        Muñecos be = new Bebes();
        Muñecos be1 = (Bebes) be.clone();
        Muñecos an = new Animales();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        Muñecos aux = be;//Para agilizar el cambio de objetos en el menú
        
        while (!salir) {
            System.out.println("------------------------");
            System.out.println("------ Jugueteria ------");
            System.out.println("------------------------");
            System.out.println("1. Encender chip");
            System.out.println("2. Dormir");
            System.out.println("3. Despertar");
            System.out.println("4. Comer");
            System.out.println("5. Beber");
            System.out.println("6. Emitir sonido");
            System.out.println("7. Tipo de muñeco");
            System.out.println("8. Apagar chip");
            System.out.println("9. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        aux.setEncendido();
                        break;
                    case 2:
                        System.out.println(aux.dormir(aux));
                        System.out.println("----------------------------------");
                        System.out.println("Hambriento: " + aux.getHambriento());
                        System.out.println("Sediento: " + aux.getSediento());
                        System.out.println("__________________________________");
                        break;
                    case 3:
                        System.out.println(aux.despertar(aux));
                         System.out.println("----------------------------------");
                        System.out.println("Hambriento: " + aux.getHambriento());
                        System.out.println("Sediento: " + aux.getSediento());
                        System.out.println("___________________________________");
                        break;
                    case 4:
                        System.out.println(aux.comer(aux));
                         System.out.println("----------------------------------");
                        System.out.println("Hambriento: " + aux.getHambriento());
                        System.out.println("Sediento: " + aux.getSediento());
                        System.out.println("___________________________________");
                        break;
                    case 5:
                        System.out.println(aux.beber(aux));
                        System.out.println("----------------------------------");
                        System.out.println("Hambriento: " + aux.getHambriento());
                        System.out.println("Sediento: " + aux.getSediento());
                        System.out.println("___________________________________");
                        break;
                    case 6:
                        System.out.println(aux.emiteSonido(aux));
                        break;
                    case 7:
                        System.out.println(aux.soyUn());
                        break;
                    case 8:
                        System.out.println(aux.apagarChipMuñeco());
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
}
