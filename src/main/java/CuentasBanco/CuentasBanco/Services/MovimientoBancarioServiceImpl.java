package CuentasBanco.CuentasBanco.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CuentasBanco.CuentasBanco.Dao.CuentaBancariaDao;
import CuentasBanco.CuentasBanco.Dao.MovimientoCuentaBancariaDao;
import CuentasBanco.CuentasBanco.Models.CuentaBancaria;
import CuentasBanco.CuentasBanco.Models.MovimientosCuentasBancarias;
import CuentasBanco.CuentasBanco.Rest.MovimientosCuentaBancariaRest;

@Service
public class MovimientoBancarioServiceImpl implements IMovimientoBancarioService {
		
	@Autowired
	MovimientoCuentaBancariaDao movimientoCuentaBancariaDao;
	@Autowired
	CuentaBancariaDao cuentaBancariaDao;
	
	public String crear(MovimientosCuentaBancariaRest movimientoCuentaBancariaRest) {
		MovimientosCuentasBancarias movimientoCuentaBancario = new MovimientosCuentasBancarias();
		final CuentaBancaria idCuenta = cuentaBancariaDao.findByIdCuenta(movimientoCuentaBancariaRest.getIdCuenta());
		if(movimientoCuentaBancariaRest.getDescripcionMovimiento() == "Deposito" ||   movimientoCuentaBancariaRest.getDescripcionMovimiento() == "Deposito"  ) {
			try {
			movimientoCuentaBancario.setIdMovimientos(movimientoCuentaBancariaRest.getIdMovimiento());
			movimientoCuentaBancario.setDescripcionMovimiento(movimientoCuentaBancariaRest.getDescripcionMovimiento());
			movimientoCuentaBancario.setEstado(movimientoCuentaBancariaRest.getEstado());
			movimientoCuentaBancario.setSaldoAlMomento(movimientoCuentaBancariaRest.getSaldoAlMomento());
			movimientoCuentaBancario.setCuentabancaria(idCuenta);			
			movimientoCuentaBancariaDao.save(movimientoCuentaBancario);
			System.out.println("Se Ingreso correctamente la cuenta con el numero: "+ movimientoCuentaBancario.getSaldoAlMomento());

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return String.valueOf(movimientoCuentaBancario.getIdMovimientos());
		}
		return "Los movimientos deben ser por Retiro o Extraccion";
	}

	public Long balance(Long idCuenta) {
		Long balance = 0L;
		List<MovimientosCuentasBancarias> movimientos = (List<MovimientosCuentasBancarias>) movimientoCuentaBancariaDao.findAll();
				for (int i=0; i < movimientos.size(); i++){
if((Long.compare(movimientos.get(i).getCuentabancaria().getIdCuenta(), idCuenta) == 0) 	&& (movimientos.get(i).getEstado()).equals("Activo")) {
						balance = Long.sum(balance, movimientos.get(i).getSaldoAlMomento());
					}
				}
		
		return balance;
	}

}
