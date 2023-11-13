package com.FacturacionYCocinaPP2.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FacturacionYCocinaPP2.entities.DetallePedido;
import com.FacturacionYCocinaPP2.repositories.BaseRepository;
import com.FacturacionYCocinaPP2.repositories.DetallePedidoRepository;

@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido, Long> implements DetallePedidoService{

	@Autowired
	private DetallePedidoRepository detallePedidoRepository;

	public DetallePedidoServiceImpl(BaseRepository<DetallePedido, Long> baseRepository,
			DetallePedidoRepository detallePedidoRepository) {
		super(baseRepository);
		this.detallePedidoRepository = detallePedidoRepository;
	}

}
