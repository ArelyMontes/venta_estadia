package com.venta_estadia.model;

import javax.persistence.*;

@Entity
@Table(name="detalleventa")
public class DetalleVenta {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
	private Long id_detalleventa;
	
	private String medio_pago;
	private Integer cantidad_prod;
	private String vendedor;
	private String sucursal;
	
	@OneToOne
	@JoinColumn(name="id_venta")
	private Venta venta;
	
	
	public Long getId_detalleventa() {
		return id_detalleventa;
	}
	public void setId_detalleventa(Long id_detalleventa) {
		this.id_detalleventa = id_detalleventa;
	}
	public String getMedio_pago() {
		return medio_pago;
	}
	public void setMedio_pago(String medio_pago) {
		this.medio_pago = medio_pago;
	}
	public Integer getCantidad_prod() {
		return cantidad_prod;
	}
	public void setCantidad_prod(Integer cantidad_prod) {
		this.cantidad_prod = cantidad_prod;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	
}
