package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Establecimiento")
public class Establecimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEstablecimiento;

	@Column(name = "adressEstablecimiento", nullable = false, length = 120)
	private String adressEstablecimiento;

	@Column(name = "nameEstablecimiento", nullable = false, length = 100)
	private String nameEstablecimiento;

	@Column(name = "reserva", nullable = false)
	private Boolean reserva;

	@Column(name = "tipoServicio", nullable = false, length = 100)
	private String tipoServicio;

	@Column(name = "balonOxigeno", nullable = false, length = 100)
	private String balonOxigeno;

	public Establecimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Establecimiento(int idEstablecimiento, String adressEstablecimiento, String nameEstablecimiento,
			Boolean reserva, String tipoServicio, String balonOxigeno) {
		super();
		this.idEstablecimiento = idEstablecimiento;
		this.adressEstablecimiento = adressEstablecimiento;
		this.nameEstablecimiento = nameEstablecimiento;
		this.reserva = reserva;
		this.tipoServicio = tipoServicio;
		this.balonOxigeno = balonOxigeno;
	}

	public int getIdEstablecimiento() {
		return idEstablecimiento;
	}

	public void setIdEstablecimiento(int idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}

	public String getAdressEstablecimiento() {
		return adressEstablecimiento;
	}

	public void setAdressEstablecimiento(String adressEstablecimiento) {
		this.adressEstablecimiento = adressEstablecimiento;
	}

	public String getNameEstablecimiento() {
		return nameEstablecimiento;
	}

	public void setNameEstablecimiento(String nameEstablecimiento) {
		this.nameEstablecimiento = nameEstablecimiento;
	}

	public Boolean getReserva() {
		return reserva;
	}

	public void setReserva(Boolean reserva) {
		this.reserva = reserva;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getBalonOxigeno() {
		return balonOxigeno;
	}

	public void setBalonOxigeno(String balonOxigeno) {
		this.balonOxigeno = balonOxigeno;
	}

}
