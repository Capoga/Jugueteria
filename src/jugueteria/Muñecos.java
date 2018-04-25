package jugueteria;

/**
 *
 * @author carme
 */
public class Muñecos /*extends Chip*/ implements Cloneable {

    //Declaración de variables
    private boolean ojosAbiertos;
    private boolean bocaAbierta;
    private boolean sueño;
    private int hambriento;
    private int sediento;
    private Chip c;

    //Constructores
    public Muñecos() {
        //super();
        c = new Chip();
        this.ojosAbiertos = false;
        this.bocaAbierta = false;
        this.sueño = true;
        this.hambriento = 0;
        this.sediento = 0;
    }

    public Muñecos(boolean oj, boolean bo, boolean su, int h, int s, String i) {
        //super(e);
        c = new Chip(i, false);
        this.ojosAbiertos = oj;
        this.bocaAbierta = bo;
        this.sueño = su;
        this.hambriento = 0;
        this.sediento = 0;
    }

    //Acciones
    public String apagarChipMuñeco() {
        //super.apagarChip();
        this.bocaAbierta = false;
        this.ojosAbiertos = false;
        this.sueño = false;
        this.hambriento = 0;
        this.sediento = 0;
        return "Chip apagado.";
    }

    public String dormir(Muñecos m) {
        String aux1 = "";
        String aux2 = "";
        String aux3 = "";
        if (c.getEncendido() == true) {
            if (this.hambriento < 3 && this.sediento < 5) {
                this.sueño = true;
                this.ojosAbiertos = false;
                this.hambriento++;
                this.sediento++;
                aux1 = "Durmiendo... ";
            }
            if (this.sediento >= 5) {
                aux2 = "¡SEDIENTO! ";
                if (m instanceof Bebes) {
                    aux2 = aux2 + ((Bebes) m).llorar();
                }
            }
            if (this.hambriento >= 3) {
                aux3 = "¡HAMBRIENTO! ";
                if (m instanceof Bebes) {
                    aux3 = aux3 + ((Bebes) m).llorar();
                }
            }
        } else {
            aux1 = "El chip esta apagado. ";
        }
        return aux1 + aux2 + aux3;
    }

    public String despertar(Muñecos m) {
        String aux1;
        String aux2 = "";
        String aux3 = "";
        if (c.getEncendido() == true) {
            if (this.sueño == true) {
                this.sueño = false;
                this.setOjos(true);
                this.hambriento++;
                this.sediento++;
                aux1 = "¡¡¡Despierto!!! ";
                if (this.sediento >= 5) {
                    aux2 = "¡SEDIENTO! ";
                    if (m instanceof Bebes) {
                        aux2 = aux2 + ((Bebes) m).llorar();
                    }
                }
                if (this.hambriento >= 3) {
                    aux3 = "¡HAMBRIENTO! ";
                    if (m instanceof Bebes) {
                        aux3 = aux3 + ((Bebes) m).llorar();
                    }
                }
            } else {
                aux1 = "Ya esta despierto. ";
            }
        } else {
            aux1 = "El chip esta apagado. ";
        }
        return aux1 + aux2 + aux3;
    }

    public String comer(Muñecos m) {
        String aux1;
        String aux2 = "";
        String aux3 = "";
        if (c.getEncendido() == true) {
            if (this.sueño == true) {
                this.despertar(m);
            }
            this.setBoca(true);
            this.hambriento = 0;
            this.sediento++;
            aux1 = "Comiendo... ";
            if (this.sediento >= 5) {
                aux2 = "¡SEDIENTO! ";
                if (m instanceof Bebes) {
                    aux2 = aux2 + ((Bebes) m).llorar();
                }
            }
            aux3 = this.dormir(m);
        } else {
            aux1 = "El chip esta apagado. ";
        }
        this.bocaAbierta = false;
        return aux1 + aux2 + aux3;
    }

    public String beber(Muñecos m) {
        String aux1;
        String aux2 = "";
        if (c.getEncendido() == true) {
            if (this.sueño == true) {
                this.despertar(m);
            }
            this.setBoca(true);
            this.sediento = 0;
            this.hambriento++;
            aux1 = "Bebiendo... ";
            if (this.hambriento >= 3) {
                aux2 = "¡HAMBRIENTO! ";
                if (m instanceof Bebes) {
                    aux2 = aux2 + ((Bebes) m).llorar();
                }
            }
        } else {
            aux1 = "El chip esta apagado. ";
        }
        this.bocaAbierta = false;
        return aux1 + aux2;
    }

    public String emiteSonido(Muñecos m) {
        String aux1 = "";
        String aux2 = "";
        String aux3 = "";
        if (c.getEncendido() == true) {
            if (this.hambriento < 3 && this.sediento < 5) {
                if (!this.sueño) {
                    if (m instanceof Bebes) {
                        aux1 = ((Bebes) m).reir();
                    }
                    if (m instanceof Gato) {
                        aux1 = ((Gato) m).maullar();
                    }
                    if (m instanceof Perro) {
                        aux1 = ((Perro) m).ladrar();
                    }
                } else {
                    aux1 = "Ronquido";
                }
            }
            if (this.sediento >= 5) {
                aux2 = "¡SEDIENTO! ";
                if (m instanceof Bebes) {
                    aux2 = aux2 + ((Bebes) m).llorar();
                }
            }
            if (this.hambriento >= 3) {
                aux3 = "¡HAMBRIENTO! ";
                if (m instanceof Bebes) {
                    aux3 = aux3 + ((Bebes) m).llorar();
                }
            }
        } else {
            aux1 = "El chip esta apagado. ";
        }
        return aux1 + aux2 + aux3;
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

    public void setEncendido() {
        c.setEncendido();
    }

    public String getid() {
        return c.getid();
    }

    public boolean getEncendido() {
        return c.getEncendido();
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

    public int getHambriento() {
        return this.hambriento;
    }

    public int getSediento() {
        return this.sediento;
    }

    public String soyUn() {
        return "Muñeco ";
    }

    //Metodo toString
    @Override
    public String toString() {
        return c.toString() + ". Es un muñeco" + ". Tiene los ojos " + ojosAbiertos
                + ", la boca " + bocaAbierta + ", el sueño " + sueño;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = (Muñecos) super.clone();
            ((Muñecos) obj).c = (Chip) this.c.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return obj;
    }
}
