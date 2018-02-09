import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Pessoa;
import model.Usuario;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import templates.Template1;
import templates.Template2;
import templates.Template3;

public class JasperManager {

	public static void main(String[] args) throws Exception {
		System.out.println("Gerando relatorio, aguarde...");
		
		Template1 temp1 = new Template1();
		Template2 temp2 = new Template2();
		Template3 temp3 = new Template3();
		
		List<Pessoa> pessoas = new Population().gerarPessoas();
		List<Usuario> usuarios = new Population().gerarUsuarios();
		
		temp3.gerarJRXML();
				
		//System.out.println("usuarios "+ usuarios.toString());
		JasperReport jr = JasperCompileManager.compileReport(new ByteArrayInputStream(temp3.gerarJRXML().getBytes()));
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		JasperPrint jasperPrint =  JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(usuarios));
		
		JRPdfExporter exporter = new JRPdfExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("exports\\MeuPeixeq.pdf"));
		exporter.exportReport();		
		
		System.out.println("Generate Success!");
		
	}

}
