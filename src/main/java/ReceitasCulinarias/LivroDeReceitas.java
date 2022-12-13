package ReceitasCulinarias;

import Teste1718.Servico;

import java.util.*;

public class LivroDeReceitas {

    private HashMap<String, Receita> lista; // Q: Porque é que é um Map e não um HashMap? A: Porque é mais genérico e permite que se mude facilmente para outro tipo de Map

    public LivroDeReceitas() {
        this.lista = new HashMap<String, Receita>();
    } // Q: Porque é um HashMap e não um TreeMap? A: Porque é mais genérico e permite que se mude facilmente para outro tipo de Map

    public void add(Receita r) { // adiciona uma receita ao livro
        this.lista.put(r.getNome(), r.clone()); // Q: O que é que faz esta linha? A: Adiciona uma receita ao livro de receitas
    }

    public int totalCalorias(String nome) { // devolve o número total de calorias da receita com o nome dado
        if (this.lista.containsKey(nome)) { // se a receita com o nome dado existir
            Receita r = this.lista.get(nome); // r é a receita com o nome dado
            return r.totalCalorias(); // devolve o número total de calorias da receita r
        } else {
            return 0;
        }
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        LivroDeReceitas l = (LivroDeReceitas) o;
        return (this.lista.equals(l.getLista()));
    }

    public LivroDeReceitas clone() {
        LivroDeReceitas temp = new LivroDeReceitas();
        for (Receita r : this.lista.values()) {
            temp.add(r);
        }
        return temp;
    }

    public Map<String, Receita> getLista() {
        Map<String, Receita> temp = new HashMap<String, Receita>();
        for (Receita r : this.lista.values()) { // para cada receita r da lista de receitas
            temp.put(r.getNome(), r.clone()); // adiciona à lista de receitas temp a receita r
        }
        return temp;
    }




    public Map<String, Set<String>> receitaPorIngrediente1() { // Devolve um Map com os ingredientes e as receitas que os contêm
        Map<String, Set<String>> temp = new HashMap<String, Set<String>>();
        for (Receita r : this.lista.values()) { // para cada receita r do livro de receitas
            for (String s : r.lista_ingredientes()) { // para cada ingrediente s da lista de ingredientes da receita r
                if (temp.containsKey(s)) { // se o ingrediente s já estiver no Map
                    temp.get(s).add(r.getNome());   // adiciona o nome da receita r ao Set de Strings do ingrediente s
                } else { // se o ingrediente s não estiver no Map
                    Set<String> temp1 = new TreeSet<String>(); // Q: O que faz isto? A: Cria um TreeSet de Integers
                    temp1.add(r.getNome()); // adiciona o nome da receita r ao Set de Strings
                    temp.put(s, temp1); // adiciona o ingrediente s e o Set de Strings ao Map
                }
            }
        }


        return temp; // devolve o Map
    }


}









