package test;


import Carro.Carro;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCarro {

    @Test
    public void testAcelerar(){
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10, c.getVelocidade());

    }

    @Test
    public void carroParado(){
        Carro c = new Carro();
        c.potencia = 0;
        c.acelerar();
        assertEquals(0, c.getVelocidade());

    }

    @Test
    public void testeFrear(){
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());

    }

    @Test
    public void testeFrearAteZero(){
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());

    }
}
