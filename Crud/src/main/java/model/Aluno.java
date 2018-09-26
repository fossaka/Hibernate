package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	@Id
	private int id;
	@Column 
	private String nmAluno;
	@Column
	private String cpfAluno;
	@Column
	private String endAluno;
	
    public int getId() {
        return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	
	public String getNmAluno() {
		return nmAluno;
	}
	public void setNome(String nmAluno) {
		this.nmAluno = nmAluno;
	}
	
	public String getCpfAluno() {
		return cpfAluno;
	}
	public void setCpf(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	
	public String getEndAluno() {
		return endAluno;
	}
	public void setEndAluno(String endAluno) {
		this.endAluno = endAluno;
	}
}
