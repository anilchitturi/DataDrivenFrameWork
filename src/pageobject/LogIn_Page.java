 package pageobject;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LogIn_Page {

private static WebElement element = null;

public static WebElement txtbx_UserName(WebDriver driver){

element = driver.findElement(By.id("Email"));

return element;
}

 public static WebElement txtbx_Password(WebDriver driver){

 element = driver.findElement(By.id("Passwd"));
 return element;}

 public static WebElement btn_LogIn(WebDriver driver){

 element = driver.findElement(By.id("signIn"));

 return element;}

}