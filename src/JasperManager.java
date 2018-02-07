import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

public class JasperManager {

	public static void main(String[] args) throws Exception {
		
		Main jrxml = new Main();
		
		jrxml.gerarJRXML();
		
		JasperReport jr = JasperCompileManager.compileReport(new ByteArrayInputStream(jrxml.gerarJRXML().getBytes()));
		
		Map<String, Object> params = new HashMap<String, Object>();
		System.out.println(params);
		
		JasperPrint jasperPrint =  JasperFillManager.fillReport(jr, params, new JREmptyDataSource());
		
		JRPdfExporter exporter = new JRPdfExporter();
		
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("exports\\Arquivo7.pdf"));
		exporter.exportReport();
		
	}

}
