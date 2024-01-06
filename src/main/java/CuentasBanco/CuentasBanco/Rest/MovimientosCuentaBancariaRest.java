package CuentasBanco.CuentasBanco.Rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovimientosCuentaBancariaRest {
	
	@JsonProperty("idMovimiento")
	private Long idMovimiento;
	
	@JsonProperty("estado")
	private String estado;
	
	@JsonProperty("saldoAlMomento")
	private Long saldoAlMomento;
	
	@JsonProperty("descripcionmovimiento")
	private String descripcionMovimiento;
	
	@JsonProperty("idCuenta")
	private Long idCuenta;


	public Long getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(Long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

}
