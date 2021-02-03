
package com.abaco.repository;

import com.abaco.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CuentaRepository extends JpaRepository<Cuenta, String >{
    public List<Cuenta> findByNumeroCuenta(String numeroCuenta);
}
