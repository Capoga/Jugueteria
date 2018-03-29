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

    public Gato(boolean ti, boolean oj, boolean bo, boolean su, boolean sih, boolean sis, boolean e) {
        super(ti, oj, bo, su, sih, sis, e);
    }

    //Metodos set y get
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
            obj = (Gato) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
