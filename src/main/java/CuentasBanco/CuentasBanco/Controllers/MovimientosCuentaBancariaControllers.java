package CuentasBanco.CuentasBanco.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import CuentasBanco.CuentasBanco.Rest.MovimientosCuentaBancariaRest;
import CuentasBanco.CuentasBanco.Services.IMovimientoBancarioService;

@RestController
@RequestMapping("/v1")
public class MovimientosCuentaBancariaControllers {
	
	@Autowired
	IMovimientoBancarioService imovCuentaBancariaService;
	
	
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(value = "/transaction")
	public String crear(@RequestBody MovimientosCuentaBancariaRest request){
		return imovCuentaBancariaService.crear(request);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/moveAccounts/balance/{idCuenta}")
	public Long balance(@PathVariable Long idCuenta){	
		return imovCuentaBancariaService.balance(idCuenta);
	}
}
