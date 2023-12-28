package repositories;
import org.springframework.stereotype.Repository;

@Repository("repositories")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de Données");
        double data = 24;
        return data;
    }
}
