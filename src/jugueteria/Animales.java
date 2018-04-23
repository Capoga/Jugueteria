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

    public Animales(boolean ti, boolean oj, boolean bo, boolean su, String i) {
        super(oj, bo, su, i);
        this.tipo = ti;
    }

    //Metodos set y get
    public void setTipo(boolean x) {
        this.tipo = x;
    }

    public boolean getTipo() {
        return this.tipo;
    }

    @Override
    public String soyUn() {
        String aux;
        if (!tipo) {
            aux = "salvaje.";
        } else {
            aux = "doméstico.";
        }
        return "Animal " + aux;
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
