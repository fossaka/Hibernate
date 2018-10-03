package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "tb_turma")
public class Turma implements Serializable {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(mappedBy="idTurma", targetEntity=Aluno.class,cascade=CascadeType.ALL)
	private int idTurma;
	@Column
	private String nmTurma;
	@Column
	private String duracao;
	@Column
	private String periodo;
	
    public int getIdTurma() {
        return idTurma;
	}
	public void setIdTurma(int idTurma) {
	    this.idTurma = idTurma;
	}
	
	public String getNmTurma() {
		return nmTurma;
	}
	public void setNmTurma(String nmTurma) {
		this.nmTurma = nmTurma;
	}
	
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
