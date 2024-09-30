package eCommerce.business.concretes;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.core.LoggerService;
import eCommerce.entities.concretes.Customer;

import java.util.List;
import java.util.regex.Pattern;

public class CustomerManager implements CustomerService{

    private LoggerService loggerService;

    public CustomerManager(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    @Override
    public void log(Customer customer) {

        if(customer.getPassword().length()<6){
            System.out.println("Parolanız 6 karakterden küçük olamaz!");
        }
        if(customer.getFirstName().length()<2 && customer.getLastName().length()<2){
            System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır.");
        }
        for(String i : customer.geteMail()){ //regex ile email formatı oluşturma
            boolean cikti = Pattern.matches("^[a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{2,6}$", i);
            if(cikti==false){
            System.out.println("Geçerli bir e-posta giriniz.");
            }
        }
        for (String i : customer.geteMail()) { //email kontrolü
            if (!customer.geteMail().contains(i)) {
                System.out.println("E-posta kullanılabilir.");
            } else {
                System.out.println("E-posta daha önce kullanılmış.");
            }
        }

    }

    @Override
    public void verification(Customer customer) {
        System.out.println("Doğrulama e-postası gönderildi." + customer.geteMail());
        if(!customer.geteMail().isEmpty()){
            System.out.println("Üyelik tamamlanmıştır.");
            this.loggerService.log("Log başarılı."+ customer.getFirstName());
        }
        else{
            System.out.println("Hatalı işlem.");
        }
    }
}

