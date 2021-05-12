package Carro;

import Carro.Carros;

public class Principal {

  public static void  main(String[] args) {
    Carros c1 = new Carros();
    c1.potencia = 10;
    c1.nome = "Corcel";
    c1.velocidade = 0;

    Carros c2 = new Carros();
    c2.potencia = 15;
    c2.nome = "Carango";
    c2.velocidade = 0;

    c1.acelerar();
    c1.frear();

    c1.imprimir();
    c2.imprimir();

  }
}
