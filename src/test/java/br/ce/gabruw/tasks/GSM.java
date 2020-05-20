package br.ce.gabruw.tasks;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.ce.gabruw.context.Context;

public class GSM extends Context{

	@Test
	public void dataInvalida() throws MalformedURLException {
		WebDriver driver = Context.accessApplication(5);

	    try {
	        driver.findElement(By.id("addTodo")).click();
	        driver.findElement(By.id("task")).sendKeys("Teste via Selenium");
	
	        driver.findElement(By.id("dueDate")).sendKeys("20/05/1980");
	        driver.findElement(By.id("saveButton")).click();
	    } finally {
	        driver.quit();
	    }
	}
	
	@Test
	public void textoNaoPreenchido() throws MalformedURLException {
		WebDriver driver = Context.accessApplication(5);

	    try {
	        driver.findElement(By.id("addTodo")).click();
	        driver.findElement(By.id("task")).sendKeys("");
	
	        driver.findElement(By.id("dueDate")).sendKeys("20/05/2020");
	        driver.findElement(By.id("saveButton")).click();
	    } finally {
	        driver.quit();
	    }
	}
}
