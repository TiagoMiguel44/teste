package Teste1718;

import java.util.ArrayList;

public abstract class Servico {

    private int codigo; //
    private int codClic;
    ArrayList<Integer> prestadores; // lista de codigos de prestadores

public Servico(int codigo, int codClic) {
        this.codigo = codigo;
        this.codClic = codClic;
        this.prestadores = new ArrayList<Integer>();
    }


    public Servico(Servico s) {
        this.codigo = s.getCodigo();
        this.codClic = s.getCodClic();
        this.prestadores = s.getPrestadores();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getCodClic() {
        return this.codClic;
    }

    public ArrayList<Integer> getPrestadores() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Integer i : this.prestadores) {
            temp.add(i);
        }
        return temp;
    }
public int tam_presta() {
        return this.prestadores.size(); // Q: O que faz isto? A: Devolve o tamanho da lista de prestadores
    }
    public void addPrestador(Integer c) { //
        this.prestadores.add(c);
    }

    public abstract double custo();
    public abstract Servico clone();


}
