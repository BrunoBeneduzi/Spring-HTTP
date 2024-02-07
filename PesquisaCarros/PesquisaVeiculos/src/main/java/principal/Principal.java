package principal;

import java.util.List;

import model.Dados;
import service.ConsumoApi;
import service.ConverteDados;

public class Principal {
	private final String URL= "https://parallelum.com.br/fipe/api/v1/carros/marcas"; 
	private ConsumoApi api = new ConsumoApi();
	private ConverteDados converte = new ConverteDados();
	
	public void principal() {
	var json = api.obterDados(URL);
	
	List<Dados> x = converte.obterLista(json, Dados.class);
		
	System.out.println(x.size());

	
	}
	
	
}