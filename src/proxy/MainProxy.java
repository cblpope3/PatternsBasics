package proxy;

public class MainProxy {

    public static void main(String[] args) {
        Database postgresDB = new Database("postgres");
        Database mySQLdb = new Database("mysql");

        DatabaseConnector localhostConnector = new DatabaseConnector("localhost", "5432");
        DatabaseConnector remoteConnector = new DatabaseConnector("remotesite.com", "3306");

        System.out.println(localhostConnector.connect(postgresDB));
        System.out.println(localhostConnector.connect(mySQLdb));
        System.out.println(remoteConnector.connect(postgresDB));
    }
}