package view;

import controller.AlunoJpaDAO;
import model.Aluno;

public class App 
{
    public static void main( String[] args )
    {
    	Aluno aluno = new Aluno();
    	aluno.setId(1);
        aluno.setNome("Aluno1");
    	aluno.setCpf("111.222.333-45");
    	aluno.setEndAluno("Endereço1");
        
        AlunoJpaDAO.getInstance().merge(aluno);
        System.out.println("Objetos salvo com sucesso!!!");
    }
}
