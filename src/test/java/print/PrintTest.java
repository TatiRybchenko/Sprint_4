package print;

import io.qameta.allure.Description;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;


import static org.junit.Assert.assertEquals;


public class PrintTest {
    @Test
    @DisplayName("В строке с данными содержится два пробела. Данные не для печати. ")
    @Description("В строке с данными содержится два пробела. Данные не для печати, строка содержит больше 1-ого пробела.")
    public void containsTwoSpacesInTheData() {
        final String name = "Тать яна Рыб ченко";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: указано пробелов меньше одного или отсутствует", expectedData, actualData);
    }

    @Test
    @DisplayName("В строке с данными содержится один пробел. Данные для печати. ")
    @Description("В строке с данными содержится один пробел. Данные корреткны для печати, строка содержит  один пробел.")
    public void containsOneSpacesInTheData() {
        final String name = "Татьяна Рыбченко";

        Account account = new Account(name);
        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: указано больше одного пробела", expectedData, actualData);
    }

    @Test
    @DisplayName("В строке с данными нет пробелов. Данные для печати. ")
    @Description("В строке с данными нет пробелов. Данные корреткны для печати, строка не содержит пробелы.")
    public void containsNoSpacesInTheData() {
        final String name = "ТатьянаРыбченко";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных отсутствует пробел", expectedData, actualData);
    }

    @Test
    @DisplayName("В строке с данными 20 символов. Данные не для печати. ")
    @Description("В строке с данными больше 19 символов. Данные не для печати, строка содержит больше 19-и символов.")
    public void containsTwentySymbolInTheData() {
        final String name = "ТатьянаРыбченко Александровна";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных меньше 20 символов", expectedData, actualData);
    }

    @Test
    @DisplayName("В строке с данными ровно 19 символов. Данные для печати.")
    @Description("В строке с данными ровно 19 символов. Данные корреткны для печати, строка содержит 19 символов.")
    public void containsNineTeenSymbolInTheData() {
        final String name = "Татьяна РыбченкоАлe";

        Account account = new Account(name);
        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных больше 19 символов", expectedData, actualData);
    }
    @Test
    @DisplayName("В строке с данными ровно 18 символов. Данные для печати.")
    @Description("В строке с данными ровно 18 символов. Данные корреткны для печати, строка содержит 18 символов.")
    public void containsEighTeenSymbolInTheData() {
        final String name = "Татьяна РыбченкоАл";

        Account account = new Account(name);
        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных больше 19 символов", expectedData, actualData);
    }

    @Test
    @DisplayName("В строке с данными ровно 3 символа. Данные для печати.")
    @Description("В строке с данными ровно 3 символов. Данные корреткны для печати, строка содержит 3 символов.")
    public void containsThreeSymbolInTheData() {
        final String name = "Т а";

        Account account = new Account(name);
        boolean expectedData = true;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных больше 3-х символов", expectedData, actualData);
    }
    @Test
    @DisplayName("В строке с данными меньше 3-х символа. Данные не для печати.")
    @Description("В строке с данными 2 символа. Данные некорреткны для печати, строка содержит 2 символа.")
    public void containsTwoSymbolInTheData() {
        final String name = "Та";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных больше 3-х символов", expectedData, actualData);
    }
    @Test
    @DisplayName("В строке с данными содержится пробел в конце строки. Данные не для печати.")
    @Description("В строке с данными содержится пробел в конце строки. Данные некорреткны для печати, строка содержит символа пробела в конце строки")
    public void containsSpacesSymbolTheEndInTheData() {
        final String name = "ТатьянаРыбченко ";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных не содержится пробел в конце строки", expectedData, actualData);
    }
    @Test
    @DisplayName("В строке с данными содержится пробел в начале строки. Данные не для печати.")
    @Description("В строке с данными содержится пробел в начале строки. Данные некорреткны для печати, строка содержит символа пробела в начале строки")
    public void containsSpacesSymbolStartInTheData() {
        final String name = " ТатьянаРыбченко";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: в данных не содержится пробел в начале строки", expectedData, actualData);
    }

    @Test
    @DisplayName("Строка пустая. Данные не для печати.")
    @Description("Строка пустая. Данные некорреткны для печати, строка пустая, не содержит символов для печати.")
    public void containsEmptySymbolInTheData() {
        final String name = "";

        Account account = new Account(name);
        boolean expectedData = false;
        boolean actualData = account.checkNameToEmboss(name);

        assertEquals("Актуальные данные для печати, отличаются от ожидаемых: строка не пустая", expectedData, actualData);
    }

}
