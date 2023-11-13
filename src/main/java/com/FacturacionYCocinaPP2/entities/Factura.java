package com.FacturacionYCocinaPP2.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table (name="factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
@SQLDelete(sql = "UPDATE factura SET eliminada=true WHERE id = ?")
@Where(clause = "eliminada=false")
public class Factura extends Base{
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="cliente")
	private String cliente;
	
	@Column(name="cuit_cuil")
	private Integer cuitCuil;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="envio")
	private Double envio;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="forma_pago")
	private String formaPago;
	
	@Column(name="telefono")
	private Integer telefono;
	
	@Column(name="vendedor")
	private String vendedor;
	
	@Column(name="total")
	private Double total;
	
	@Column(name="eliminada")
	private Boolean eliminada;
	
	@OneToMany(mappedBy="factura", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
}
