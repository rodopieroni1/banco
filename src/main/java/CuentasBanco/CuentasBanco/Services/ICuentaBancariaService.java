package CuentasBanco.CuentasBanco.Services;

import org.springframework.stereotype.Service;
import CuentasBanco.CuentasBanco.Rest.CuentaBancariaRest;


@Service
public interface ICuentaBancariaService{	
	public String crear(CuentaBancariaRest cuentabancariarest);
	public CuentaBancariaRest obtener(Long idCuenta);
}
