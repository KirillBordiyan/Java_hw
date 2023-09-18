package kirill.programHwOOP.hw6.app;

import kirill.programHwOOP.hw6.controller.MailController;
import kirill.programHwOOP.hw6.model.client.Client;
import kirill.programHwOOP.hw6.model.mails.EMail;

public class ProgramHw6 {
    public static void main(String[] args) {
        Client client1 = new Client("cl 1", "email@mail.com",
                new EMail("t1", "message 1", true));
        Client client2 = new Client("cl 2", "mail2@mail.com");


        MailController mailController = new MailController();
        mailController.start(client1, client2);



    }
}
