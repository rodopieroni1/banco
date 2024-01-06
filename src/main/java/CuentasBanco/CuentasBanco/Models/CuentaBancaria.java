package CuentasBanco.CuentasBanco.Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUENTABANCARIA")
public class CuentaBancaria {
	
	@Id
	@Column(length = 36)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCuenta;
	
	@Column(name = "NOMBRECUENTA", length = 36)
	private String nombreCuenta;
	
	@Column(name = "NUMEROCUENTA", length = 36)
	private String numeroCuenta;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cuentabancaria")
	private List<MovimientosCuentasBancarias> movimientosCuentasBancarias;
		

	public Long getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getNombreCuenta() {
		return nombreCuenta;
	}
	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

}
