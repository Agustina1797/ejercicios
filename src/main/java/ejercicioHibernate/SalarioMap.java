package ejercicioHibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "salary", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })

public class SalarioMap {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer Id;

	@Column(name = "mes", unique = true, nullable = false, length = 100)
	private int mes;

	@Column(name = "total", unique = false, nullable = false, length = 100)
	private Float total;

	@Column(name = "fecha", unique = false, nullable = false, length = 100)
	private Date fecha;

	@ManyToOne
	@JoinColumn(name = "employee", nullable = false)
	private ClienteEntity clientesal;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ClienteEntity getClientesal() {
		return clientesal;
	}

	public void setClientesal(ClienteEntity clientesal) {
		this.clientesal = clientesal;
	}

}
