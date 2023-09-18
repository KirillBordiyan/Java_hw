package kirill.programHwOOP.hw6.model.client;

import kirill.programHwOOP.hw6.model.mails.Letter;
import kirill.programHwOOP.hw6.model.mails.SendingOption;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Client {
    private String fio;
    private String address;
    private SendingOption sendingOption;


    public Client(String fio, String address){
        this(fio, address, null);
    }
}
