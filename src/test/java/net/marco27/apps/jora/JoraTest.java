package net.marco27.apps.jora;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * https://docs.oracle.com/cd/E17802_01/webservices/webservices/docs/2.0/tutorial/doc/JAXWS3.html
 */
public class JoraTest {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8580/soap/sample", new Jora());
    }

}
