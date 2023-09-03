package metodos;

import org.json.JSONObject;
import org.junit.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pages.ApiPage;

public class MetodosApi {
    private static ApiPage apiPage;

    public MetodosApi() {
        apiPage = new ApiPage();
    }

    public void iniciarGet(String url) {
        apiPage.sendGet(url);
    }

    public void validarStatusCode(int expectedStatusCode) {
        try {
            int statusCode = apiPage.getStatusCode();
            Assert.assertEquals(expectedStatusCode, statusCode);
            System.out.println("Status Code validado é: " + statusCode);
        } catch (AssertionError e) {
            int actualStatusCode = apiPage.getStatusCode();
            String responseBody = apiPage.getResponseBody();
            String errorMessage = "Erro ao validar Status Code. Esperado: " + expectedStatusCode
                    + ", mas foi recebido: " + actualStatusCode;
            System.err.println(errorMessage);
            System.err.println("Resposta do servidor: " + responseBody);
            Assert.fail(errorMessage);
        } catch (Exception e) {
            String errorMessage = "Erro inesperado ao validar Status Code: " + expectedStatusCode;
            System.err.println(errorMessage);
            Assert.fail(errorMessage);
        }
    }

    public void validarNomeDaLista(String nomeEsperado) {
        try {
            JSONObject responseJson = new JSONObject(apiPage.getResponseBody());
            JSONObject data = responseJson.getJSONObject("data");
            JSONObject list = data.getJSONObject("list");
            String actualName = list.getString("name");

            Assert.assertEquals(nomeEsperado, actualName);
            System.out.println("Nome da Lista validado: " + actualName);
        } catch (Exception e) {
            e.printStackTrace();
            String errorMessage = "Erro ao validar o nome da Lista. Esperado: " + nomeEsperado;
            System.err.println(errorMessage);
            Assert.fail(errorMessage);
        }
    }
    
    public void bodyResponse () {
    	String responseBody = apiPage.getResponseBody();
        System.out.println(responseBody);
    }
}
