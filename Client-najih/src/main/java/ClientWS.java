import mypackage.BanqueService;
import mypackage.BanqueWS;
import mypackage.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stud=new BanqueWS().getBanqueServicePort();
        System.out.println(stud.convert(7600));
        Compte cp=stud.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
