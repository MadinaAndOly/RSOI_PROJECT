package rsoi.model;


import javax.xml.ws.Endpoint;


public class PublisherModel {

    private Endpoint endpoint;

    public static void main(String[] args) {
        PublisherModel self = new PublisherModel();
        self.create_endpoint();
        self.publish();
    }

    private void create_endpoint() {
        endpoint = Endpoint.create(new ModelImp());
    }


    private void publish() {
        int port = 6055;
        String url = "http://localhost:" + port + "/model";
        endpoint.publish(url);
        System.out.println("Publishing application on port " + port);
    }

}
