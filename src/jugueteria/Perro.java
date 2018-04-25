package jugueteria;

/**
 *
 * @author carme
 */
public class Perro extends Animales implements Cloneable {

    //Constructores
    public Perro() {
        super();
    }

    public Perro(boolean oj, boolean bo, boolean su, int h, int s, String i, boolean ti) {
        super(oj, bo, su, h, s, i, ti);
    }

    //Acciones
    public String ladrar() {
        return "GUAU";
    }

    @Override
    public String soyUn() {
        return "Perro";
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() + ". PERRO";
    }

    //Metodo clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = (Perro) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
