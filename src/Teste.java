
import dao.ClienteDao;
import dao.DataSource;
import model.Cliente;

public class Teste {

public static void main(String[] args) {
   DataSource dc = new DataSource();
   ClienteDao Banco = new ClienteDao();
   Cliente Mateus = new Cliente();
   Mateus.setId(1);
   Mateus.setNome("Mateus");
   Mateus.setEmail("teuguedes@outlook.com");
   Mateus.setTelefone("123456789");
   Banco.inserirCliente(Mateus);
   dc.closeConnection();
}
    
}
