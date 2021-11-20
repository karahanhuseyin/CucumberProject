package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith; // @Runwith notasionu juniti kullanmamamiza sebep oluyor.

@RunWith(Cucumber.class)// biz burada diyoruz ki testlerimizi cucamberla beraber calistir.
@CucumberOptions(
         features = "src/test/resources/features",
         glue = "stepdefinitions",
         tags = "@liste",

         dryRun = false
        // dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir.
        // dryRun= false ile arama yapilinca testi calistirir eksik bir adimla karsilasirsa
        // test faild olur ve bize eksik adimi raporlar
        // Eger sadece bir tane eksik adimi calistiracaksak true  ile yapmamiz lazim sadece eksik olan adimi
        // vermesi icin false dersek bosu bosuna tum testi calistrmak zorunda kaliriz.

)
public class Runners {
} // Classin icinde birsey yapmayacagiz class bos bir class,
