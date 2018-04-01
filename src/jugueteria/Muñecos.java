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
    private boolean hambre;
    private boolean sed;
    private int hambriento;
    private int sediento;
    //private Bebes b = new Bebes();

    //Constructores
    public Muñecos() {
        super();
        this.ojosAbiertos = false;
        this.bocaAbierta = false;
        this.sueño = true;
        this.hambre = false;
        this.sed = false;
        this.hambriento = 0;
        this.sediento = 0;
    }

    public Muñecos(boolean oj, boolean bo, boolean su, boolean sih, boolean sis, boolean e) {
        super(e);
        this.ojosAbiertos = oj;
        this.bocaAbierta = bo;
        this.sueño = su;
        this.hambre = sih;
        this.sed = sis;
        this.hambriento = 0;
        this.sediento = 0;
    }

    //Acciones
    public void apagarChipMuñeco() {
        super.apagarChip();
        this.bocaAbierta = false;
        this.hambre = false;
        this.ojosAbiertos = false;
        this.sed = false;
        this.sueño = false;
        this.hambriento = 0;
        this.sediento = 0;
    }

    public void dormir() {
        if (super.getEncendido() != false) {
            this.sueño = true;
            this.ojosAbiertos = false;
            this.hambriento = hambriento + 1;
            this.sediento = sediento + 1;
            System.out.println("");
            System.out.println("Durmiendo...");
            System.out.println("");
            if (this.sediento >= 5) {
                System.out.println("¡SEDIENTO!");
                /*if (b instanceof Bebes) {
                    b.setTriste();
                    b.llorar();
                }*/
            }
            if (this.hambriento >= 3) {
                System.out.println("¡HAMBRIENTO!");
                /*if (b instanceof Bebes) {
                    b.setTriste();
                    b.llorar();
                }*/
            }
        } else {
            System.out.println("");
            System.out.println("El chip esta apagado.");
            System.out.println("");
        }
    }

    public void despertar() {
        if (super.getEncendido() != false) {
            this.sueño = false;
            this.setOjos();
            this.hambriento = hambriento + 1;
            this.sediento = sediento + 1;
            System.out.println("");
            System.out.println("¡¡¡Despierto!!!");
            System.out.println("");
            if (this.sediento >= 5) {
                System.out.println("¡SEDIENTO!");
                /*if (b instanceof Bebes) {
                    b.setTriste();
                    b.llorar();
                }*/
            }
            if (this.hambriento >= 3) {
                System.out.println("¡HAMBRIENTO!");
                /*if (b instanceof Bebes) {
                    b.setTriste();
                    b.llorar();
                }*/
            }
        } else {
            System.out.println("");
            System.out.println("El chip esta apagado.");
            System.out.println("");
        }
    }

    public void comer() {
        if (super.getEncendido() != false) {
            if (this.sueño != false) {
                this.despertar();
            }
            this.setBoca();
            this.hambriento = 0;
            this.sediento = sediento + 1;
            System.out.println("");
            System.out.println("Comiendo...");
            System.out.println("");
            if (this.sediento >= 5) {
                System.out.println("¡SEDIENTO!");
                /*if (b instanceof Bebes) {
                    b.setTriste();
                    b.llorar();
                }*/
            }
            this.dormir();
        } else {
            System.out.println("");
            System.out.println("El chip esta apagado.");
            System.out.println("");
        }
        this.bocaAbierta = false;
    }

    public void beber() {
        if (super.getEncendido() != false) {
            if (this.sueño != false) {
                this.despertar();
            }
            this.bocaAbierta = true;
            this.sediento = 0;
            this.hambriento = hambriento + 1;
            System.out.println("");
            System.out.println("Bebiendo...");
            System.out.println("");
            if (this.hambriento >= 3) {
                System.out.println("¡HAMBRIENTO!");
                /*if (b instanceof Bebes) {
                    b.setTriste();
                    b.llorar();
                }*/
            }
        } else {
            System.out.println("");
            System.out.println("El chip esta apagado.");
            System.out.println("");
        }
        this.bocaAbierta = false;
    }

    //Metodos set y get
    public void setOjos() {
        if (this.ojosAbiertos != true) {
            this.ojosAbiertos = true;
        }
    }

    public void setBoca() {
        if (this.bocaAbierta != true) {
            this.bocaAbierta = true;
        }
    }

    public void setSueño() {
        if (this.sueño != true) {
            this.sueño = true;
        }
    }

    public void sethambre() {
        if (this.hambre != true) {
            this.hambre = true;
        }
    }

    public void setsed() {
        if (this.sed != true) {
            this.sed = true;
        }
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

    public boolean gethambre() {
        return hambre;
    }

    public boolean getsed() {
        return sed;
    }

    //Metodo toString
    @Override
    public String toString() {
        return super.toString() + ". Es un muñeco" + ". Tiene los ojos " + ojosAbiertos
                + ", la boca " + bocaAbierta + ", el sueño " + sueño
                + ", el hambre " + hambre + ", la sed" + sed;
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
