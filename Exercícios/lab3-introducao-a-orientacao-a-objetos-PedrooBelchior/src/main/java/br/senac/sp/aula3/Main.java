package br.senac.sp.aula3;

import javax.swing.JOptionPane;

/*
 * @author pedro.saraujo
 */

//Tarefa 2:
public class Main {

    public static void main(String[] args) {
        
        //Instancio o objeto da classe Carro
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Modelo do carro: Nissan 370z");
        meuCarro.setCor("Cor do carro: Branco");
        JOptionPane.showMessageDialog(null, meuCarro.getModelo() + "\n" + meuCarro.getCor());
        
        //Instancio outro objeto da classe Carro
        Carro carroRodizio = new Carro();
        carroRodizio.setModelo("Modelo do carro: Nissan GTR");
        carroRodizio.setCor("Cor do carro: Preto");
        JOptionPane.showMessageDialog(null, carroRodizio.getModelo() + " - " + carroRodizio.getCor());
    }

}
