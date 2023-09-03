package pages;

import java.io.IOException;

import elementos.Elementos;
import metodos.Metodos;

public class PreenchimentoFormulario {
    private Metodos metodo = new Metodos();
    private Elementos elemento = new Elementos();

    public void preencherFormulario(String firstName, String lastName, String email, String address1, String city, String country, String regionState, String zipcode, String loginName, String password, String confirmPassword, String evidencia) throws IOException, InterruptedException {
        metodo.digitar(elemento.firstName, firstName);
        metodo.digitar(elemento.lastName, lastName);
        metodo.digitar(elemento.email, email);
        metodo.digitar(elemento.adress1, address1);
        metodo.digitar(elemento.city, city);
        metodo.digitar(elemento.country, country);
        metodo.carregamento(1000);
        metodo.digitar(elemento.regionState, regionState);
        metodo.digitar(elemento.zipcode, zipcode);
        metodo.digitar(elemento.loginName, loginName);
        metodo.digitar(elemento.password, password);
        metodo.digitar(elemento.confirmPassword, confirmPassword);
        metodo.clicar(elemento.privacyPolicy);
        metodo.screenshot(evidencia);
        metodo.clicar(elemento.continuee);
    }
}
