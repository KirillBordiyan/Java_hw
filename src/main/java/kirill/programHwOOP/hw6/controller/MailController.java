package kirill.programHwOOP.hw6.controller;

import kirill.programHwOOP.hw6.model.client.Client;
import kirill.programHwOOP.hw6.model.mails.EMail;

import java.util.Scanner;

public class MailController {
    public void start(Client from, Client to){

        System.out.println("1 - отправить\n2 - получить");

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option){
            case "1": {
                if (from.getSendingOption() instanceof EMail) {
                    if(((EMail) from.getSendingOption()).isCouldResponse()){
                        EMail sendingOption = ((EMail) from.getSendingOption());
                        sendingOption.returnBack(to.getAddress());
                    }
                    else{
                        System.out.println("cant response, rb is false");
                    }
                } else {
                    from.getSendingOption().send(to, from.getSendingOption());
                    to.setSendingOption(from.getSendingOption());
                    from.setSendingOption(null);
                }
                break;
            }
            case "2":{
                from.getSendingOption().take(to, from.getSendingOption());
                to.setSendingOption(from.getSendingOption());
                from.setSendingOption(null);
                break;
            }
        }
    }
}
