import db.Connection;
import decorators.BasketDecorator;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import flowerstore.*;
import order.Order;
import users.IdCount;
import users.Receiver;
import users.Sender;
import users.User;

import java.io.SequenceInputStream;

public class Main {
    public static void main(String[] args) {

        Connection aaa = Connection.getConnection();
        Connection aaa1 = Connection.getConnection();

        System.out.println(aaa == aaa1);

    }
}
