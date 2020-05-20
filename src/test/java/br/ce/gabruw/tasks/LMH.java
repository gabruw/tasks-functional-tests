package br.ce.gabruw.tasks;

import br.ce.gabruw.context.Context;
import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LMH extends Context {
    @Test
    public void saveTaskTextWithouDate() throws MalformedURLException {
        WebDriver driver = Context.accessApplication(5);

        try {
            driver.findElement(By.id("addTodo")).click();
            driver.findElement(By.id("task")).sendKeys("Teste via Selenium data Vazia");

            driver.findElement(By.id("dueDate")).sendKeys("");
            driver.findElement(By.id("saveButton")).click();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void saveTaskWithOldDate() throws MalformedURLException {
        WebDriver driver = Context.accessApplication(5);

        try {
            driver.findElement(By.id("addTodo")).click();
            driver.findElement(By.id("task")).sendKeys("Teste via Selenium data Anterior");

            driver.findElement(By.id("dueDate")).sendKeys("26/01/2020");
            driver.findElement(By.id("saveButton")).click();
        } finally {
            driver.quit();
        }
    }
}