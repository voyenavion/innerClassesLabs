package lab1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shaungould on 2/3/16.
 */
public class ConnectionManagerTest {

    ConnectionManager connectionManager;
    @Before
    public void init(){
        connectionManager = new ConnectionManager();
    }

    @Test
    public void testConnectionMaker() throws Exception {
        Connection managedConnection1 = connectionManager.connectionMaker("ip234", "port456");
        assertTrue(managedConnection1 instanceof Connection);
    }

    @Test
    public void testConnectionMaker1() throws Exception {
        Connection managedConnection2 = connectionManager.connectionMaker("ip884", Protocol.IMAP);
        assertEquals("ip884", connectionManager.getConnections().get(0).getIP());
    }
}