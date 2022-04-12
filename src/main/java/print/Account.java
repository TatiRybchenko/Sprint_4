package print;

import io.qameta.allure.Step;
import org.apache.commons.lang3.StringUtils;

public class Account {

    public Account(String name) {
    }
    @Step ("Данные передаваемые на принтер для печати: {name}")
        public boolean checkNameToEmboss(String name) {
        if (StringUtils.isBlank(name) ) {
            return false;
        } else if (StringUtils.startsWith(name," ")){
            return false;
        } else if (StringUtils.endsWith(name," ")){
            return false;
        } else if (name.length() < 3){
            return false;
        } else if (name.length() > 19){
           return false;
        } else if (StringUtils.countMatches(name, " ") != 1) {
           return false;
        } else {
           return  true;}
    }

}

