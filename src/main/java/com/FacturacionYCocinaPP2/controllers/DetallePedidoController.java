package com.FacturacionYCocinaPP2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FacturacionYCocinaPP2.entities.DetallePedido;
import com.FacturacionYCocinaPP2.services.DetallePedidoServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/detallespedidos")
public class DetallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl>{

}
