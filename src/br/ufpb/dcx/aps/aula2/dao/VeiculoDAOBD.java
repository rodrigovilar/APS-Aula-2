package br.ufpb.dcx.aps.aula2.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula2.Veiculo;

public class VeiculoDAOBD implements VeiculoDAO{

	@Override
	public void inserir(Veiculo t) {
		System.out.println("Inserindo veiculo " + t + " no BD");
	}

	@Override
	public void editar(Veiculo t) {
		System.out.println("Atualizando veiculo " + t + " no BD");
	}

	@Override
	public void remover(Veiculo t) {
		System.out.println("Removendo veiculo " + t + " do BD");
	}

	@Override
	public List<Veiculo> listar() {
		System.out.println("Listando veiculos do BD");
		return null;
	}

	@Override
	public Veiculo obter(int id) {
		System.out.println("Obtendo o veiculo " + id + " do BD");
		return null;
	}

}
