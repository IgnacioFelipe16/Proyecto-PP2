package com.FacturacionYCocinaPP2.entities;

import java.util.ArrayList;
import java.util.Date;
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
@Table (name="pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
@SQLDelete(sql = "UPDATE pedido SET listo=true WHERE id = ?")
@Where(clause = "listo=false")
public class Pedido extends Base{
	@Column(name="comentario")
	private String comentario;
	
	@Column(name="listo")
	private Boolean listo;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="tiempo_estimado")
	private int tiempoEstimado;
	
	@OneToMany(mappedBy="pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetallePedido> detallesPedido = new ArrayList<DetallePedido>();
}
