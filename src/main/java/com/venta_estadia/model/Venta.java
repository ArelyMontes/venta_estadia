package com.venta_estadia.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
	private Long id_venta;
	
	private Integer folio;
	private String nombre_cliente;
	private LocalDate fecha = LocalDate.now();
	private Integer total;
	
	
	public Long getId_venta() {
		return id_venta;
	}
	public void setId_venta(Long id_venta) {
		this.id_venta = id_venta;
	}
	public Integer getFolio() {
		return folio;
	}
	public void setFolio(Integer folio) {
		this.folio = folio;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	

}
