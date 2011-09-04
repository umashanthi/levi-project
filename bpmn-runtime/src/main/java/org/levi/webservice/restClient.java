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
            WebResource webResource = client
                    .resource("http://www.goodreads.com/author/list/");
            MultivaluedMap queryParams = new MultivaluedMapImpl();
            queryParams.add("id", "18541");
            queryParams.add("key", "OQJFyv38jHqbrpammjHwWg");
            ClientResponse response = webResource.queryParams(queryParams).get(ClientResponse.class);

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
}
