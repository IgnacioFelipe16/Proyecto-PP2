package com.FacturacionYCocinaPP2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FacturacionYCocinaPP2.entities.Producto;
import com.FacturacionYCocinaPP2.services.ProductoServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/productos")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl>{
	
}
