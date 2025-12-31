package doublechecking;

public class DBConnection {
    private static volatile DBConnection conObject;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(conObject == null){
            synchronized (DBConnection.class){
                if(conObject == null){
                    conObject = new DBConnection();
                }
            }
        }
        return conObject;
    }
}
