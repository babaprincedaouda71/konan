package presentation;

import service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        //Créer un context d'application en utilisant les annotations
        ApplicationContext springContext = new AnnotationConfigApplicationContext("repositories", "service");

        //Obtenir une instance de l'objet IMetier pour l'utiliser
        IMetier metier = springContext.getBean(IMetier.class);

        System.out.println("RES : " + metier.calcul());
    }
}
