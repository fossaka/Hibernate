package model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import antlr.collections.List;
import model.Turma;
 
@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable {
	
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    @ManyToOne (mappedBy ="Aluno")
    ArrayList<Object> alunos = new ArrayList<>();
	@Column 
	private String nmAluno;
	@Column
	private String cpfAluno;
	@Column
	private String endAluno;
	
	
	
	
	
	public Turma getIdTurma() {
		return idTurma;
	};
	public void setIdTurma(Turma idTurma) {
		this.idTurma = idTurma;
	}
	
	
	
	
    public int getId() {
        return id;
	};
	public void setId(int id) {
	    this.id = id;
	};
	
	public String getNmAluno() {
		return nmAluno;
	};
	public void setNome(String nmAluno) {
		this.nmAluno = nmAluno;
	};
	
	public String getCpfAluno() {
		return cpfAluno;
	};
	public void setCpf(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	};
	
	public String getEndAluno() {
		return endAluno;
	};
	public void setEndAluno(String endAluno) {
		this.endAluno = endAluno;
	};
};
