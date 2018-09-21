package view;

import org.hibernate.Session;
import controller.HibernateUtil;
import model.Clientes;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Clientes clientes = new Clientes();
    	
    	clientes.setNmCliente("Cliente1");
    	clientes.setEndCliente("Endereco1");
    	clientes.setEmailCliente("email1@exemplo.com.br");
    	
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(clientes);
		session.getTransaction().commit();

    }
}
