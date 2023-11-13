package com.FacturacionYCocinaPP2.entities;
import org.hibernate.envers.Audited;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name="detalle_factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class DetalleFactura extends Base{
	@Column(name="cantidad")
	private int cantidad;					//unidades compradas de cada producto.
	
	@Column(name="subtotal")
	private double subtotal;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_producto")
	private Producto producto;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_factura")
	private Factura factura;
}
