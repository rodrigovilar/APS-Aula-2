package br.ufpb.dcx.aps.aula2;

public class App {
	
	private static GenericService<Marca> marcaService = new GenericService<Marca>();
	private static ModeloService modeloService = new ModeloService();
	private static VeiculoService veiculoService = new VeiculoService();

	public static void main(String[] args) {
		Marca vw = new Marca("Volkswagen");
		int vwId = marcaService.cadastrar(vw);
		Marca vwRetornada = marcaService.get(vwId);
		
		assert "Marca [nome=Volkswagen]".equals(vwRetornada.toString());

		Modelo gol = new Modelo("Gol", vw);
		int golId = modeloService.cadastrar(gol);
		Modelo golRetornado = modeloService.get(golId);
		
		assert "Modelo [nome=Gol, marca=Marca [nome=Volkswagen]]"
			.equals(golRetornado.toString());
		
		assert 1 == vw.getQuantidadeModelos();
		
		Veiculo meuCarro = new Veiculo("Branco", 2012, gol);
		int meuCarroId = veiculoService.cadastrar(meuCarro);
		Veiculo meuCarroRetornado = veiculoService.get(meuCarroId);
		
		assert ("Veiculo [cor=Branco, ano=2012, modelo="
				+ "Modelo [nome=Gol, marca=Marca [nome=Volkswagen]]]")
			.equals(meuCarroRetornado.toString());

		Veiculo meuCarro2 = new Veiculo("Vermelho", 1990, gol);
		veiculoService.cadastrar(meuCarro2);

		assert 2 == gol.getQuantidadeVeiculos();
	}
	
	
	
	
	
	
	
	
	
	
}
