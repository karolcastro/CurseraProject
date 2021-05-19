package Pontuacao;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RegistroPontosTest {

    @Test
    public void pontosCriarTopico(){
        Usuario usuario = new Usuario();
        usuario.nome = "Karol";
        usuario.vip = true;

        CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
        RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
        registroPontos.criarUmTopico(usuario);

        assertEquals(usuario.pontos, 25);
    }

    @Test
    public void pontosCriarTopicoBonusDoDia(){
        Usuario usuario = new Usuario();
        usuario.nome = "Karol";

        CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
        calculadoraBonus.bonusDoDia = 3;
        RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
        registroPontos.criarUmTopico(usuario);

        assertEquals(usuario.pontos, 15);
    }

    @Test
    public void pontosCriarTopicoVipBonusDoDia(){
        Usuario usuario = new Usuario();
        usuario.nome = "Karol";
        usuario.vip = true;

        CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
        calculadoraBonus.bonusDoDia = 2;
        RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
        registroPontos.criarUmTopico(usuario);

        assertEquals(usuario.pontos, 50);
    }
}