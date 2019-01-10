import dao.ContactDAO;
import entity.Contact;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactDAO cdao = new ContactDAO();
		cdao.insertContact(new Contact("thanh", "123", "aaaa", "tao", "no", "quac"));
	}

}
