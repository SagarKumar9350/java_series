package Lazy;

public class DBConnection {
    private static DBConnection conObject;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
            //error: if 2 thread come concurrently they will find conOject null and can initialize 2 object
        }
        return conObject;
    }
}
