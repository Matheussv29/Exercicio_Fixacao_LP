package br.com.newton.lp.exercicio.carro;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args){

         Carro c1 = new Carro();
         c1.nome = "Palio";
         c1.cor = "Cinza";
         c1.valor = Double.parseDouble("50.000");

        Carro c2 = new Carro();
        c2.nome = "Gol";
        c2.cor = "Preto";
        c2.valor = Double.parseDouble("70.000");

        Carro c3 = new Carro();
        c3.nome = "C3";
        c3.cor = "Azul";
        c3.valor = Double.parseDouble("30.000");

        Agencia ag = new Agencia();
        ag.nome = ("Agencia Feras");
        ag.adicionarCarro(c1);
        ag.adicionarCarro(c2);
        ag.adicionarCarro(c3);

        double valCarro = ag.calcularPrecoTotalAgencia();
        int qtdeCarros = ag.getQuantidadeCarros();

        JOptionPane.showMessageDialog( null ,"A lista de carros da " + ag.nome + " possui " + qtdeCarros + " carros e a soma de valores"+" é R$"+ valCarro, "Menssagem", JOptionPane.INFORMATION_MESSAGE);


    }

}
