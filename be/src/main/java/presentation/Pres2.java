package presentation;

import repositories.IDao;
import service.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();

        //Chargement de la classe en mémoire
        Class cDao = Class.forName(daoClassName);

        //Création de l'objet
        IDao dao = (IDao) cDao.getConstructor().newInstance(); // => new DaoImpl()

        String metierClassName = scanner.nextLine();

        //Chargement de la classe en mémoire
        Class<?> cMetier = Class.forName(metierClassName);

        //Création de l'objet
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        //Chargement de la méthode setDao
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);

        //Injection des dépendances
        setDao.invoke(metier, dao);

        //Test
        System.out.println("RES = " + metier.calcul());
    }
}
