package lab1;

import java.util.ArrayList;

/**
 * Created by shaungould on 2/3/16.
 */
public class ConnectionManager {

    private ArrayList<Connection> connections = new ArrayList<Connection>();

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public Connection connectionMaker(String IP, Protocol protocol){
        Connection connectionIPAndProtocol = new ManagedConnection(IP, protocol);
        connections.add(connectionIPAndProtocol);

        return connectionIPAndProtocol;
    }
    public Connection connectionMaker(String IP, String port){
        Connection connectionCustom = new ManagedConnection(IP, port);
        connections.add(connectionCustom);
        return connectionCustom;
    }



    private class ManagedConnection implements Connection{
        String IP;
        String port;
        Protocol protocol;

        public String getIP() {
            return IP;
        }

        public String getPort() {
            return port;
        }

        public Protocol getProtocol() {
            return protocol;
        }

        public String connect(){
            return "connected";
        }

        public void close(){

        }

        public ManagedConnection(String IP, Protocol protocol){
            this.IP = IP;
            this.protocol = protocol;
        }

        public ManagedConnection(String IP, String port){
            this.IP = IP;
            this.port = port;
            protocol = Protocol.HTTP;
        }

    }

}
