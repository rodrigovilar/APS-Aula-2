package br.ufpb.dcx.aps.aula2;

import br.ufpb.dcx.aps.aula2.dao.FabricaDAO;
import br.ufpb.dcx.aps.aula2.dao.MarcaDAO;
import br.ufpb.dcx.aps.aula2.dao.ModeloDAO;
import br.ufpb.dcx.aps.aula2.dao.VeiculoDAO;

public class LogicaApp {
	
	private FabricaDAO fabrica;

	public LogicaApp(FabricaDAO fabrica) {
		this.fabrica = fabrica;
	}

	public void rodar() {
		
		MarcaDAO marcaDAO = fabrica.criarMarcaDAO();
		Marca marca = new Marca(null);
		
		marcaDAO.inserir(marca);
		marcaDAO.editar(marca);
		marcaDAO.remover(marca);
		marcaDAO.listar();
		marcaDAO.obter(0);
		
		ModeloDAO modeloDAO = fabrica.criarModeloDAO();
		Modelo modelo = new Modelo(null, marca);
		
		modeloDAO.inserir(modelo);
		modeloDAO.editar(modelo);
		modeloDAO.remover(modelo);
		modeloDAO.listar();
		modeloDAO.obter(0);

		VeiculoDAO veiculoDAO = fabrica.criarVeiculoDAO();
		Veiculo veiculo = new Veiculo(null, 0, modelo);
		
		veiculoDAO.inserir(veiculo);
		veiculoDAO.editar(veiculo);
		veiculoDAO.remover(veiculo);
		veiculoDAO.listar();
		veiculoDAO.obter(0);

	}

}
