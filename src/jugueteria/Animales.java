package jugueteria;

/**
 *
 * @author carme
 */
public class Animales extends Muñecos implements Cloneable {

    private boolean tipo; //Si esta en true son domesticos si esta en false son salvajes

    //Constructores
    public Animales() {
        super();
        this.tipo = true;
    }

    public Animales(boolean ti, boolean oj, boolean bo, boolean su, boolean sih, boolean sis, boolean e) {
        super(oj, bo, su, sih, sis, e);
        this.tipo = ti;
    }

    //Metodos set y get
    public void setTipo() {
        if (this.tipo != true) {
            this.tipo = true;
        }
    }

    public boolean getTipo() {
        return this.tipo;
    }

    public String soyUn() {
        return "Animal";
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() + ". Muñeco animal, tipo domestico " + tipo;
    }

    //Metodo clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = (Animales) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
