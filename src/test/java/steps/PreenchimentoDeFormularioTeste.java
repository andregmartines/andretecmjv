package steps;

import java.io.IOException;
import java.util.UUID;


import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import pages.PreenchimentoFormulario;
import runner.Executa;

public class PreenchimentoDeFormularioTeste {
	PreenchimentoFormulario form = new PreenchimentoFormulario();
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	UUID uniqueKey = UUID.randomUUID();


	@Dado("que estou na página {string}")
	public void queEstouNaPágina(String url) {
		Executa.abrirNavegador(url);

	}

	@Quando("preencho o formulário para cadastro")
	public void preenchoOFormulárioParaCadastro() throws IOException, InterruptedException {
		String username = "andreteste"+ uniqueKey;
		String email = username +"@gmail.com";
		form.preencherFormulario("André", "Martines", email, "rua teste", "São Paulo", "Brazil",
				"Sao Paulo", "03560060", username, "teste123", "teste123", "1formularioPreenchido");
	}

	@Quando("valido mensagem {string} depois clico no botão continuar")
	public void validoMensagemDepoisClicoNoBotãoContinuar(String textoEsperado) throws IOException {
		metodo.validarTexto(textoEsperado, elemento.msgCreate);
		metodo.screenshot("2validacaoSucesso");
		metodo.clicar(elemento.btnContinue);
	}

	@Então("verifico se o usuário está logado")
	public void verificoSeOUsuárioEstáLogado() throws IOException {
		metodo.validarUrl("https://automationteststore.com/index.php?rt=account/account");
		metodo.validarTexto("Welcome back André", elemento.loginCabecalho);
		metodo.validarTexto("André", elemento.loginMyaccount);
		metodo.screenshot("3paginaLogada");
		Executa.fecharNavegador();
	}
}
