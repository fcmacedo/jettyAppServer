package trailerserver;



import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
       
    	ResourceConfig config = new ResourceConfig();
    	config.packages("trailerserver");
    	ServletHolder servlet = new ServletHolder(new ServletContainer(config));


    	Server server = new Server(8080);
    	ServletContextHandler context = new ServletContextHandler(server, "/*",ServletContextHandler.NO_SESSIONS);
    	context.addServlet(servlet, "/*");


    	try {
    	    server.start();
    	    server.join();
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
    	    System.out.println("teste");
			server.destroy();
    	}
    	
    	
    }
}


