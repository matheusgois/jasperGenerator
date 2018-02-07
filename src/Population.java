import java.util.ArrayList;
import java.util.List;

public class Population {

	private List<Pessoa> gerarPopulation() {
		int numPessoas = 100;
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for(int i = 0;i<numPessoas;i++) {
			
			Pessoa p = new Pessoa();
			p.setName("Loma "+i);
			p.setCity("Itaberaba");
			p.setAge(i + 2);
			p.setCode(i + 1);
			
			pessoas.add(p);
			
		}
		return pessoas;
	}
}
