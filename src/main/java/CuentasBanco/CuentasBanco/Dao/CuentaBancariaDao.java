package CuentasBanco.CuentasBanco.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import CuentasBanco.CuentasBanco.Models.CuentaBancaria;


@Repository
public interface CuentaBancariaDao extends CrudRepository<CuentaBancaria, Long>{
	CuentaBancaria findByIdCuenta(Long idCuenta);

}
