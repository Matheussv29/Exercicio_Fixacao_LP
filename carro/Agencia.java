package br.com.newton.lp.exercicio.carro;

import br.com.newton.lp.exercicio.moto.Moto;

import java.util.ArrayList;


public class Agencia {
     public String nome;

     // Criando uma lista de Carros do Tipo Carro.
    // Um ArrayList de Carros.
    ArrayList<Carro> listaCarros = new ArrayList<Carro>();

    // Criando um método sem retorno, para incluir tipos de Carro
    // dentro da lista de carros.

    public void adicionarCarro(Carro carro){
        listaCarros.add(carro);
    }

    // Utilizando a propriedade size da classe ArrayList para contar
    // a quantidade de carros da lista.

    public int getQuantidadeCarros(){
        return listaCarros.size();
    }

    public double calcularPrecoTotalAgencia(){

        double somaValor = 0.0;

        for(int i=0;i<listaCarros.size();i++){
            Carro c = (Carro)listaCarros.get(i);
            somaValor += c.valor;
        }
        return somaValor;
    }


}

