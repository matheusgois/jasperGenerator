import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.UUID;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("----------------------- JASPER GENERATE -----------------------");
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("Digite o nome do seu arquivo de extensão JRXML: ");
		String nomeArquivo = scan.nextLine();
		
		System.out.println("Digite um título para seu arquivo: ");
		String title = scan.nextLine();
		
		System.out.println("Digite uma descrição: ");
		String description = scan.nextLine();
		
		System.out.println("Digite o nome da Detail Principal: ");
		String nameDetail = scan.nextLine();
		
		System.out.println("Digite o nome da Field Principal: ");
		String dataField = scan.nextLine();
		
		System.out.println("Digite o numero de grupos que deseja: ");
		int nGroups = scan.nextInt();
		
		System.out.println("AGUARDE SEU ARQUIVO SER GERADO!! ");
		
		
		
		try {
			File file = new File("C:\\develop\\jaspers\\gerador\\"+ nomeArquivo +".jrxml");
			FileWriter writer = new FileWriter(file, true);
			PrintWriter out = new PrintWriter(writer, true);
			
			
			out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			
			//Cabecalho principal
			out.write("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" ");
			out.write("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");
			out.write("xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports "
					+ "http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" ");
			out.write("name=\""+ nomeArquivo +"\" ");
			//comentado para ser usado a linguagem java
			//out.write("language=\"groovy\" ");
			out.write("pageWidth=\"595\" ");
			out.write("pageHeight=\"842\" ");
			out.write("columnWidth=\"535\" ");
			out.write("leftMargin=\"20\" ");
			out.write("rightMargin=\"20\" ");
			out.write("topMargin=\"20\" ");
			out.write("bottomMargin=\"20\" ");
			out.println("uuid=\""+ UUID.randomUUID().toString() +"\">");
			
			//verifica se contem group
			
			//--------------------------- GROUPS --------------------------- 
			for(int i=0; i < nGroups; i++) {	
				out.println("<group name=\"Group"+i+"\">");
				out.println("<groupHeader>");
				out.println("<band height=\"33\">");
				
				out.println("<staticText>");
				out.println("<reportElement mode=\"Opaque\" x=\"0\" y=\"0\" "
						+ "width=\"100\" height=\"32\" forecolor=\"#666666\" "
						+ "backcolor=\"#E6E6E6\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
				out.println("<textElement>");
				out.println("<font size=\"12\"/>");
				out.println("</textElement>");
				out.println("<text><![CDATA[G"+i+"Label]]></text>");
				out.println("</staticText>");
				
				out.println("<textField>");
				out.println("<reportElement mode=\"Opaque\" x=\"100\" y=\"0\""
						+ " width=\"455\" height=\"32\" forecolor=\"#006699\" "
						+ "backcolor=\"#E6E6E6\" uuid=\""+UUID.randomUUID().toString()+"\"/>");  
				out.println("<textElement>");
				out.println("<font size=\"24\" isBold=\"true\"/>");
				out.println("</textElement>");
				out.println("<textFieldExpression><![CDATA[\"G"+i+"Field\"]]></textFieldExpression>");
				out.println("</textField>");
				out.println("<line>");
				out.println("<reportElement x=\"-20\" y=\"32\" width=\"595\" height=\"1\" forecolor=\"#666666\" "
						+ "uuid=\""+UUID.randomUUID().toString()+"\"/>"); 
				out.println("</line>");
				out.println("</band>");
				out.println("</groupHeader>");
				out.println("<groupFooter>");
				out.println("<band/>");
				out.println("</groupFooter>");
				out.println("</group>");
			}
			
			out.println("<background>");
			out.println("<band/>");
			out.println("</background>"); 
			out.println("<title>");
			out.println("<band height=\"72\">");
			out.println("<frame>");
			out.println("<reportElement mode=\"Opaque\" x=\"-20\" y=\"-20\" width=\"595\" height=\"92\" "
					+ "backcolor=\"#006699\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("<staticText>");
			out.println("<reportElement x=\"20\" y=\"20\" width=\"234\" height=\"43\" forecolor=\"#FFFFFF\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("<textElement>");
			out.println("<font size=\"34\" isBold=\"true\"/>");
			out.println("</textElement>");
			out.println("<text><![CDATA["+title+"]]></text>");
			out.println("</staticText>");
			out.println("<staticText>");
			out.println("<reportElement x=\"395\" y=\"43\" width=\"180\" height=\"20\" forecolor=\"#FFFFFF\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			
			out.println("<textElement textAlignment=\"Right\">");
			out.println("<font size=\"14\" isBold=\"false\"/>");
			out.println("</textElement>");
			out.println("<text><![CDATA["+description+"]]></text>");
			out.println("</staticText>");
			out.println("</frame>");
			out.println("</band>");
			out.println("</title>");
			
			
			out.println("<pageHeader>");
			out.println("<band height=\"13\"/>");
			out.println("</pageHeader>");
			out.println("<columnHeader>");
			out.println("<band height=\"21\">");
			out.println("<staticText>");
			out.println("<reportElement mode=\"Opaque\" x=\"0\" y=\"0\" width=\"183\" height=\"20\" forecolor=\"#006699\" "
					+ "backcolor=\"#E6E6E6\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("<textElement textAlignment=\"Center\">");
			out.println("<font size=\"14\" isBold=\"true\"/>");
			out.println("</textElement>");
			out.println("<text><![CDATA["+nameDetail+"]]></text>");
			out.println("</staticText>");
			out.println("<line>");
			out.println("<reportElement x=\"-20\" y=\"20\" width=\"595\" height=\"1\" forecolor=\"#666666\""
					+ " uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("</line>");
			out.println("</band>");
			out.println("</columnHeader>");
			
			
			out.println("<detail>");
			out.println("<band height=\"20\">");
			out.println("<textField isStretchWithOverflow=\"true\">");
			out.println("<reportElement x=\"0\" y=\"0\" width=\"183\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("<textElement>");
			out.println("<font size=\"14\"/>");
			out.println("</textElement>");
			out.println("<textFieldExpression><![CDATA[\""+dataField+"\"]]></textFieldExpression>");
			out.println("</textField>");
			out.println("<line>");
			out.println("<reportElement positionType=\"FixRelativeToBottom\" x=\"0\" y=\"19\" width=\"555\" height=\"1\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("</line>");
			out.println("</band>");
			out.println("</detail>");
			
			
			out.println("<columnFooter>");
			out.println("<band/>");
			out.println("</columnFooter>");
	
			
			out.println("<pageFooter>");
			out.println("<band height=\"17\">");
			out.println("<textField>");
			out.println("<reportElement mode=\"Opaque\" x=\"0\" y=\"4\" width=\"515\" height=\"13\" backcolor=\"#E6E6E6\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("<textElement textAlignment=\"Right\"/>");
			out.println("<textFieldExpression><![CDATA[\"Page \"+$V{PAGE_NUMBER}+\" of\"]]></textFieldExpression>");
			out.println("</textField>");
			out.println("<textField evaluationTime=\"Report\">");
			out.println("<reportElement mode=\"Opaque\" x=\"515\" y=\"4\" width=\"40\" height=\"13\" backcolor=\"#E6E6E6\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>");
			out.println("</textField>");
			out.println("<textField pattern=\"EEEEE dd MMMMM yyyy\">");
			out.println("<reportElement x=\"0\" y=\"4\" width=\"100\" height=\"13\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			out.println("<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>");
			out.println("</textField>");
			out.println("</band>");
			out.println("</pageFooter>");
			
			
			
			out.println("<summary>");
			out.println("<band/>");
			out.println("</summary>");
			
			
			out.println("</jasperReport>");
			
			out.close();
			writer.close();
			
			System.out.println("GENERATE SUCCESS!");
		
		}catch(Exception e) {
			throw new Exception(e);
		}
	}
}
