package AntesEDepois;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AntesDepois {

    @Before
    public void before(){
        System.out.println("@Before");
    }

    @After
    public void after(){
        System.out.println("@after");
    }

    @Test
    public void test1(){
        System.out.println("Teste1");
    }

    @Test
    public void test2(){
        System.out.println("Teste2");
    }

    @Test
    public void test3(){
        System.out.println("Teste3");
    }

}
