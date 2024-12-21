package stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepdefinitions {

    String excelSatirindakiUrunIsmi;
    double excelSatirindakiMinUrunMiktari;
    double toSayfasindaBulunanUrunSayisi;

    @Then("urun excelindeki {string} daki urunun min. miktarini ve urunismini kaydeder")
    public void urun_excelindeki_daki_urunun_min_miktarini_ve_urunismini_kaydeder(String istenenSatir) throws IOException {

        String contentRoot = "src/test/resources/urunler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(contentRoot);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet calisilanSayfa = workbook.getSheet("Sheet1");

        int index = Integer.parseInt(istenenSatir) - 1;

        excelSatirindakiUrunIsmi = calisilanSayfa.getRow(index).getCell(0).getStringCellValue();
        excelSatirindakiMinUrunMiktari = calisilanSayfa.getRow(index).getCell(1).getNumericCellValue();

        System.out.println(excelSatirindakiUrunIsmi);
        System.out.println(excelSatirindakiMinUrunMiktari);
    }

    @Then("urun ismini testotomasyonu sayfasinda aratir ve bulunan sonuc sayisini kaydeder")
    public void urun_ismini_testotomasyonu_sayfasinda_aratir_ve_bulunan_sonuc_sayisini_kaydeder() {


    }

    @Then("bulunan sonuc sayisinin {string} da verilen min. miktara esit veya daha fazla oldugunu test eder")
    public void bulunan_sonuc_sayisinin_da_verilen_min_miktara_esit_veya_daha_fazla_oldugunu_test_eder(String string) {


    }
}
