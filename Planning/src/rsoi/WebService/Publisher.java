package rsoi.WebService;

import javax.xml.ws.Endpoint;

/**
 * Created by madina on 11.05.14.
 */
public class Publisher {
    private Endpoint endpoint;

    public static void main(String[] args) {
        Publisher self = new Publisher();
        self.create_endpoint();
        self.publish();
    }

    private void create_endpoint() {
        endpoint = Endpoint.create(new WebServiceImp());
    }


    private void publish() {
        int port = 8081;
        String url = "http://localhost:" + port + "/ts";
        endpoint.publish(url);
        System.out.println("Publishing application on port " + port);
    }

    /*private void multiPublish)(){
        HttpServer server = null;
        int numConnections = 10;
        ExecutorService threads = Executors.newFixedThreadPool(numConnections);
        server = HttpServer.create(new InetSocketAddress(8080), numConnections);
        server.setExecutor(threads);
        server.start();
        Endpoint endpoint = Endpoint.create(new Calculator());
        HttpContext context = server.createContext("/WS/calculator");
        endpoint.publish(context);
    }*/
}
