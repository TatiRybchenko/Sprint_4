import io.qameta.allure.Description;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;

import static org.junit.Assert.assertEquals;


public class PrintTest {

    @DisplayName("В строке с данными содержится два пробела. Данные не для печати. ")
    @Description("В строке с данными содержится два пробела. Данные не для печати, строка содержит больше 1-ого пробела.")
    @Test
    public void
    containsTwoSpacesInTheData() {
        final String name = "Тать яна Рыб ченко";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: указано пробелов меньше одного или отсутствует", expectedData, actualData);
    }

    @DisplayName("В строке с данными содержится один пробел. Данные для печати. ")
    @Description("В строке с данными содержится один пробел. Данные корреткны для печати, строка содержит  один пробел.")
    @Test
    public void
    containsOneSpacesInTheData() {
        final String name = "Татьяна Рыбченко";

        Account account = new Account(name);
        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: указано больше одного пробела", expectedData, actualData);
    }

    @DisplayName("В строке с данными нет пробелов. Данные для печати. ")
    @Description("В строке с данными нет пробелов. Данные корреткны для печати, строка не содержит пробелы.")
    @Test
    public void
    containsNoSpacesInTheData() {
        final String name = "ТатьянаРыбченко";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных отсутствует пробел", expectedData, actualData);
    }

    @DisplayName("В строке с данными 20 символов. Данные не для печати. ")
    @Description("В строке с данными больше 19 символов. Данные не для печати, строка содержит больше 19-и символов.")
    @Test
    public void
    containsTwentySymbolInTheData() {
        final String name = "ТатьянаРыбченко Александровна";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных меньше 20 символов", expectedData, actualData);
    }

    @DisplayName("В строке с данными ровно 19 символов. Данные для печати.")
    @Description("В строке с данными ровно 19 символов. Данные корреткны для печати, строка содержит 19 символов.")
    @Test
    public void
    containsNineteenSymbolInTheData() {
        final String name = "Татьяна РыбченкоАлe";

        Account account = new Account(name);
        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных больше 19 символов", expectedData, actualData);
    }

    @DisplayName("В строке с данными ровно 18 символов. Данные для печати.")
    @Description("В строке с данными ровно 18 символов. Данные корреткны для печати, строка содержит 18 символов.")
    @Test
    public void
    containsEighteenSymbolInTheData() {
        final String name = "Татьяна РыбченкоАл";

        Account account = new Account(name);
        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных больше 19 символов", expectedData, actualData);
    }

}
