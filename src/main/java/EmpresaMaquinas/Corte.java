package EmpresaMaquinas;

public class Corte extends Maquina implements Componente {




    public Corte(int c, int t) {
        super(c, t);
    }

    public Corte(Corte ct) {
        super(ct.getCodigo(), ct.getTempo());
    }

    // metodos




    @Override
    public double valor() {
        double total = 0.0;
        for (Componente c: this.getLista()) {
            total = total + c.custo();
        }
        return total;
    }


    public Corte clone() {
        Corte temp = new Corte(super.getCodigo(), super.getTempo());
        for (Componente c: this.getLista()) {
            temp.add(c);
        }
        return temp;
    }

    @Override
    public double custo() {
        return this.valor();
    }

    @Override
    public int getCod() {
        return super.getCodigo();
    }


}
