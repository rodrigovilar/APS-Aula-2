package br.ufpb.dcx.aps.aula2.dao;

public interface FabricaDAO {

	MarcaDAO criarMarcaDAO();
	ModeloDAO criarModeloDAO();
	VeiculoDAO criarVeiculoDAO();
}
