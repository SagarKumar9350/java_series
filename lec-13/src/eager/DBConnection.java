package eager;

public class DBConnection {
    private static DBConnection conObject =  new DBConnection();
    //memory is already created without even initializing the object of DBConnection that's why known as eager initialization

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        return conObject;
    }
}
