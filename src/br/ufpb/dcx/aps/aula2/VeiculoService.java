package br.ufpb.dcx.aps.aula2;

public class VeiculoService extends GenericService<Veiculo> {

	@Override
	public int cadastrar(Veiculo veiculo) {
		veiculo.getModelo().novoVeiculo();
		veiculo.getModelo().getMarca().novoVeiculo();
		return super.cadastrar(veiculo);
	}


}
