package CuentasBanco.CuentasBanco.Services;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CuentasBanco.CuentasBanco.Dao.CuentaBancariaDao;
import CuentasBanco.CuentasBanco.Models.CuentaBancaria;
import CuentasBanco.CuentasBanco.Rest.CuentaBancariaRest;

@Service
public class CuentaBancariaServicesImpl implements ICuentaBancariaService {
	
	private static final Logger log = LoggerFactory.getLogger(CuentaBancariaServicesImpl.class);
	public static final ModelMapper modelMapper = new ModelMapper();

	
	@Autowired
	CuentaBancariaDao cuentaBancariaDao;
	
	@Override
	public String crear(CuentaBancariaRest cuentabancariarest) {
		log.info("Inicio metodo Crear Cuenta bancaria");
		CuentaBancaria cuentabancaria = new CuentaBancaria();
		System.out.println("cuentabancariarest"+ cuentabancariarest.getNumeroCuenta());
		try {
			cuentabancaria.setIdCuenta(cuentabancariarest.getIdCuenta());
			cuentabancaria.setNombreCuenta(cuentabancariarest.getNombreCuenta());
			cuentabancaria.setNumeroCuenta(cuentabancariarest.getNumeroCuenta());
			cuentaBancariaDao.save(cuentabancaria);
			System.out.println("Se Ingreso correctamente la cuenta con el numero: "+ cuentabancaria.getIdCuenta());
		} catch (Exception e) {
			log.error("Error en Grabar el movimiento en la Cuenta Bancaria");
		}
		return String.valueOf("Se almaceno correctamente la cuenta: "+cuentabancaria.getIdCuenta());
	}
	
	
	public CuentaBancariaRest obtener(Long id) {
		CuentaBancariaRest valor = modelMapper.map(getCuentaBancariaEntity(id), CuentaBancariaRest.class);
		return valor;
	}

	private CuentaBancaria getCuentaBancariaEntity(Long id) {
		return cuentaBancariaDao.findByIdCuenta(id);

	}

}
