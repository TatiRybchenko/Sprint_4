package print;

import print.Account;

public class Praktikum {
    public static void main(String[] args) {

        final String name = "ТатьянаРыбченко";

        Account account = new Account(name);
        boolean fixedName = account.checkNameToEmboss(name) ;
        System.out.println(fixedName);
    }


}


