package com.FacturacionYCocinaPP2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FacturacionYCocinaPP2.entities.DetalleFactura;
import com.FacturacionYCocinaPP2.services.DetalleFacturaServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/detalles")
public class DetalleFacturaController extends BaseControllerImpl<DetalleFactura, DetalleFacturaServiceImpl>{

}
