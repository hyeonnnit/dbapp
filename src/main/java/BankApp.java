import controller.BankController;
import dao.BankDAO;

public class BankApp {
    public static void main(String[] args) {
        String url = "selectAll";
        /**
         * 의존성 어쩌구
         */
        BankDAO dao = new BankDAO();
        BankController con = new BankController(dao);
        Dispatcher dis = new Dispatcher(con);
        dis.route(url);

    }
}

