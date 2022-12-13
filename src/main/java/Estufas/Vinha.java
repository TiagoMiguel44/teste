package Estufas;

public class Vinha extends Fruta implements cardinal {

    private int pes;

    public Vinha(int codigo, double area, int max, int min, int pes) {
        super(codigo, area, max, min);
        this.pes = pes;
    }

    public Vinha(Vinha ef) {
        super(ef.getCodigo(), ef.getArea(), ef.getMax(), ef.getMin());
        this.pes = ef.getPes();
    }

    public int getPes() {
        return this.pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public Vinha clone() {
        Vinha temp = new Vinha(super.getCodigo(), super.getArea(), super.getMax(), super.getMin(), this.pes);
        return temp;
    }

    @Override
    public int cardinalidade() {
        return this.pes;
    }
}

