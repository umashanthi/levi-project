package org.levi.webservice;

/**
 * Created by IntelliJ IDEA.
 * User: keheliya
 * Date: 9/4/11
 * Time: 6:37 PM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.*;
import javax.ws.rs.core.MultivaluedMap;

public class restClient {

    public static void main(String[] args) {
        try {

            Client client = Client.create();
            ClientResponse response = goodReadsAuthor(client);
           // ClientResponse response =  ip2place(client);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);
            System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static ClientResponse goodReadsAuthor(Client client) {
        WebResource webResource = client
                .resource("http://www.goodreads.com/book/isbn_to_id");
        MultivaluedMap queryParams = new MultivaluedMapImpl();
        queryParams.add("isbn", "0441172717");
        queryParams.add("key", "OQJFyv38jHqbrpammjHwWg");
        return webResource.queryParams(queryParams).get(ClientResponse.class);
    }

     private static ClientResponse ip2place(Client client) {
        WebResource webResource = client
                .resource("http://www.geoplugin.net/xml.gp");
        MultivaluedMap queryParams = new MultivaluedMapImpl();
        queryParams.add("ip", "101.2.184.134");
        return webResource.queryParams(queryParams).get(ClientResponse.class);
    }
}
