package br.com.newton.lp.exercicio.moto;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        Moto m1 = new Moto();
        m1.nome = "CG ";
        m1.cor = "Vermelha";
        m1.valor = Double.parseDouble("10.000");


        Moto m2 = new Moto();
        m2.nome = "Tyger ";
        m2.cor = "Cinza";
        m2.valor = Double.parseDouble("80.000");


        Agencia ag = new Agencia();
        ag.nome = ("Agencia Feras");
        ag.adicionarMoto(m1);
        ag.adicionarMoto(m2);

        double valMoto = ag.calcularPrecoTotalAgencia();
        int qtdeMotos = ag.getQuantidadeMotos();

        JOptionPane.showMessageDialog(null, "A lista de motos da " + ag.nome + " possui " + qtdeMotos + " motos e a soma de valores"+" é R$"+ valMoto, "Menssagem", JOptionPane.INFORMATION_MESSAGE);

    }
}
