package Compra;

public class Compras {

  int valorTotal;
  int numeroDeParcelas;

  //a vista
  public Compras(int valor) {
    valorTotal = valor;
    numeroDeParcelas = 1;
  }

  //parcelado
  public Compras(int qntParcelas, int valorParcela) {
    numeroDeParcelas = qntParcelas;
    valorTotal = valorParcela * qntParcelas;
  }
  public int getValorTotal() {
    return valorTotal;
  }

  public int getNumeroDeParcelas() {
    return numeroDeParcelas;
  }

  public int getValorParcela() {
    return valorTotal/numeroDeParcelas;
  }
}
