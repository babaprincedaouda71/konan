package service;

import repositories.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier{
    @Autowired // Injection des dépendances
    @Qualifier("dao") //permet de préciser le nom ou l'identifiant du bean à injecter lorsqu'il existe plusieurs instances de ce type dans le contexte Spring.
    private IDao dao; // Couplage faible : dépendance à l'interface plutôt qu'à la classe
    @Override
    public double calcul() {
        double data = dao.getData();
        double result = data - 4;
        return result;
    }

    /**
     * Injecter la variavle dans la variable dao
     * un objet d'une classe qui implémente l'interface IDao
     **/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
