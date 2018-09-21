package model;

import javax.persistence.*;

@Entity
public class Clientes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_clientes;
	
	@Column
	private String nmCliente;
	
	@Column
	private String endCliente;
	
	@Column
	private String emailCliente;

	public int getIdClientes() {
		return id_clientes;
	}
	
	public void setIdCliente(int id_clientes) {
		this.id_clientes = id_clientes;
	}
	
	public String getNmCliente() {
		return nmCliente;
	}
	
	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}
	
	public String getEndCliente() {
		return endCliente;
	}
	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
}
