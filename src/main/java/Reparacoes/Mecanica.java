package Reparacoes;

public class Mecanica extends Reparacao {


    public Mecanica(int c, int cl, int h) {
        super(c,cl,h);
    }


    @Override
    public double duracao(int mes) {
        double total = getHoras();
        if (mes >= 1 || mes <= 6) {
            total = this.numero_items() / 10.0; // 10 peças por hora
        }
        return total;
    }

    @Override
    public Mecanica clone() {
        return new Mecanica(super.getCodigo(),super.getCli(),super.getHoras());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mecanica mecanica = (Mecanica) obj;
        return getCodigo() == mecanica.getCodigo();
    }
}