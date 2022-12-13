package Reparacoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Oficina {

    // 2.2 //
    HashMap<Integer, Reparacao> lista;

    public Oficina() {
        this.lista = new HashMap<Integer, Reparacao>();
    }

    public HashMap<Integer, Reparacao> getLista() {
        HashMap<Integer, Reparacao> temp = new HashMap<Integer, Reparacao>();
        for (Reparacao i : this.lista.values()) {
            temp.put(i.getCodigo(), i.clone());
        }
        return temp;
    }

    public void add(Reparacao r) {
        this.lista.put(r.getCodigo(), r.clone());
    }

    // 2.2.1 //

    public int mais_duracao(int mes_atual) {
        double max = 0;
        int mm = 0;
        for (Integer r : this.lista.keySet()) { // r = codigo da reparacao
            Reparacao e = this.lista.get(r); // Q: O que faz isto? A: Devolve a reparacao com o codigo r
            if (e.duracao(mes_atual) > max) { // Q: o que faz o if? A: Se a duracao da reparacao for maior que o maximo, o maximo passa a ser a duracao da reparacao
                max = e.duracao(mes_atual);
                mm = r; // Q: o que faz isto? A: mm passa a ser o codigo da reparacao
            }

        }


        return mm;
    }

    // 2.2.2 //

    public Set<Integer> todos_items() {
        Set<Integer> temp = new TreeSet<Integer>(); // Q: O que faz isto? A: Cria um TreeSet de Integers
        for (Reparacao r : this.lista.values()) {
            for (Integer i : r.getItems()) {
                temp.add(i);
            }
        }


        return temp;
    }


    public int peca_mais() {
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();

        for (Reparacao r : this.lista.values()) {
            for (Integer i : r.getItems()) {
                if (this.lista.containsKey(i)) {
                    temp.put(i, temp.get(i) + 1);
                } else {
                    temp.put(i, 1);
                }
            }
        }

        int max = 0;
        int mm = 0;

        for (Integer i : temp.keySet()) { // Q: O que faz isto? A: Percorre o HashMap
            if (temp.get(i) > max) { // Q: O que faz isto? A: Se o valor da chave i for maior que o maximo, o maximo passa a ser o valor da chave i
                max = temp.get(i);
                i = mm;
            }
        }


        return mm;
    }


    public int melhor_cliente() {
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for (Reparacao r : this.lista.values()) {
            if (temp.containsKey(r.getCli())) {
                temp.put(r.getCli(), temp.get(r.getCli()) + 1); // Q: O que faz isto? A: Se o cliente ja estiver no HashMap, adiciona 1 ao valor da chave do cliente
            } else {
                temp.put(r.getCli(), 1); // Q: O que faz isto? A: Se o cliente nao estiver no HashMap, adiciona o cliente com o valor 1
            }
        }

        int max = 0;
        int mm = 0;
        for (Integer i : temp.keySet()) {
            if (temp.get(i) > max) {
                max = temp.get(i);
                mm = i;
            }

        }

        return mm;


    }

    public Map<Integer,Double> pares(int mes_atual) {
        HashMap<Integer,Double> temp = new HashMap<Integer,Double>();
        for (Reparacao r: this.lista.values()) {
            if (temp.containsKey(r.getCli())) {
                temp.put(r.getCli(), (temp.get(r.getCli()) + r.duracao(mes_atual))); // Q: O que faz isto? A: Se o cliente ja estiver no HashMap, adiciona a duracao da reparacao ao valor da chave do cliente
            }
            else {
                temp.put(r.getCli(), r.duracao(mes_atual)); // Q: O que faz isto? A: Adiciona o cliente e a duracao da reparacao
            }
        }


        return temp;
    }


    public int valormaisbaixo(int mes) {
        HashMap<Integer,Double> temp = new HashMap<Integer,Double>();
        for (Reparacao r: this.lista.values()) {
            for (Integer i: r.getItems()) {
                if (temp.containsKey(i)) {
                    temp.put(i,r.getCli() + r.duracao(mes)); // Q: O que faz isto? A: Adiciona o codigo do cliente mais a duracao da reparacao
                }
                else {
                    temp.put(i,r.duracao(mes)); // Q: O que faz isto? A: Adiciona a duracao da reparacao
                }
            }
        }

        int max = temp.keySet().iterator().next(); // Q: O que faz isto? A: Devolve o primeiro elemento do Set
        double mm = temp.get(max); // Q: O que faz isto? A: Devolve o valor da chave max
        for (Integer i: temp.keySet()) { // Q: O que faz isto? A: Percorre o HashMap
            if (temp.get(i) < mm) { // Q: O que faz isto? A: Se o valor da chave i for menor que o minimo, o minimo passa a ser o valor da chave i
                mm = temp.get(i);
            }
        }


        return max;
    }



}
