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

    public Animales(boolean ti, boolean oj, boolean bo, boolean su, boolean e) {
        super(oj, bo, su, e);
        this.tipo = ti;
    }

    //Metodos set y get
    public void setTipo(boolean x) {
        this.tipo=x;
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
