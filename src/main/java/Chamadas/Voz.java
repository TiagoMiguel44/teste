package Chamadas;

public class Voz extends Chamada {

    public boolean happy;


    // construtores
    public Voz() {
        super();
        happy = false;

    }

    public Voz(Voz vz) {
        super(vz.getOrigem(), vz.getDuracao(), vz.getPreco());
        happy = vz.isHappy();
    }


    public Voz(int a, int b, double c, boolean happy) {
        super(a, b, c);
        this.happy = happy;
    }


    // metodos
    public boolean isHappy() {
        return happy;
    } // retorna se a chamada é happy ou não

    @Override
    public double valor() { // retorna o valor da chamada
        if (this.happy) { // se for happy
            return getDuracao() * 0.1; // retorna o valor da chamada (0.1)
        } else { // se não for happy
            return (getDuracao() * getPreco()) / 60.0; // retorna o valor da chamada (0.6);
        }
    }

    @Override
    public Chamada clone() {
        return new Voz(this);
    }
}
