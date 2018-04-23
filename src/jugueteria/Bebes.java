package jugueteria;

/**
 *
 * @author carme
 */
public class Bebes extends Muñecos implements Cloneable {

    private boolean triste;
    private boolean contento;

    //Constructores
    public Bebes() {
        super();
        this.triste = false;
        this.contento = true;
    }

    public Bebes(boolean ll, boolean re, boolean oj, boolean bo, boolean su, String i) {
        super(oj, bo, su, i);
        this.triste = ll;
        this.contento = re;
    }

    //Acciones
    public String llorar() {
        this.setTriste(true);
        super.setBoca(true);
        return "LLANTO ";
    }

    public String reir() {
        this.setContento(true);
        super.setBoca(true);
        return "RISA ";

    }

    //Metodos set y get
    public void setTriste(boolean x) {
        this.triste = x;
        if (x == true) {
            this.contento = false;
        } else {
            this.contento = true;
        }
    }

    public void setContento(boolean x) {
        this.contento = x;
        if (x == true) {
            this.triste = false;
        } else {
            this.triste = true;
        }
    }

    public boolean getTriste() {
        return this.triste;
    }

    public boolean getContento() {
        return this.contento;
    }

    @Override
    public String soyUn() {
        return "Bebé ";
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() + ". Muñeco bebé. Llorar esta " + triste + " y reir esta " + contento;
    }

    //Metodo clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = (Bebes) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
