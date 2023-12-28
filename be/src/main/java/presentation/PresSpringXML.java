package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        //Créer un context d'application en utilisant le fichier de configuration
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");

        //Obtenir la référence de l'objet de type IMetier pour l'utiliser
        IMetier metier = springContext.getBean(IMetier.class);
        System.out.println("RES : " + metier.calcul());
    }
}
