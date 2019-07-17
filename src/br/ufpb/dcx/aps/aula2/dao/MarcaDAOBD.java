package br.ufpb.dcx.aps.aula2.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula2.Marca;

public class MarcaDAOBD implements MarcaDAO{

	@Override
	public void inserir(Marca t) {
		System.out.println("Inserindo marca " + t + " no BD");
	}

	@Override
	public void editar(Marca t) {
		System.out.println("Atualizando marca " + t + " no BD");
	}

	@Override
	public void remover(Marca t) {
		System.out.println("Removendo marca " + t + " do BD");
	}

	@Override
	public List<Marca> listar() {
		System.out.println("Listando marcas do BD");
		return null;
	}

	@Override
	public Marca obter(int id) {
		System.out.println("Obtendo a marca " + id + " do BD");
		return null;
	}

}
