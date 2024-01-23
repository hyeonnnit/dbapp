import controller.BankController;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dispatcher {
    private BankController con;

    public void route(String url){

        if (url.equals("insert")){
            con.insert();
        }else if (url.equals("delete")){
            con.delete();
        }else if (url.equals("update")){
            con.update();
        }else if (url.equals("selectOne")){
            con.selectOne();
        }else if (url.equals("selectAll")){
            con.selectAll();
        }
    }
}
