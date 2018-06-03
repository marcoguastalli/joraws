package net.marco27.apps.jora;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * https://docs.oracle.com/cd/E17802_01/webservices/webservices/docs/2.0/tutorial/doc/JAXWS3.html
 */
@WebService
public class Jora {

    @WebMethod(action = "getTime")
    public String getTime() {
        String result = "MARCO";
        return result;
    }
}
