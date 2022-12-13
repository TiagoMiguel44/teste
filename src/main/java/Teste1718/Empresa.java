package Teste1718;

import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.util.*;

public class Empresa {

    private HashMap<Integer,Servico> lista; // lista de servicos


    public Empresa() {
        this.lista = new HashMap<Integer,Servico>();
    } // Q:


    public void add(Servico m) throws Except1 { // Q: O que faz o Except1? A: É uma exceção que é lançada quando o serviço já existe
        if (this.lista.containsKey(m.getCodigo())) { // Q: O que faz o containsKey? A: Verifica se o código do serviço já existe
            throw new Except1(); // Q: O que faz isto? A: Lança a exceção Except1
        }
            else { // Q: O que faz isto? A: Adiciona o serviço à lista de serviços

            this.lista.put(m.getCodigo(), m.clone());
        }
    }



public String mais_prestadores() {
        String a = "";
        int max = 0;
    for (Servico r: this.lista.values()) { // Q: O que faz isto? A: Percorre a lista de serviços
        if (r.tam_presta() > max) {
            max = r.tam_presta();
           a = r.getClass().getName();
        }
    }
    return a;
}


    public HashMap<Integer, Servico> getLista() {
        HashMap<Integer,Servico> temp = new HashMap<Integer,Servico>();
        for (Servico i: this.lista.values()) {
            temp.put(i.getCodigo(),i.clone());
        }
        return temp;
    }

    public Map<Integer,ArrayList<Servico>> cliente_servicos() {
        HashMap<Integer,ArrayList<Servico>> temp = new HashMap<Integer, ArrayList<Servico>>();
        for (Servico r: this.lista.values()) {
            if (temp.containsKey(r.getCodClic())) { // Q: O que faz isto? A: Verifica se o cliente já existe na lista
                temp.get(r.getCodClic()).add(r.clone()); // Q: O que faz isto? A: Adiciona o serviço à lista de serviços do cliente
            }
            else {
                ArrayList<Servico> temp1 = new ArrayList<Servico>();
                temp1.add(r.clone());
                temp.put(r.getCodClic(),temp1); // Q: O que faz isto? A: Adiciona o cliente à lista de clientes
            }
        }


        return temp;
    }

    public Map<Integer, TreeSet<Integer>> prestadores_servicos() { // Q: O que faz isto? A: Devolve um map com os prestadores e os serviços que prestam
        HashMap<Integer,TreeSet<Integer>> temp = new HashMap<Integer,TreeSet<Integer>>(); // Q: O que faz isto? A: Cria um HashMap de Integers e TreeSets de Integers
        for (Servico r: this.lista.values()) { // Q: O que faz isto? A: Percorre a lista de serviços
            for (Integer s: r.getPrestadores()) {
                if (temp.containsKey(s)) { // Q: O que faz isto? A: Verifica se o prestador já existe na lista
                    temp.get(s).add(r.getCodClic()); // Q: O que faz isto? A: Adiciona o serviço à lista de serviços do prestador
                }
                else { // Q: O que faz isto? A: Cria um novo prestador
                    TreeSet<Integer> temp1 = new TreeSet<Integer>(); // Q: O que faz isto? A: Cria um TreeSet de Integers
                    temp1.add(r.getCodClic()); // Q: O que faz isto? A: Adiciona o serviço à lista de serviços do prestador
                    temp.put(s,temp1); // Q: O que faz isto? A: Adiciona o prestador à lista de prestadores
                }
            }
        }


        return temp;
    }


    public int maior_valor() {

        HashMap<Integer,Double> temp = new HashMap<Integer,Double>();

        for (Servico r: this.lista.values()) {
            for (Integer i: r.getPrestadores()) {
                if (temp.containsKey(i)) {  // Q: O que faz isto? A: Verifica se o prestador já existe na lista
                    double cc = r.custo() + temp.get(i);
                    temp.put(i,r.custo());
                }
                else { //
                    temp.put(i,r.custo());
                }
            }
        }






        double max = 0.0;
        int mm = 0;

        for (Integer i: temp.keySet()) {
            if (temp.get(i) > max) {
                max = temp.get(i);
                mm = i;
            }
        }


        return mm;


    }






}
