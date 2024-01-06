package CuentasBanco.CuentasBanco.Dao;

import org.springframework.data.repository.CrudRepository;
import CuentasBanco.CuentasBanco.Models.MovimientosCuentasBancarias;

public interface MovimientoCuentaBancariaDao extends CrudRepository<MovimientosCuentasBancarias, Long> {
	
}
