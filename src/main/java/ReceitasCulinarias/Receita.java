package ReceitasCulinarias;

import Estufas.Fruta;

import java.util.ArrayList;
import java.util.List;

public class Receita {

    private String nome;

    private String descricao;

    private ArrayList<Ingrediente> lista; // O que faz esta linha? A: Cria uma lista de ingredientes


    public Receita(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.lista = new ArrayList<Ingrediente>();
    }

    public Receita(Receita r) {
        this.nome = r.getNome();
        this.descricao = r.getDescricao();
        this.lista = new ArrayList<Ingrediente>();
        for (Ingrediente i : r.getLista()) {
            this.lista.add(i.clone());
        }
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    public ArrayList<Ingrediente> getLista() {
        ArrayList<Ingrediente> temp = new ArrayList<Ingrediente>(); // Cria uma lista de ingredientes
        for (Ingrediente i : this.lista) { // Percorre a lista de ingredientes
            temp.add(i.clone()); // Adiciona o ingrediente à lista
        }
        return temp; // Devolve a lista
    }

    public int totalCalorias() {
        int total = 0;
        for (Ingrediente i : this.lista) { // para cada ingrediente i da lista de ingredientes
            total += i.getCalorias() * i.getQuantidade(); // adiciona ao total o número de calorias do ingrediente i vezes a quantidade do ingrediente i
        }
        return total;
    }


    public void addIngrediente(Ingrediente i) {
        if (i != null) {
            this.lista.add(i.clone());
        }
    }

    @Override
    public Receita clone() {
        Receita temp = new Receita(this.nome, this.descricao);
        for (Ingrediente i : this.lista) {
            temp.addIngrediente(i);
        }
        return temp;
    }

    public List<String> lista_ingredientes() // devolve uma lista com os nomes dos ingredientes da receita
    {

        {
            List<String> temp = new ArrayList<String>(); // cria uma lista de Strings
            for (Ingrediente i : this.lista) // para cada ingrediente i da lista de ingredientes
                temp.add(i.getNome()); // adiciona o nome do ingrediente i à lista de Strings
            return temp; // devolve a lista de Strings
        }


    }

}