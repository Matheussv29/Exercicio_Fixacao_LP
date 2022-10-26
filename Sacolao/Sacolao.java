package br.com.newton.lp.exercicio.Sacolao;
import br.com.newton.lp.exercicio.carro.Carro;

import java.util.ArrayList;

public class Sacolao {
    String nome;

    ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();

    public void adicionarFruta(Fruta fruta) {
        listaFrutas.add(fruta);
    }
    public int getQuantidadeFrutas(){
        return listaFrutas.size();
    }

}
