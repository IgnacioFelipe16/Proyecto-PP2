package com.FacturacionYCocinaPP2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FacturacionYCocinaPP2.entities.Pedido;
import com.FacturacionYCocinaPP2.services.PedidoServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{

}
