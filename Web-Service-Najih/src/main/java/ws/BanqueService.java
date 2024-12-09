package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//pojo plain old java object

 @WebService(serviceName="BanqueWS")
public class BanqueService {
     @WebMethod(operationName="Convert")

     public  double conversion (@WebParam(name="montant") double mt){
        return mt*10.54;

    }
    public Compte getCompte  (@WebParam(name="code") int code){
        return new Compte(code,Math.random()*9888,new Date());
    }
    public List<Compte> listCompte  (){
        return List.of (
                new Compte(1,Math.random()*9888,new Date()),
                new Compte(2,Math.random()*9888,new Date()),
                 new Compte(3,Math.random()*9888,new Date()),
                   new Compte(3,Math.random()*9888,new Date())


        );
    }

}
