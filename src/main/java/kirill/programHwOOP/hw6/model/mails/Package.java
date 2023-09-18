package kirill.programHwOOP.hw6.model.mails;


import kirill.programHwOOP.hw6.model.client.Client;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Package implements SendingOption {
    private String message;
    private int weight;
    private int volume;

    public Package(String message, int weight, int volume) {
        this.message = message;
        this.weight = weight;
        this.volume = volume;
    }


    @Override
    public void send(Client client, Object mail) {
        System.out.println("package send");
    }

    @Override
    public void take(Client client, Object mail) {
        System.out.println("package take");
    }
}
