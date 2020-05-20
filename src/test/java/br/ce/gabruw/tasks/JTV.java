package br.ce.gabruw.tasks;

import br.ce.gabruw.context.Context;
import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JTV extends Context {
    
    @Test
    public void textFieldDateFieldEmpty() throws MalformedURLException {
        WebDriver driver = Context.accessApplication(5);

        try {
            driver.findElement(By.id("addTodo")).click();
            driver.findElement(By.id("task")).sendKeys("");

            driver.findElement(By.id("dueDate")).sendKeys("");
            driver.findElement(By.id("saveButton")).click();
        } finally {
            driver.quit();
        }
    }
}