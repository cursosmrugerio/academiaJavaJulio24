package apxJava.v6;

public class DatabaseWrapper {
    String url = "jdbc://derby://localhost:1527//mydb";
    
    static DatabaseWrapper getDatabase() {
        System.out.println("Getting DB");
        //System.out.println(url);
        return new DatabaseWrapper();
    }

    public static void main(String[] args) {
        System.out.println(getDatabase().url);
        
//        DatabaseWrapper dbw = null;
//        System.out.println(dbw.url);
    }
}
