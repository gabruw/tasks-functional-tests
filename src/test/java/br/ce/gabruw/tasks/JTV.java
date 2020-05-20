package br.ce.gabruw.tasks;

import br.ce.gabruw.context.Context;
import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GMF extends Context {
    @Test
    public void saveTaskWithSuccess() throws MalformedURLException {
        WebDriver driver = Context.accessApplication(5);

        try {
            driver.findElement(By.id("addTodo")).click();
            driver.findElement(By.id("task")).sendKeys("Teste via Selenium");

            driver.findElement(By.id("dueDate")).sendKeys("10/10/2100");
            driver.findElement(By.id("saveButton")).click();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void removeTaskWithSuccess() throws MalformedURLException {
        WebDriver driver = Context.accessApplication(5);

        try {
            driver.findElement(By.id("remove1")).click();
        } finally {
            driver.quit();
        }
    }
}