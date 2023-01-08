package users;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Sender implements User{
    int id;
    String status;

    public Sender() {
        this.id = IdCount.generateID();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
