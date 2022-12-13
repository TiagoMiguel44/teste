package Reparacoes;

import java.util.ArrayList;
import java.util.List;

public abstract class Reparacao {
    private int codigo; // código da Ordem de Reparação
    private int codCli; // código (id) do cliente
    private int horas; // número de horas registadas na reparação
    private ArrayList<Integer> items; // lista de códigos das peças substituídas

    Reparacao(int c, int cl, int h) {
        this.codigo = c;
        this.codCli = cl;
        this.horas = h;
        this.items = new ArrayList<Integer>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getCli() {
        return this.codCli;
    }

    public int getHoras() {
        return this.horas;
    }

    public void addHoras(int h) {
        this.horas += h;
    }

    public List<Integer> getItems() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Integer c : this.items)
            temp.add(c);
        return temp;
    }

    public int numero_items() {
        return items.size();
    } // número de peças substituídas

    public void add(Integer c) {
        this.items.add(c);
    } // adiciona uma peça à lista de peças substituídas

    public abstract double duracao(int mes); //estimativa em horas (dado o mês)

    public abstract Reparacao clone();
}
