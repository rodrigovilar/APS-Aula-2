package br.ufpb.dcx.aps.aula2.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula2.Marca;

public class MarcaDAOTXT implements MarcaDAO{

	@Override
	public void inserir(Marca t) {
		System.out.println("Inserindo marca " + t + " no TXT");
	}

	@Override
	public void editar(Marca t) {
		System.out.println("Atualizando marca " + t + " no TXT");
	}

	@Override
	public void remover(Marca t) {
		System.out.println("Removendo marca " + t + " do TXT");
	}

	@Override
	public List<Marca> listar() {
		System.out.println("Listando marcas do TXT");
		return null;
	}

	@Override
	public Marca obter(int id) {
		System.out.println("Obtendo a marca " + id + " do TXT");
		return null;
	}

}
