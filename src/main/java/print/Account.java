package print;

import io.qameta.allure.Step;
import org.apache.commons.lang3.StringUtils;

public class Account {

    public Account(String name) {
    }
    @Step ("Данные передаваемые на принтер для печати: {name}")
        public boolean checkNameToEmboss( String name) {
        if (name.isBlank() ) {
            System.out.println("Данные не для печати, строка пустая");
            return false;
        } else if (name.startsWith(" ")){
            System.out.println("Данные не для печати, строка содержит пробелы в начале строки");
            return false;
        } else if (name.endsWith(" ")){
                System.out.println("Данные не для печати, строка содержит пробелы в конце строки");
                return false;
        } else if (name.length() < 3){
                System.out.println("Данные не для печати, строка содержит меньше 3-х символов");
                return false;
        } else if (name.length() > 19){
            System.out.println("Данные не для печати, строка содержит больше 19-и символов");
            return false;
        } else if (StringUtils.countMatches(name, " ") != 1) {
            System.out.println("Данные не для печати, строка содержит больше 1-ого пробела или пробел отсутствует");
                return false;
            } else {
            System.out.println("Можно печатать. Данные корректны");
                return  true;}
    }

}

