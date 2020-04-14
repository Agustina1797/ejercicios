package ejercicioHibernate;

import java.util.List;

public class ClienteService {
	
	private ClienteDao cliente;

	public ClienteDao getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDao cliente) {
		this.cliente = cliente;
	}
	
	public void insertCliente (ClienteEntity cli) {
		cliente.insertCliente(cli);
	}
	
	public List<ClienteEntity> getAllCliente() {
		return cliente.getAllCliente();		
	}
	
	public static void  deleteCliente(ClienteEntity cli) {
		cliente.deleteCliente(cli);
	}

}
