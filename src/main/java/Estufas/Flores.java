package Estufas;

import java.util.ArrayList;

public class Flores extends Estufa {

    private String nome; // nome da flor
    private ArrayList<String> cores; // cores da flor

    public static int valor = 10; // valor da flor


    public Flores() {
        this.nome = "";
        this.cores = new ArrayList<>();
    }

    public Flores(int codigo, double area, int max, int min, String nome) {
        super(codigo, area, max, min);
        this.nome = nome;
        this.cores = new ArrayList<String>();
    }

    public Flores(Flores ef) {
        super(ef.getCodigo(), ef.getArea(), ef.getMax(), ef.getMin());
    }


    public void add(String m) { // adiciona uma cor
        if (m != null) { // se a cor nao for nula
            this.cores.add(m); // adiciona a cor m ao array de cores
        }
    }


    public double ValorTotal() {
        return super.getArea() * getValor();
    } // retorna o valor total da estufa

    public static int getValor() {
        return valor;
    }

    public Flores clone() { // retorna uma copia da estufa
        Flores temp = new Flores(super.getCodigo(),super.getArea(),super.getMax(),super.getMin(), this.nome); // cria uma nova estufa
        for (String a: this.cores) { // percorre a lista de cores
            temp.add(a); // adiciona os nomes da estufa ef à estufa temp
        }
        return temp; // devolve a estufa temp
    }


    public int cardinalidade() {
        return this.cores.size();
    } // devolve o numero de cores da flor

}
