package AntesEDepois;

import org.junit.*;

public class AntesDepois {

    @Before// uma vez antes de cada teste
    public void before(){
        System.out.println("@Before");
    }

    @After// uma vez depois de cada teste
    public void after(){
        System.out.println("@after");
    }

    @BeforeClass// antes de todos os testes
    public static void beforeClass(){
        System.out.println("@beforeClass");
    }

    @AfterClass// depois de todos os testes
    public static void afterClass(){
        System.out.println("@afterClass");
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
