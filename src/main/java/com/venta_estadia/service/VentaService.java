package com.venta_estadia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.venta_estadia.model.Venta;
import com.venta_estadia.repository.VentaRepository;

@Service
public class VentaService {
	
	@Autowired
	VentaRepository ventaRepository;
	
	public List<Venta>lista(){
		return ventaRepository.listaProcedure();
		
	}
	
	public Optional<Venta> getById(Long id){
		return ventaRepository.SP_GetVentaDia(id);
		
	}
	
	public void SP_SETGeneraVenta(Venta venta) {
		ventaRepository.SP_SETGeneraVenta(venta.getFolio(),venta.getNombre_cliente(), venta.getFecha(), venta.getTotal());;
	}
}
