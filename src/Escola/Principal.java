package Escola;

public class Principal {
    public static void main(String[] args){
        Aluno nomeAluno = new Aluno();
        nomeAluno.bim1 = 70;
        nomeAluno.bim2 = 60;
        nomeAluno.bim3 = 80;
        nomeAluno.bim4 = 70;

        System.out.println(nomeAluno.media());
        System.out.println(nomeAluno.passouDeAno());
    }
}
