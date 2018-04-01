package jugueteria;

/**
 *
 * @author carme
 */
public class Muñecos extends Chip implements Cloneable {

    //Declaración de variables
    private boolean ojosAbiertos;
    private boolean bocaAbierta;
    private boolean sueño;
    private int hambriento;
    private int sediento;

    //Constructores
    public Muñecos() {
        super();
        this.ojosAbiertos = false;
        this.bocaAbierta = false;
        this.sueño = true;
        this.hambriento = 0;
        this.sediento = 0;
    }

    public Muñecos(boolean oj, boolean bo, boolean su, boolean e) {
        super(e);
        this.ojosAbiertos = oj;
        this.bocaAbierta = bo;
        this.sueño = su;
        this.hambriento = 0;
        this.sediento = 0;
    }

    //Acciones
    public void apagarChipMuñeco() {
        super.apagarChip();
        this.bocaAbierta = false;
        this.ojosAbiertos = false;
        this.sueño = false;
        this.hambriento = 0;
        this.sediento = 0;
    }

    public String dormir() {
        String aux1 = "";
        String aux2 = "";
        String aux3 = "";
        if (super.getEncendido() == true) {
            if (this.hambriento < 3 && this.sediento < 5) {
                this.sueño = true;
                this.ojosAbiertos = false;
                this.hambriento = hambriento + 1;
                this.sediento = sediento + 1;
                aux1 = "Durmiendo... ";
            }
            if (this.sediento >= 5) {
                aux2 = "¡SEDIENTO! ";
            }
            if (this.hambriento >= 3) {
                aux3 = "¡HAMBRIENTO! ";
            }
        } else {
            aux1 = "El chip esta apagado. ";
        }
        return aux1 + aux2 + aux3;
    }

    public String despertar() {
        String aux1 = "";
        String aux2 = "";
        String aux3 = "";
        if (super.getEncendido() == true) {
            if (this.sueño == true) {
                this.sueño = false;
                this.setOjos(true);
                this.hambriento = hambriento + 1;
                this.sediento = sediento + 1;
                aux1 = "¡¡¡Despierto!!! ";
                if (this.sediento >= 5) {
                    aux2 = "¡SEDIENTO! ";
                }
                if (this.hambriento >= 3) {
                    aux3 = "¡HAMBRIENTO! ";
                }
            } else {
                aux1 = "Ya esta despierto. ";
            }
        } else {
            aux1 = "El chip esta apagado. ";
        }
        return aux1 + aux2 + aux3;
    }

    public String comer() {
        String aux1 = "";
        String aux2 = "";
        if (super.getEncendido() == true) {
            if (this.sueño == true) {
                this.despertar();
            }
            this.setBoca(true);
            this.hambriento = 0;
            this.sediento = sediento + 1;
            aux1 = "Comiendo... ";
            if (this.sediento >= 5) {
                aux2 = "¡SEDIENTO! ";
            }
            this.dormir();
        } else {
            aux1 = "El chip esta apagado. ";
        }
        this.bocaAbierta = false;
        return aux1 + aux2;
    }

    public String beber() {
        String aux1 = "";
        String aux2 = "";
        if (super.getEncendido() == true) {
            if (this.sueño == true) {
                this.despertar();
            }
            this.setBoca(true);
            this.sediento = 0;
            this.hambriento = hambriento + 1;
            aux1 = "Bebiendo... ";
            if (this.hambriento >= 3) {
                aux2 = "¡HAMBRIENTO! ";
            }
        } else {
            aux1 = "El chip esta apagado. ";
        }
        this.bocaAbierta = false;
        return aux1 + aux2;
    }

    //Metodos set y get
    public void setOjos(boolean x) {
        this.ojosAbiertos = x;
    }

    public void setBoca(boolean x) {
        this.bocaAbierta = x;
    }

    public void setSueño(boolean x) {
        this.sueño = x;
    }

    public boolean getOjosAbiertos() {
        return ojosAbiertos;
    }

    public boolean getBoca() {
        return bocaAbierta;
    }

    public boolean getSueño() {
        return sueño;
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() + ". Es un muñeco" + ". Tiene los ojos " + ojosAbiertos
                + ", la boca " + bocaAbierta + ", el sueño " + sueño;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = (Muñecos) super.clone();
            //((Muñecos) obj).b = (Bebes) this.b.clone();
            //((Muñecos) obj).a = (Animales) this.a.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
