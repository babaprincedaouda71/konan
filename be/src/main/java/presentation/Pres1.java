package presentation;

import dao.DaoImpl;
import dao.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        DaoImpl2 daoImpl2 = new DaoImpl2();
        MetierImpl metier = new MetierImpl();

        metier.setDao(daoImpl2); //Injection des dépendances
        System.out.println(metier.calcul());
    }
}
