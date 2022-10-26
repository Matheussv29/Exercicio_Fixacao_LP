package br.com.newton.lp.exercicio.Sacolao;

import javax.swing.*;

public class Principal {
    public static void main(String[] args){
        Fruta f1 = new Fruta();
        f1.nome = "Uva";


        Fruta f2 = new Fruta();
        f2.nome = "Melancia";


        Fruta f3 = new Fruta();
        f3.nome = "Banana";


        Sacolao sc = new Sacolao();
        sc.nome = ("Sacolao Feras");
        sc.adicionarFruta(f1);
        sc.adicionarFruta(f2);
        sc.adicionarFruta(f3);

        int qtdeFrutas = sc.getQuantidadeFrutas();

        JOptionPane.showMessageDialog( null ,"A lista de frutas\ndo "+sc.nome+ " \npossui: "+qtdeFrutas+" frutas.", "Menssagem", JOptionPane.INFORMATION_MESSAGE);


    }
}
