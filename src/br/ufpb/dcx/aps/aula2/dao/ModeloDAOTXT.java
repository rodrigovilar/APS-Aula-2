package br.ufpb.dcx.aps.aula2.dao;

import java.util.List;

import br.ufpb.dcx.aps.aula2.Modelo;

public class ModeloDAOTXT implements ModeloDAO{

	@Override
	public void inserir(Modelo t) {
		System.out.println("Inserindo modelo " + t + " no TXT");
	}

	@Override
	public void editar(Modelo t) {
		System.out.println("Atualizando modelo " + t + " no TXT");
	}

	@Override
	public void remover(Modelo t) {
		System.out.println("Removendo modelo " + t + " do TXT");
	}

	@Override
	public List<Modelo> listar() {
		System.out.println("Listando modelos do TXT");
		return null;
	}

	@Override
	public Modelo obter(int id) {
		System.out.println("Obtendo o modelo " + id + " do TXT");
		return null;
	}

}
