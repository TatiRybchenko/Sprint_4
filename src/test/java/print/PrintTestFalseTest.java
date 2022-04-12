package print;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PrintTestFalseTest {
    private final String name;

    public PrintTestFalseTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Тать яна Рыб ченко"},
                {"ТатьянаРыбченко"},
                {"ТатьянаРыбченко Александровна"},
                {"Та"},
                {"ТатьянаРыбченко "},
                {" ТатьянаРыбченко"},
                {""},
                {null},
        };
    }
    @Test
    @DisplayName("Данные не для печати.")
    @Description("Данные не для печати, строка может содержать: больше 1-ого пробела, без пробелов, больше 19 символов, меньше 3-х символов, пробел в конце, пробел в начале, без символов, значение null.")
    public void printDataNoCorrectTest() {
        Account account = new Account(name);

        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: ", expectedData, actualData);
    }

}
