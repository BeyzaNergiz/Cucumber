package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QalitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
        qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.cookiesElementi.click();
    }
    @Then("username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String kullaniciEmail) {
        qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(kullaniciEmail));
    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
        qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.loginButonu.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        qualitydemyPage = new QualitydemyPage();
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());
    }

    @Then("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        qualitydemyPage = new QualitydemyPage();
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
    }
}
