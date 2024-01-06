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

import CuentasBanco.CuentasBanco.Rest.CuentaBancariaRest;
import CuentasBanco.CuentasBanco.Services.ICuentaBancariaService;


@RestController
@RequestMapping("/v1")
public class CuentaBancariaControllers {
	
	@Autowired
	private ICuentaBancariaService icuentaBancariaService;
	
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(value = "/accounts")
	public String crear(@RequestBody CuentaBancariaRest request){
		return icuentaBancariaService.crear(request);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/accounts/{id}")
	public CuentaBancariaRest consultaCuentaBancariaID(@PathVariable Long id) {
		CuentaBancariaRest response =  icuentaBancariaService.obtener(id);
		return response;
	}

}
