package Reparacoes;

import java.util.Objects;

public class Chaparia extends Reparacao {

    private double tinta;

    public Chaparia(int c, int cl, int h, double tinta) {
        super(c, cl, h);
        this.tinta = tinta;
    }


    public double duracao(int mes) {
        double total = this.getHoras();
        if (mes >= 1 || mes <= 6) {
            total = total + this.getHoras() * 0.10; // 10% de aumento
        }
       total = this.getTinta() / 2.5; // 2.5 litros por hora
        return total;
    }


    public double getTinta() {
        return tinta;
    }


    public Chaparia clone() {
        return new Chaparia(super.getCodigo(), super.getCli(), super.getHoras(), this.tinta);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chaparia chaparia = (Chaparia) o;
        return getCodigo() == chaparia.getCodigo();
    }


}
