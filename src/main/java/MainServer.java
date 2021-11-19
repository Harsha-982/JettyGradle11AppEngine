import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;


public class MainServer {
    public static void main(String[] args) throws Exception {
        Server server=new Server(8080);
        WebAppContext  context=new WebAppContext();
        context.setContextPath("/");
        URL webDir =
                MainServer.class.getClassLoader().getResource("META-INF/resources");
        context.setResourceBase(webDir.toURI().toString());

        server.setHandler(context);
        server.start();
        System.out.println("Server Started ! ");
        server.join();




    }
}
