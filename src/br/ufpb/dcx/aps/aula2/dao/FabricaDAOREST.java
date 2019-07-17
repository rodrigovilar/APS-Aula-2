package br.ufpb.dcx.aps.aula2.dao;

public class FabricaDAOREST implements FabricaDAO {

	@Override
	public MarcaDAO criarMarcaDAO() {
		return new MarcaDAOREST();
	}

	@Override
	public ModeloDAO criarModeloDAO() {
		return new ModeloDAOREST();
	}

	@Override
	public VeiculoDAO criarVeiculoDAO() {
		return new VeiculoDAOREST();
	}

}
