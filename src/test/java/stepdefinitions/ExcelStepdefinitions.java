package stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelStepdefinitions {

    String excelSatirindakiUrunIsmi;
    double excelSatirindakiMinUrunMiktari;
    double toSayfasindaBulunanUrunSayisi;
    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Then("urun excelindeki {string} daki urunun min. miktarini ve urunismini kaydeder")
    public void urun_excelindeki_daki_urunun_min_miktarini_ve_urunismini_kaydeder(String istenenSatir) throws IOException {

        String filePath = "src/test/resources/urunler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        int index = Integer.parseInt(istenenSatir) - 1;

        excelSatirindakiUrunIsmi = sheet.getRow(index).getCell(0).getStringCellValue();
        excelSatirindakiMinUrunMiktari = sheet.getRow(index).getCell(1).getNumericCellValue();
    }

    @Then("urun ismini testotomasyonu sayfasinda aratir ve bulunan sonuc sayisini kaydeder")
    public void urun_ismini_testotomasyonu_sayfasinda_aratir_ve_bulunan_sonuc_sayisini_kaydeder() {

        testotomasyonuPage.searchBox.sendKeys(excelSatirindakiUrunIsmi + Keys.ENTER);

        String searchResultStr = testotomasyonuPage.resultWebElement.getText();
        searchResultStr = searchResultStr.replaceAll("\\D", "");

        toSayfasindaBulunanUrunSayisi = Double.parseDouble(searchResultStr);
    }

    @Then("bulunan sonuc sayisinin {string} da verilen min. miktara esit veya daha fazla oldugunu test eder")
    public void bulunan_sonuc_sayisinin_da_verilen_min_miktara_esit_veya_daha_fazla_oldugunu_test_eder(String row) {

        Assertions.assertTrue(excelSatirindakiMinUrunMiktari <= toSayfasindaBulunanUrunSayisi);
    }
}
