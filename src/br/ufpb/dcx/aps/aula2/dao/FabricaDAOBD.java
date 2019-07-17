package br.ufpb.dcx.aps.aula2.dao;

public class FabricaDAOBD implements FabricaDAO {

	@Override
	public MarcaDAO criarMarcaDAO() {
		return new MarcaDAOBD();
	}

	@Override
	public ModeloDAO criarModeloDAO() {
		return new ModeloDAOBD();
	}

	@Override
	public VeiculoDAO criarVeiculoDAO() {
		return new VeiculoDAOBD();
	}

}
