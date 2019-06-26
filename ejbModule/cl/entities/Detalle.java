package cl.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DETALLE database table.
 * 
 */
@Entity
@NamedQuery(name="Detalle.findAll", query="SELECT d FROM Detalle d")
public class Detalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codigodetalle;

	private BigDecimal estado;

	private BigDecimal precio;

	private BigDecimal stock;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="CODIGOPRODUCTO")
	private Producto producto;

	//bi-directional many-to-one association to Venta
	@ManyToOne
	@JoinColumn(name="CODIGOVENTA")
	private Venta venta;

	public Detalle() {
	}

	public long getCodigodetalle() {
		return this.codigodetalle;
	}

	public void setCodigodetalle(long codigodetalle) {
		this.codigodetalle = codigodetalle;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getStock() {
		return this.stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}