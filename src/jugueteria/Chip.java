package jugueteria;

/**
 *
 * @author carme
 */
public class Chip implements Cloneable {

    private String id;
    private boolean encendido;

    //Constructores
    public Chip() {
        this.setId(id + 1);
        this.encendido = false;
    }

    public Chip(String i, boolean e) {
        this.setId(i);
        this.encendido = e;
    }

    public void apagarChip() {
        encendido = false;
    }

    //Metodos set y get
    private void setId(String i) {
        //matches comprueba que el string i contiene los caracteres entre corchetes
        if (i.matches("[a-zA-Z0-9]+")) {
            this.id = i;
        } else {
            System.out.println("Solo caracteres Alfanumericos. ");
        }
    }

    public void setEncendido() {
        if (this.encendido != true) {
            this.encendido = true;
            System.out.println("");
            System.out.println("Chip encendido... ");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("El chip ya esta encendido. ");
            System.out.println("");
        }
    }

    public String getid() {
        return this.id;
    }

    public boolean getEncendido() {
        return this.encendido;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "El id del chip es " + id + ". El encendido esta en " + encendido;
    }

    //Metodo clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = (Chip) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }

}
//Crear el chip con clientela y arreglar los metodos clone para que funcionen con
//clientela. El id de Chip debe ir con valores alfanumericos, hay que controlar que 
//sean alfanumericos.
