import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;
import model.Usuario;

public class Population {

	public List<Pessoa> gerarPessoas() {
		int numPessoas = 100;
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for(int i = 0;i<numPessoas;i++) {
			
			Pessoa p = new Pessoa();
			p.setName("Loma "+i);
			p.setCity("Itaberaba");
			p.setAge(""+i + 2);
			p.setCode(""+i + 1);
			p.setCat("Bichano "+i);
			p.setDog("Catioro "+i);
			
			pessoas.add(p);
			
		}
		return pessoas;
	}
	
	public List<Usuario> gerarUsuarios(){
		int numUsuarios = 100;
		java.util.Date date = new Date(numUsuarios);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		for(int i = 0;i<numUsuarios;i++) {
			
			Usuario u = new Usuario();
			u.setId(""+i+"");
			u.setName("Usuario "+i);
			u.setUsercode("00"+i);
			u.setPassword("18"+(i*2));
			u.setIdDomain(""+i+"");
			u.setStatus(i+"88");
			u.setRegistration("Reg "+i);
			u.setEmail(u.getName()+"@gmail.com");
			u.setDateCreated("10/10/2010");
			u.setDateLastLogin("09/02/2018");
			u.setPasswordChange("true");
			u.setPasswordPolicy(i+"98");
			u.setDateLastChangeLogin("10/10/10");
			u.setAdministrator("false");
			
			usuarios.add(u);
		}
		
		return usuarios;
	}
}
