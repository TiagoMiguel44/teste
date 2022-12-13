package Estufas;

import java.util.ArrayList;

public class Fruta extends Estufa implements cardinal {


    private ArrayList<String> nomes; // nomes das frutas
    public static int valor = 100;


    // construtores


    public Fruta(int codigo, double area, int max, int min) {
        super(codigo, area, max, min);
        nomes = new ArrayList<String>();
    }


    public Fruta(Fruta ef) {
        super(ef.getCodigo(), ef.getArea(), ef.getMax(), ef.getMin());
    }


    // metodos

    public void add(String m) { // adiciona um nome
        if (m != null) { // se o nome nao for nulo
            this.nomes.add(m); // adiciona um nome m ao array de nomes
        }
    }


    @Override
    public double ValorTotal() {
        return super.getArea() * Fruta.getValor(); // retorna o valor total da estufa
    }

    @Override
    public Fruta clone() { // devolve uma cópia da estufa
        Fruta temp = new Fruta(super.getCodigo(), super.getArea(), super.getMax(), super.getMin()); // cria uma estufa temporária
        for (String a : this.nomes) { // percorre a lista de nomes
            temp.add(a); // adiciona os nomes da estufa ef à estufa temp
        }
        return temp; // devolve a estufa temp
    }


    public static int getValor() {
        return valor;
    }
    public int cardinalidade() {
        return this.nomes.size();
    } // devolve o numero de nomes da fruta

}
