package kirill.programHwOOP.hw6.model.mails;

import kirill.programHwOOP.hw6.model.client.Client;

public interface SendingOption<T>{
    public void send(Client client, T mail);
    public void take(Client client, T mail);
}
