package br.senac.sp.aula3;

/*
 * @author pedro.saraujo
 */

//Tarefa 1:
public class Carro {

    private String fabricante;
    private String[] rodas;
    private String cor;
    private String modelo;
    private int velocidadeAtual;

    public Carro() {
    }

    //Retornar o fabricante do veiculo
    public String getFabricante() {
        return fabricante;
    }

    //Definir o fabricante do veículo
    public void setFabricante(String sFab) {
        this.fabricante = sFab;
    }

    //Retornar a roda do veículo
    public String[] getRodas() {
        return rodas;
    }

    //Definir a roda do veículo
    public void setRodas(String[] sRod) {
        this.rodas = sRod;
    }

    //Retornar a cor do veiculo
    public String getCor() {
        return cor;
    }

    //Definir a cor do veículo
    public void setCor(String sCor) {
        this.cor = sCor;
    }
    
    //Retornar o modelo do veículo
    public String getModelo() {
        return modelo;
    }

    //Definir o modelo do veículo
    public void setModelo(String sMod) {
        this.modelo = sMod;
    }
    
    //Retornar a velocidade atual do veículo
    public int velocidadeAtual() {
        return velocidadeAtual;
    }

    //Definir a velocidade atual do veículo
    public void  setVelocidadeAtual(int sVel) {
        this.velocidadeAtual = sVel;
    }

}
