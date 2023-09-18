package kirill.programHwOOP.hw6.model.mails;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EMail extends Letter implements EmailInterface{
    private boolean couldResponse;

    public EMail(String topic, String message, boolean couldResponse) {
        super(topic, message);
        this.couldResponse = couldResponse;
    }

    @Override
    public void returnBack(String mailAddressFrom) {
        System.out.println("send from " + mailAddressFrom);
    }
}
