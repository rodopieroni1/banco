package CuentasBanco.CuentasBanco.Services;

import org.springframework.stereotype.Service;

import CuentasBanco.CuentasBanco.Rest.MovimientosCuentaBancariaRest;

@Service
public interface IMovimientoBancarioService  {	
	public String crear(MovimientosCuentaBancariaRest movimientoCuentaBancariaRest);
	public Long balance(Long idCuenta);
}
