package lab1;

/**
 * Created by shaungould on 2/3/16.
 */
public interface Connection {


    public String getIP();

    public String getPort();

    public Protocol getProtocol();

    public String connect();

    public void close();
}
