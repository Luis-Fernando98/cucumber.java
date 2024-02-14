package selenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pom.Comics;

public class test extends TestBase {

    @Given("^el usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Throwable {
        Assert.assertTrue(home.homeIsDisplayed());
    }

    @When("^hace click sobre el boton the The Little Tester comics$")
    public void hace_click_sobre_el_boton_the_The_Little_Tester_comics() throws Throwable {
        home.clickOnTitleComics();
    }


    @Then("^se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a al pagina de Comics",comics.isDisplayed());


    }