package Compra;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComprasTest {

  @Test
  public void compraAVista() {
    Compras c = new Compras(500);
    assertEquals(1, c.getNumeroDeParcelas());
    assertEquals(500, c.getValorTotal());
    assertEquals(500, c.getValorParcela());
  }

  @Test
  public void compraParcelado() {
    Compras c = new Compras(4, 250);
    assertEquals(4, c.getNumeroDeParcelas());
    assertEquals(1000, c.getValorTotal());
    assertEquals(250, c.getValorParcela());
  }

}