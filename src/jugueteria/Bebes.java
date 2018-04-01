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

    public Bebes(boolean ll, boolean re, boolean oj, boolean bo, boolean su, boolean e) {
        super(oj, bo, su, e);
        this.triste = ll;
        this.contento = re;
    }

    //Acciones
    @Override
    public String dormir() {
        String aux1 = "";
        String aux2 = "";
        if (super.dormir().equals("El chip esta apagado. ")) {
            aux1 = "El chip esta apagado. ";
        }
        if (super.dormir().equals("Durmiendo... ")) {
            aux1 = "Durmiendo... ";
        }
        if (super.dormir().equals("¡SEDIENTO! ")) {
            aux1 = "¡SEDIENTO! ";
            aux2 = this.llorar();
        }
        if (super.dormir().equals("¡HAMBRIENTO! ")) {
            aux1 = "¡HAMBRIENTO! ";
            aux2 = this.llorar();
        }
        if (super.dormir().equals("¡SEDIENTO! ¡HAMBRIENTO! ")) {
            aux1 = "¡SEDIENTO! ¡HAMBRIENTO! ";
            aux2 = this.llorar();
        }
        return aux1 + aux2;
    }

    @Override
    public String despertar() {
        String aux1 = "";
        String aux2 = "";
        if (super.despertar().equals("El chip esta apagado. ")) {
            aux1 = "El chip esta apagado. ";
        }
        if (super.despertar().equals("¡¡¡Despierto!!! ")) {
            aux1 = "¡¡¡Despierto!!! ";
        }
        if (super.despertar().equals("¡SEDIENTO! ")) {
            aux1 = "¡SEDIENTO! ";
            aux2 = this.llorar();
        }
        if (super.despertar().equals("¡HAMBRIENTO! ")) {
            aux1 = "¡HAMBRIENTO! ";
            aux2 = this.llorar();
        }
        if (super.despertar().equals("¡¡¡Despierto!!! ¡SEDIENTO! ¡HAMBRIENTO! ")) {
            aux1 = "¡¡¡Despierto!!! ¡SEDIENTO! ¡HAMBRIENTO! ";
            aux2 = this.llorar();
        }
        return aux1 + aux2;
    }

    @Override
    public String comer() {
        String aux1 = "";
        String aux2 = "";
        if (super.comer().equals("El chip esta apagado. ")) {
            aux1 = "El chip esta apagado. ";
        }
        if (super.comer().equals("Comiendo... ")) {
            aux1 = "Comiendo... ";
        }
        if (super.comer().equals("¡SEDIENTO! ")) {
            aux1 = "¡SEDIENTO! ";
            aux2 = this.llorar();
        }
        if (super.comer().equals("Comiendo... ¡SEDIENTO! ")) {
            aux1 = "Comiendo... ¡SEDIENTO! ";
            aux2 = this.llorar();
        }
        return aux1 + aux2;
    }

    @Override
    public String beber() {
        String aux1 = "";
        String aux2 = "";
        if (super.beber().equals("El chip esta apagado. ")) {
            aux1 = "El chip esta apagado. ";
        }
        if (super.beber().equals("bebiendo... ")) {
            aux1 = "bebiendo... ";
        }
        if (super.beber().equals("¡HAMBRIENTO! ")) {
            aux1 = "¡HAMBRIENTO! ";
            aux2 = this.llorar();
        }
        if (super.beber().equals("Comiendo... ¡HAMBRIENTO! ")) {
            aux1 = "Comiendo... ¡HAMBRIENTO! ";
            aux2 = this.llorar();
        }
        return aux1 + aux2;
    }

    public String llorar() {
        this.setTriste(true);
        return "LLANTO ";
    }

    public String reir() {
        this.setContento(true);
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
