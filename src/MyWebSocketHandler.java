import java.io.IOException;

import jpl.Query;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

@WebSocket
public class MyWebSocketHandler {
	
	Session session;

    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        System.out.println("Close: statusCode=" + statusCode + ", reason=" + reason);
    }

    @OnWebSocketError
    public void onError(Throwable t) {
        System.out.println("Error: " + t.getMessage());
    }

    @OnWebSocketConnect
    public void onConnect(Session session) {
    	this.session = session;
        System.out.println("Connect: " + session.getRemoteAddress().getAddress());
        try {

            String t2 = "consult('C:/Users/Marcos/Documents/NetBeansProjects/AppJavaProlog/AppJavaProlog/src/cods_prolog/planejador.pl')";
            Query q2 = new Query(t2);
            System.out.println( t2 + " " + (q2.hasSolution() ? "correcto" : "fallo") );
//          

            String t3 = "consult('C:/Users/Marcos/Documents/NetBeansProjects/AppJavaProlog/AppJavaProlog/src/cods_prolog/trabalho2.pl')";
            Query q3 = new Query(t3);
            System.out.println( t3 + " " + (q3.hasSolution() ? "correcto" : "fallo") );

            String t4 = "teste14";
            Query q4 = new Query(t4);
            //System.out.println( t4 + " " + (q4.hasSolution() ? "correcto" : "fallo") );
            
            //String teste = q4.hasSolution();
            session.getRemote().sendString("Hello Webbrowser EU SOU O CARA");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnWebSocketMessage
    public void onMessage(String message) {
        System.out.println("Message: " + message);
        try {
        	Host host = new Host();
            String command = "java -jar \"C:/wamp/www/applet.jar\"";
            System.out.println(command);
            String retornoProlog = host.executeCommand(command);
            
			this.session.getRemote().sendString(retornoProlog);
        	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}