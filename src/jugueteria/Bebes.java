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

    public Bebes(boolean ll, boolean re, boolean oj, boolean bo, boolean su, boolean sih, boolean sis, boolean e) {
        super(oj, bo, su, sih, sis, e);
        this.triste = ll;
        this.contento = re;
    }

    public String llorar() {
        String llan = "";
        if (this.triste != false) {
            llan = "LLANTO";
        }
        return llan;
    }

    public String reir() {
        String ris = "";
        if (this.contento != false) {
            ris = "RISA";
        }
        return ris;
    }

    //Metodos set y get
    public void setTriste() {
        if (this.triste != false) {
            this.triste = false;
            this.contento = true;
        }
    }

    public void setContento() {
        if (this.contento != false) {
            this.contento = false;
            this.triste = true;

        }
    }

    public boolean getTriste() {
        return this.triste;
    }

    public boolean getContento() {
        return this.contento;
    }

    public String soyUn() {
        return "Bebé";
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
