package proxy;

public class DatabaseConnector {

    private String hostName = "localhost";
    private String port = "5432";

    public DatabaseConnector(String hostName, String port) {
        this.hostName = hostName;
        this.port = port;
    }

    public void setHost(String host) {
        this.hostName = host;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String connect(Database database) {
        return hostName + ":" + port + "/" + database.getName();
    }
}