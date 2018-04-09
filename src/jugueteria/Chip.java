package jugueteria;

/**
 *
 * @author carme
 */
public class Chip implements Cloneable {

    private int id;
    private boolean encendido;

    //Constructores
    public Chip() {
        this.id = id + 1;
        this.encendido = false;
    }

    public Chip(boolean e) {
        this.id = id + 1;
        this.encendido = e;
    }

    public void apagarChip() {
        encendido = false;
    }

    //Metodos set y get
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

    public int getid() {
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
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }

}
