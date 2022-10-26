package br.com.newton.lp.exercicio.moto;

import br.com.newton.lp.exercicio.carro.Carro;

import java.util.ArrayList;

public class Agencia {

    String nome;

    // Criando uma lista de Carros do Tipo Moto.
    // Um ArrayList de Motos.
    ArrayList<Moto> listaMotos = new ArrayList<Moto>();

    // Criando um método sem retorno, para incluir tipos de Carro
    // dentro da lista de carros.

    public void adicionarMoto(Moto moto){
        listaMotos.add(moto);
    }

    // Utilizando a propriedade size da classe ArrayList para contar
    // a quantidade de motos da lista.

    public int getQuantidadeMotos(){
        return listaMotos.size();
    }

    public float calcularPrecoTotalAgencia(){

        float somaValor = 0.0F;

        for(int i=0;i<listaMotos.size();i++){
            Moto m = (Moto)listaMotos.get(i);
            somaValor += m.valor;
        }
        return somaValor;
    }

}

