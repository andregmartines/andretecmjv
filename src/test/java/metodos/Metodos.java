package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.Drivers;

public class Metodos extends Drivers {

	public void digitar(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Erro ao tentar digitar no elemento " + elemento);
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Erro ao tentar clicar no elemento " + elemento);
		}
	}

	public void validarTexto(String textoEsperado, By elemento) {
		try {
			String texto = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, texto);
			System.out.println("O texto validado é " + texto);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Erro ao validar texto " + textoEsperado);
		}
	}

	public void validarUrl(String urlEsperada) {
		try {
			assertEquals(urlEsperada, driver.getCurrentUrl());
			System.out.println("URL validada é " + driver.getCurrentUrl());
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Erro ao validar URL " + urlEsperada);
		}
	}

	public void carregamento(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void screenshot(String nomeSrc) throws IOException {
		TakesScreenshot srcShot = ((TakesScreenshot) adriver());
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeSrc + ".png");
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("********* Evidência Gerada *********");
	}

}
