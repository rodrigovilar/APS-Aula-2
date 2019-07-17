package br.ufpb.dcx.aps.aula2.dao;

public class FabricaDAOTXT implements FabricaDAO {

	@Override
	public MarcaDAO criarMarcaDAO() {
		return new MarcaDAOTXT();
	}

	@Override
	public ModeloDAO criarModeloDAO() {
		return new ModeloDAOTXT();
	}

	@Override
	public VeiculoDAO criarVeiculoDAO() {
		return new VeiculoDAOTXT();
	}

}
