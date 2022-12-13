package Estufas;

import java.util.ArrayList;
import java.util.List;

public class GereEstufas {

    public ArrayList<Estufa> lista; // lista de estufas


    public GereEstufas() {

        this.lista = new ArrayList<Estufa>();
    }

    public void add(Estufa m) { // adiciona uma estufa à lista
        if (m != null) {
            this.lista.add(m.clone()); // adiciona uma cópia da estufa à lista   
        }
    }


    public double area_total() { // devolve a area total das estufas
        double total = 0.0; // inicializa a area total a 0
        for (Estufa a : this.lista) { // percorre a lista de estufas (para cada Estufa a na lista de estufas)
            total = total + a.getArea(); // soma a area da estufa a ao total
        }
        return total; // devolve o total
    }


    public List<Integer> emRisco(int temp) { // devolve uma lista com os códigos das estufas em risco
        ArrayList<Integer> t = new ArrayList<Integer>();// lista de estufas em risco
        for (Estufa x : this.lista) { // percorre a lista
            if (x.emRisco(temp)) { // se a estufa estiver em risco
                t.add(x.getCodigo()); // adiciona o código da estufa à lista
            }
        }
        return t;
    }

    public int total_cardinal() { // devolve o total de nomes de frutas
        int soma = 0; // inicializa a soma a 0
        for (Estufa a : this.lista) { // percorre a lista de estufas
            if (a instanceof cardinal) { // se a estufa for do tipo cardinal
               cardinal c = (cardinal) a; // converte a estufa para o tipo cardinal
               soma = soma + c.cardinalidade(); // soma a cardinalidade da estufa à soma
            }
        }
        return soma; // devolve a soma
    }


    public double valor() { // devolve o valor total das estufas
        double total1 = 0; // inicializa o total a 0
        for (Estufa a : this.lista) { // percorre a lista de estufas
            total1 = total1 + a.ValorTotal(); // soma o valor total da estufa à soma
        }
        return total1; // devolve a soma
    }


    public int videiras()
    {
        int acc = 0; // inicializa o contador a 0

        for(Estufa x:this.lista) // percorre a lista de estufas

        {

            if(x instanceof Vinha) // se a estufa for do tipo Vinha

                acc += ((Vinha)x).getPes(); // soma o numero de pés da estufa ao contador
        }

        return(acc); // devolve o contador

    }

    public double perdasFruta() { // devolve o valor total das perdas de fruta
        double temp = 0; // inicializa o total a 0
        for (Estufa c : this.lista) { // percorre a lista de estufas
            if (c instanceof Fruta) { // se a estufa for do tipo Fruta
                temp = temp + c.ValorTotal(); // soma o valor total da estufa ao total
            }
        }
        return temp; // devolve o total
    }

    public double perdasFlores() { // devolve o valor total das perdas de flores
        double temp = 0; // inicializa o total a 0
        for (Estufa c : this.lista) { // percorre a lista de estufas
            if (c instanceof Flores) { // se a estufa for do tipo Flores
                temp = temp + c.ValorTotal(); // soma o valor total da estufa ao total
            }
        }
        return temp; // devolve o total
    }


    public double perdasLegumes() { // devolve o valor total das perdas de legumes
        double temp = 0; // inicializa o total a 0
        for (Estufa c : this.lista) { // percorre a lista de estufas
            if (c instanceof Legumes) { // se a estufa for do tipo Legumes
                temp = temp + c.ValorTotal(); // soma o valor total da estufa ao total
            }
        }
        return temp; // devolve o total
    }




}
