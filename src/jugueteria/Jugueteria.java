package jugueteria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carmeloportesgarcia
 */
public class Jugueteria {

    private static String nombre = "Muñecos SL";
    private static ArrayList<Muñecos> almacen = new ArrayList<Muñecos>();

    public static void main(String[] args) {
//___________________________CARGAMOS LOS DATOS DEL FICHERO EN EL ARRAYLIST
        try {
            //Abrir el archivo en modo lectura
            FileReader fr = new FileReader("Muñecos SL");
            //Crear bufer de lectura
            BufferedReader br = new BufferedReader(fr);
            String linea;
            System.out.println("");
            //Mostrar todas las lineas hasta el final del fichero
            while ((linea = br.readLine()) != null) {
                if (linea.equals("Muñeco")) {
                    Muñecos m = new Muñecos(Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            Integer.parseInt(br.readLine()), br.readLine());
                    almacen.add(m);
                } else if (linea.equals("Bebe")) {
                    Bebes b = new Bebes(Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            br.readLine(), Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()));
                    almacen.add(b);
                } else if ((linea.equals("Animal salvaje")) || (linea.equals("Animal domestico"))) {
                    Animales a = new Animales(Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            br.readLine(), Boolean.parseBoolean(br.readLine()));
                    almacen.add(a);
                } else if (linea.equals("Perro")) {
                    Perro p = new Perro(Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            br.readLine(), Boolean.parseBoolean(br.readLine()));
                    almacen.add(p);
                } else if (linea.equals("Gato")) {
                    Gato g = new Gato(Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Boolean.parseBoolean(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            Integer.parseInt(br.readLine()),
                            br.readLine(), Boolean.parseBoolean(br.readLine()));
                    almacen.add(g);
                }
            }
            //Cerrar el archivo
            br.close();
        } catch (java.io.FileNotFoundException fnfex) {
        } catch (java.io.IOException ioex) {
        }
//____________________CARGA MENU PRINCIPAL_____________________________

        menuPrincipal();

//____________________GUARDAMOS LOS DATOS DEL ARRAYLIST EN EL FICHERO
        try {
            //Abrir archivo en modo escritura
            FileWriter fw = new FileWriter("Muñecos SL");
            //Crear buffer de escritura
            BufferedWriter bw = new BufferedWriter(fw);
            //Para que funcione el println
            PrintWriter salida = new PrintWriter(bw);
            //Escribe con salto de linea
            for (int i = 0; i < almacen.size(); i++) {
                salida.println(almacen.get(i).soyUn());
                salida.println(almacen.get(i).getOjosAbiertos());
                salida.println(almacen.get(i).getBoca());
                salida.println(almacen.get(i).getSueño());
                salida.println(almacen.get(i).getHambriento());
                salida.println(almacen.get(i).getSediento());
                salida.println(almacen.get(i).getid());
                if (almacen.get(i) instanceof Bebes) {
                    salida.println(((Bebes) almacen.get(i)).getTriste());
                    salida.println(((Bebes) almacen.get(i)).getContento());
                }
                if (almacen.get(i) instanceof Animales) {
                    salida.println(((Animales) almacen.get(i)).getTipo());
                }
            }
            //Cerrar archivo
            salida.close();
        } catch (java.io.IOException ioex) {

        }
    }

    public static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("------------------------");
            System.out.println("------ " + nombre + " ------");
            System.out.println("------------------------");
            System.out.println("¿Que quieres hacer? ");
            System.out.println("1. Crear un muñeco tipo Bebé ");
            System.out.println("2. Crear un muñeco tipo Animal ");
            System.out.println("3. Cuantos Bebes hay");
            System.out.println("4. Cuantos Perros hay");
            System.out.println("5. Cuantos Gatos hay");
            System.out.println("6. Cuantos Animales en total");
            System.out.println("7. Cuantos Animales sin especificar");
            System.out.println("8. Listar muñecos del almacen");
            System.out.println("9. Interactuar");
            System.out.println("10. Salir");

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
                        System.out.println(getNumBebes());
                        break;
                    case 4:
                        System.out.println(getNumPerros());
                        break;
                    case 5:
                        System.out.println(getNumGatos());
                        break;
                    case 6:
                        System.out.println(getNumAnimalesTotales());
                        break;
                    case 7:
                        System.out.println(getNumAnimalesSinEspecificar());
                        break;
                    case 8:
                        menuListaMuñecos();
                        break;
                    case 9:
                        System.out.println("Indica el numero de la posicion del muñeco con el que quiere interactuar: ");
                        int aux = sn.nextInt();
                        menuInteractuar(almacen.get(aux));
                        break;
                    case 10:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 10");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }

    public static int getNumBebes() {
        int b = 0;
        for (int i = 0; i < almacen.size(); i++) {
            if ((almacen.get(i)) instanceof Bebes) {
                b++;
            }
        }
        return b;
    }

    public static int getNumPerros() {
        int p = 0;
        for (int i = 0; i < almacen.size(); i++) {
            if ((almacen.get(i)) instanceof Perro) {
                p++;
            }
        }
        return p;
    }

    public static int getNumGatos() {
        int g = 0;
        for (int i = 0; i < almacen.size(); i++) {
            if ((almacen.get(i)) instanceof Gato) {
                g++;
            }
        }
        return g;
    }

    public static int getNumAnimalesTotales() {
        int a = 0;
        for (int i = 0; i < almacen.size(); i++) {
            if ((almacen.get(i)) instanceof Animales) {
                a++;
            }
        }
        return a;
    }

    public static int getNumAnimalesSinEspecificar() {
        int a = 0;
        for (int i = 0; i < almacen.size(); i++) {
            if ((almacen.get(i)) instanceof Animales) {
                a++;
            }
        }
        return (a - (getNumGatos() + getNumPerros()));
    }

    public static void menuListaMuñecos() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("");
            System.out.println("----__ " + nombre + " __----");
            System.out.println("");
            System.out.println("¿Como quieres listarlos? ");
            System.out.println("1. Listarlos todos ");
            System.out.println("2. Listarlos por estado ");
            System.out.println("3. Listar los animales por tipo ");
            System.out.println("4. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        listaTodosMuñecos();
                        break;
                    case 2:
                        menuListaJuguetesEstado();
                        break;

                    case 3:
                        menuListaAnimalesTipo();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }

    public static void listaTodosMuñecos() {
        System.out.println("");
        System.out.println("----__ " + nombre + " __----");
        System.out.println("");
        for (int i = 0; i < almacen.size(); i++) {
            System.out.println((almacen.get(i).toString()));
        }
    }

    //Hay que pasarle el estado (s) y la condicion del estado (e)
    public static void listaJuguetesEstado(String s, boolean e) {
        System.out.println("");
        System.out.println("----__ " + nombre + " __----");
        System.out.println("");
        for (int i = 0; i < almacen.size(); i++) {
            if (s.equals("Encendido") && (almacen.get(i).getEncendido()) == e) {
                System.out.println(almacen.get(i).toString());
            } else if (s.equals("Ojos abiertos") && (almacen.get(i).getEncendido()) == e) {
                System.out.println(almacen.get(i).toString());
            } else if (s.equals("Boca abierta") && (almacen.get(i).getEncendido()) == e) {
                System.out.println(almacen.get(i).toString());
            } else if (s.equals("Sueño") && (almacen.get(i).getEncendido()) == e) {
                System.out.println(almacen.get(i).toString());
            }
        }
    }

    public static void menuListaJuguetesEstado() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        boolean es = false;
        String s = "";
        while (!salir) {
            System.out.println("");
            System.out.println("----__ " + nombre + " __----");
            System.out.println("");
            System.out.println("Elige una opcion:");
            System.out.println("1. Encendido ");
            System.out.println("2. Ojos abiertos ");
            System.out.println("3. Boca abierta ");
            System.out.println("4. Sueño ");
            System.out.println("5. Salir ");
            try {
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        s = "Encendido";
                        salir = true;
                        break;
                    case 2:
                        s = "Ojos abiertos";
                        salir = true;
                        break;
                    case 3:
                        s = "Boca abierta";
                        salir = true;
                        break;
                    case 4:
                        s = "Sueño";
                        salir = true;
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
        salir = false;
        while (!salir) {
            System.out.println("");
            System.out.println("----__ " + nombre + " __----");
            System.out.println("");
            System.out.println("Elige una opcion:");
            System.out.println("1. True ");
            System.out.println("2. False ");
            System.out.println("3. Salir ");
            try {
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        es = true;
                        salir = true;
                        break;
                    case 2:
                        es = false;
                        salir = true;
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
        listaJuguetesEstado(s, es);
    }

    public static void listaAnimalesTipo(String s) {
        System.out.println("");
        System.out.println("----__ " + nombre + " __----");
        System.out.println("");
        for (int i = 0; i < almacen.size(); i++) {
            if (almacen.get(i).soyUn().equals(s)) {
                System.out.println(almacen.get(i).toString());
            }
        }
    }

    public static void menuListaAnimalesTipo() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String s = "";
        while (!salir) {
            System.out.println("");
            System.out.println("----__ " + nombre + " __----");
            System.out.println("");
            System.out.println("Elige una opcion:");
            System.out.println("1. Perro ");
            System.out.println("2. Gato ");
            System.out.println("3. Sin especificar ");
            System.out.println("4. Salir");
            try {
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        s = "Perro";
                        salir = true;
                        break;
                    case 2:
                        s = "Gato";
                        salir = true;
                        break;
                    case 3:
                        s = "Sin especificar";
                        salir = true;
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
        listaAnimalesTipo(s);
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
            System.out.println("");
            System.out.println("----__ " + nombre + " __----");
            System.out.println("");
            System.out.println("¿Que tipo de Animal quieres? ");
            System.out.println("1. Perro ");
            System.out.println("2. Gato ");
            System.out.println("3. Sin especificar ");
            System.out.println("4. Salir");
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
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }

    public static void menuInteractuar(Muñecos aux) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("------------------------");
            System.out.println("------ " + nombre + "------");
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
