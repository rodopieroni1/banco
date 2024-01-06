package CuentasBanco.CuentasBanco.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="MOVIMIENTOSCUENTASBANCARIAS")
public class MovimientosCuentasBancarias {
	
	@Id
	@Column(name = "IDMOVIMIENTO", length = 36)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMovimiento;
	
	@Column(name = "ESTADO", length = 36)
	private String estado;
	
	@Column(name = "SALDOALMOMENTO", length = 36)
	private Long  saldoAlMomento;
	
	@Column(name = "DESCRIPCIONMOVIMIENTO", length = 36)
	private String descripcionMovimiento;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name="IDCUENTA", nullable = false)
	private CuentaBancaria cuentabancaria;

	public Long getIdMovimientos() {
		return idMovimiento;
	}

	public void setIdMovimientos(Long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(Long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	
	public Long getSaldoAlMomento() {
		return saldoAlMomento;
	}

	public void setSaldoAlMomento(Long saldoAlMomento) {
		this.saldoAlMomento = saldoAlMomento;
	}

	public String getDescripcionMovimiento() {
		return descripcionMovimiento;
	}

	public void setDescripcionMovimiento(String descripcionMovimiento) {
		this.descripcionMovimiento = descripcionMovimiento;
	}

	public CuentaBancaria getCuentabancaria() {
		return cuentabancaria;
	}

	public void setCuentabancaria(CuentaBancaria cuentabancaria) {
		this.cuentabancaria = cuentabancaria;
	}

}
