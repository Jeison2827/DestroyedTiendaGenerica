package co.edu.unbosque.model;

import co.edu.unbosque.model.DAO.ClientesDAO;
import co.edu.unbosque.model.DAO.ConfiguracionDAO;
import co.edu.unbosque.model.DAO.ProductosDAO;
import co.edu.unbosque.model.DAO.ProveedoresDAO;

public class ClaseFachada {
	
	private ConfiguracionDAO configuracionDAO;
	private ClientesDAO clientesDAO;
	private ProveedoresDAO proveedoresDAO;
	private ProductosDAO productosDAO;
	
	public ClaseFachada() {
		
		configuracionDAO = new ConfiguracionDAO();
		clientesDAO = new ClientesDAO();
		proveedoresDAO = new ProveedoresDAO();
		productosDAO = new ProductosDAO();
		
	}

	public ConfiguracionDAO getConfiguracionDAO() {
		return configuracionDAO;
	}
	
	public ClientesDAO getClientesDAO() {
		return clientesDAO;
	}

	public ProveedoresDAO getProveedoresDAO() {
		return proveedoresDAO;
	}

	public ProductosDAO getProductosDAO() {
		return productosDAO;
	}
	
	

}
