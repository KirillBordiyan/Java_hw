package kirill.programHwOOP.hw6.model.mails;

import kirill.programHwOOP.hw6.model.client.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Letter implements SendingOption{
    private String topic;
    private String message;

    @Override
    public void send(Client client, Object mail) {
        System.out.println("send");
    }

    @Override
    public void take(Client client, Object mail) {
        System.out.println("take");
    }
}
