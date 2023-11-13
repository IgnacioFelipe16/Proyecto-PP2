package com.FacturacionYCocinaPP2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FacturacionYCocinaPP2.entities.Factura;
import com.FacturacionYCocinaPP2.services.FacturaServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl>{

}
