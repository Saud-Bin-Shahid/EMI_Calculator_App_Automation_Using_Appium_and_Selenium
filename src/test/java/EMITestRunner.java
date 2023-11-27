import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EMITestRunner extends Setup {
    @BeforeTest
    public void startEMIClc(){
        EMIScreen emiScreen=new EMIScreen(driver);
        emiScreen.btnStart.click();
    }
    @Test(priority = 1, dataProviderClass = DataSet.class, dataProvider = "data-provider")
    public void calculateEMI(int amount, double interest, int year, double processingFee,double mEMI, double tInterest, int pFee, double tPayment){
        EMIScreen emiScreen=new EMIScreen(driver);
        emiScreen.calculateEMI(amount, interest, year, processingFee);

        String actualmEMI=emiScreen.lblMonthlyEMI.getText().replace(",","");
        String actualtInterest=emiScreen.lblTotalInterest.getText().replace(",","");
        String actualpFee=emiScreen.lblProcessingFee.getText().replace(",","");
        String actualtPayment=emiScreen.lblTotalPayment.getText().replace(",","");

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualmEMI,String.valueOf(mEMI));
        softAssert.assertEquals(actualtInterest,String.valueOf(tInterest));
        softAssert.assertEquals(actualpFee,String.valueOf(pFee));
        softAssert.assertEquals(actualtPayment,String.valueOf(tPayment));
        softAssert.assertAll();

        emiScreen.btnRestart.click();
    }
}
