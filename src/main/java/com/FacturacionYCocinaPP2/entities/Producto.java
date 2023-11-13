package com.FacturacionYCocinaPP2.entities;

import java.util.ArrayList;
import java.util.List;
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
@Table (name="producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Producto extends Base{
	@Column(name="cantidad")
	private int cantidad;				//cantidad total en stock.
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private Double precio;
	
	@OneToMany(mappedBy="producto", cascade = CascadeType.PERSIST)
	private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
	
	@OneToMany(mappedBy="producto", cascade = CascadeType.PERSIST)
	private List<DetallePedido> detallesPedido = new ArrayList<DetallePedido>();
	
}
