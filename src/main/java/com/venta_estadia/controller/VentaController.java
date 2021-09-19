package com.venta_estadia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venta_estadia.model.Venta;
import com.venta_estadia.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
	
	@Autowired
	VentaService ventaService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Venta>> lista(){
		List<Venta> lista=ventaService.lista();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value="{id}")
	public ResponseEntity<Venta>SP_GetVentaDia(@PathVariable("id") Long id){
		Optional<Venta> venta=ventaService.getById(id);
		return ResponseEntity.ok(venta.get());
	}
	
	
	@PostMapping("/nuevo")
	public ResponseEntity<?> SP_SETGeneraVenta(@RequestBody Venta venta){
		ventaService.SP_SETGeneraVenta(venta);
		return new ResponseEntity("venta guardada", HttpStatus.CREATED);
		
	}
	
	
}
