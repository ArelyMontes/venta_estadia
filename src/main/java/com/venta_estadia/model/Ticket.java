package com.venta_estadia.model;

import javax.persistence.*;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
	private Long id_ticket;
	
	private String nom_empresa;
	private String dirección;
	private Integer cajero;
	
	@OneToOne
	@JoinColumn(name="id_venta")
	private Venta venta;

	public Long getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(Long id_ticket) {
		this.id_ticket = id_ticket;
	}

	public String getNom_empresa() {
		return nom_empresa;
	}

	public void setNom_empresa(String nom_empresa) {
		this.nom_empresa = nom_empresa;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public Integer getCajero() {
		return cajero;
	}

	public void setCajero(Integer cajero) {
		this.cajero = cajero;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
}
