package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import metodos.MetodosApi;

public class GetEmApiTeste {
	MetodosApi metodo = new MetodosApi();

	@Dado("que envio um get para o endpoint {string}")
	public void queEnvioUmGetParaOEndpoint(String url) {
		metodo.iniciarGet(url);

	}

	@Quando("recebo a resposta da API")
	public void receboARespostaDaAPI() {
		metodo.bodyResponse();

	}

	@Então("valido o status code {int}")
	public void validoOStatusCode(Integer statusCode) {

		metodo.validarStatusCode(statusCode);

	}

	@Então("valido o conteúdo do campo name {string}")
	public void validoOConteúdoDoCampoName(String nomeEsperdo) {

		metodo.validarNomeDaLista(nomeEsperdo);

	}

}
