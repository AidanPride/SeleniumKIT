package googleSearchPageObject.utils;

import org.testng.annotations.DataProvider;

public class DataProviderGoogle {

    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider(){
        String url = "https://www.google.com.ua";
        String text1 =  "Selenium";

        String text2 = "Кракозябра - не баг, а личность";

        return new Object[][]{{url , text1} , {url , text2}};
    }
}
