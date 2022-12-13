package GereHoteis;

import java.util.Set;
import java.util.TreeSet;

public abstract class Hotel {

    private String nome;
    private String localidade;
    private double PrecoBase;
    private int num; // numero de quartos
    private Set<Integer> ocupa;

    public Hotel(String nome, String localidade, double PrecoBase, int num){
        this.nome = nome;
        this.localidade = localidade;
        this.PrecoBase = PrecoBase;
        this.num = num;
        this.ocupa = ocupa;
    }

    public Hotel(Hotel h){
        this.nome = h.getNome();
        this.localidade = h.getLocalidade();
        this.PrecoBase = h.getPrecoBase();
        this.num = h.getNum();
        this.ocupa = h.getOcupa();
    }




    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public double getPrecoBase() {
        return PrecoBase;
    }

    public int getNum() {
        return num;
    }

    public Set<Integer> getOcupa() {
        return ocupa;
    }


    public void in(int x) {
        this.ocupa.add(x); // adiciona o quarto x ao set de ocupados
    }

    public void out(int x) {
        this.ocupa.remove(x); // remove o quarto x do set de ocupados
    }

    public boolean existe(int x) {
       return this.ocupa.contains(x);
    }



    private Set<Integer> ocupados() { // devolve os quartos ocupados
        TreeSet<Integer> temp = new TreeSet<Integer>(); //
        for (Integer i: this.ocupa) { // percorre os quartos ocupados
            temp.add(i); // adiciona o quarto à lista
        }
        return temp;
    }

    public abstract double dormida(int mes);
    public abstract Hotel clone();


}
