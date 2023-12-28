package dao;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImpl2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Web Services");
        double data = 20;
        return data;
    }
}
