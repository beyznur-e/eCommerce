import eCommerce.business.abstracts.CustomerService;
import eCommerce.business.concretes.CustomerManager;
import eCommerce.dataAccess.concretes.HibernateCustomerDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();

        // Test için birkaç e-posta adresi ekleyelim
        emailList.add("test1@example.com");
        emailList.add("test2@example.com");
        emailList.add("user@example.com");

        // Kullanıcıdan yeni bir e-posta adresi alalım
        Scanner scanner = new Scanner(System.in);
        System.out.print("E-posta adresini giriniz: ");
        String email = scanner.nextLine();

        // E-posta adresi daha önce kullanılmış mı kontrol edelim
        if (!emailList.contains(email)) {
            System.out.println("E-posta kullanılabilir.");
            // E-posta adresini listeye ekleyelim
            emailList.add(email);
        } else {
            System.out.println("E-posta daha önce kullanılmış.");
        }

        // Listeyi ekrana yazdırarak mevcut e-posta adreslerini kontrol edelim
        System.out.println("Mevcut e-posta adresleri: " + emailList);


    }
}