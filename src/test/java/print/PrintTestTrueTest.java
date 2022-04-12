package print;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrintTestTrueTest {

    private final String name;

    public PrintTestTrueTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Татьяна Рыбченко"},
                {"Татьяна РыбченкоАлe"},
                {"Татьяна РыбченкоАл"},
                {"Т а"},
        };
    }
    @Test
    @DisplayName("Данные для печати.")
    @Description("Данные корреткны для печати, строка может содержать: корректные все условия, ровно 19 символов, ровно 18 символов, ровно 3 символа ")
    public void printDataCorrectTest()  {
        Account account = new Account(name);

        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых:", expectedData, actualData);
    }

}
