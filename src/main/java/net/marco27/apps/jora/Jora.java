package net.marco27.apps.jora;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Jora {

    @WebMethod(action = "getTime")
    public String getTime() {
        String result = "MARCO";
        return result;
    }
}
