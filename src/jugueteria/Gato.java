package jugueteria;

/**
 *
 * @author carme
 */
public class Gato extends Animales implements Cloneable {

    //Constructores
    public Gato() {
        super();
    }

    public Gato(boolean oj, boolean bo, boolean su, int h, int s, String i, boolean ti) {
        super(oj, bo, su, h, s, i, ti);
    }

    //Acciones
    public String maullar() {
        return "MIAAUU";
    }

    @Override
    public String soyUn() {
        return "Gato";
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() + ". GATO";
    }

    //Metodo clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = (Gato) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
