package GereHoteis;

public class Standard extends Hotel {


    public Standard(String nome, String localidade, double PrecoBase, int num) {
        super(nome, localidade, PrecoBase, num);
    }


    @Override
    public double dormida(int mes) {
        return this.getPrecoBase();
    }

    @Override
    public Standard clone() {
        return new Standard(super.getNome(), super.getLocalidade(), super.getPrecoBase(), super.getNum());
    }
}
