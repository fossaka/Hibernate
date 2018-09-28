package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Curso {

@Entity
@Table(name="tb_curso")
public class Aluno{
	
	@Id @OneToMany (mappedBy = "idCurso", targetEntity = Aluno.class, cascade = CascadeType.ALL)
	private int idCurso;
	
	@Column
	private String nmCurso;
	
	@Column
	private String periodoCurso;
	
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	
	public String getNmCurso() {
		return nmCurso;
	}
	public void setNmCurso(String nmCurso) {
		this.nmCurso = nmCurso;
	}
	
	public String getPeriodoCurso() {
		return periodoCurso;
	}
	public void setPeriodoCurso(String periodoCurso){
		this.periodoCurso = periodoCurso;
	}
}

}
