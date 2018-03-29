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

    public Perro(boolean ti, boolean oj, boolean bo, boolean su, boolean sih, boolean sis, boolean e) {
        super(ti, oj, bo, su, sih, sis, e);
    }

    //Metodos set y get
    public String ladrar() {
        return "GUAU";
    }

    @Override
    public String soyUn() {
        return super.soyUn() + " Perro.";
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