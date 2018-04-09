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

    public Gato(boolean ti, boolean oj, boolean bo, boolean su, boolean e) {
        super(ti, oj, bo, su, e);
    }

    //Acciones
    public String maullar() {
        return "MIAAUU";
    }

    @Override
    public String soyUn() {
        return super.soyUn() + " Gato.";
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
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
