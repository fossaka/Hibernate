package view;

import controller.AlunoJpaDAO;
import model.Aluno;
import model.Turma;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Turma turma = new Turma();
    	turma.setNmTurma("Turma1");
    	turma.setDuracao("3 semestres");
    	turma.setPeriodo("Noturno");
    	
    	Aluno aluno = new Aluno();
        aluno.setNome("Aluno2");
    	aluno.setCpf("222.333.444-56");
    	aluno.setEndAluno("Endereço2");
        
        AlunoJpaDAO.getInstance().merge(aluno);
        System.out.println("Objetos salvo com sucesso!!!");
    }
}
