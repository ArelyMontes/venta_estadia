package com.venta_estadia.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.venta_estadia.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
	
	@Query (value="{call lista_procedure()}", nativeQuery=true)
	List<Venta> listaProcedure();
	
	@Query (value="{call SP_GetVentaDia(:idV)}", nativeQuery=true) 
	Optional<Venta> SP_GetVentaDia(@Param("idV") Long id);
	
	@Query (value="{call SP_SETGeneraVenta(:_folio,:_cliente,:_fecha,:_total)}",nativeQuery=true)
	void SP_SETGeneraVenta(
			@Param("_folio") Integer  _folio,
			@Param("_cliente") String _cliente,
			@Param("_fecha") LocalDate _fecha,
			@Param("_total") Integer _total
			);
	

}
