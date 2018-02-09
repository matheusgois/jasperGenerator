package templates;
import java.util.Scanner;
import java.util.UUID;

import model.Archive;

public class Template1 {
	
	public String gerarJRXML() throws Exception{
		
		Archive arc = new Archive();
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		arc.setQtdColunas(9);
		
		String orientation = "Portrait";
		int pageWidth = 595;
		int pageHeight = 842;
		
		if (arc.getQtdColunas() > 585){
			orientation = "Landscape";
			pageWidth = 842;
			pageHeight = 595;
		}
				
		
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("----------------------- JASPER GENERATE -----------------------");
		System.out.println("---------------------------------------------------------------");

		
		
		System.out.println("Digite o nome do seu arquivo de extensão JRXML: ");
		arc.setNomeArquivo("teste");  //(scan.nextLine());
			
		System.out.println("Digite um título para seu arquivo: ");
		arc.setTitle("teste");  //(scan.nextLine());
		
		System.out.println("Digite uma descrição: ");
		arc.setDescription("teste");  //(scan.nextLine());
		
		System.out.println("Digite o nome da Detail Principal: ");
		arc.setNameDetail("teste");  //(scan.nextLine());
		
		System.out.println("Digite o nome da Field Principal: ");
		arc.setDataField("teste");  //(scan.nextLine());

		System.out.println("Digite o numero de grupos que deseja: ");
		arc.setnGroups(3);  //(scan.nextInt());

		System.out.println("AGUARDE SEU ARQUIVO SER GERADO!! ");
		
		
		
		try {
			sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			
			//Cabecalho principal
			sb.append("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" ");
			sb.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");
			sb.append("xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports "
					+ "http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" ");
			sb.append("name=\""+ arc.getNomeArquivo() +"\" ");
			//comentado para ser usado a linguagem java
			sb.append("language=\"java\" ");
			sb.append("orientation=\""+orientation+"\" ");
			sb.append("pageWidth=\""+pageWidth+"\" ");
			sb.append("pageHeight=\""+pageHeight+"\" ");
			sb.append("columnWidth=\"535\" ");
			sb.append("leftMargin=\"20\" ");
			sb.append("rightMargin=\"20\" ");
			sb.append("topMargin=\"20\" ");
			sb.append("bottomMargin=\"20\" ");
			sb.append("uuid=\""+ UUID.randomUUID().toString() +"\">");
			
			//verifica se contem group
			
			//--------------------------- GROUPS --------------------------- 
			for(int i=0; i < arc.getnGroups(); i++) {	
				sb.append("<group name=\"Group"+i+"\">");
				sb.append("<groupHeader>");
				sb.append("<band height=\"33\">");
				
				sb.append("<staticText>");
				sb.append("<reportElement mode=\"Opaque\" x=\"0\" y=\"0\" "
						+ "width=\"100\" height=\"32\" forecolor=\"#666666\" "
						+ "backcolor=\"#E6E6E6\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
				sb.append("<textElement>");
				sb.append("<font size=\"12\"/>");
				sb.append("</textElement>");
				sb.append("<text><![CDATA[G"+i+"Label]]></text>");
				sb.append("</staticText>");
				
				sb.append("<textField>");
				sb.append("<reportElement mode=\"Opaque\" x=\"100\" y=\"0\""
						+ " width=\""+(pageWidth - 100)+"\" height=\"32\" forecolor=\"#006699\" "
						+ "backcolor=\"#E6E6E6\" uuid=\""+UUID.randomUUID().toString()+"\"/>");  
				sb.append("<textElement>");
				sb.append("<font size=\"24\" isBold=\"true\"/>");
				sb.append("</textElement>");
				sb.append("<textFieldExpression><![CDATA[\"G"+i+"Field\"]]></textFieldExpression>");
				sb.append("</textField>");
				sb.append("<line>");
				sb.append("<reportElement x=\"-20\" y=\"32\" width=\""+pageWidth+"\" height=\"1\" forecolor=\"#666666\" "
						+ "uuid=\""+UUID.randomUUID().toString()+"\"/>"); 
				sb.append("</line>");
				sb.append("</band>");
				sb.append("</groupHeader>");
				sb.append("<groupFooter>");
				sb.append("<band/>");
				sb.append("</groupFooter>");
				sb.append("</group>");
			}
			
			sb.append("<background>");
			sb.append("<band/>");
			sb.append("</background>"); 
			sb.append("<title>");
			sb.append("<band height=\"72\">");
			sb.append("<frame>");
			sb.append("<reportElement mode=\"Opaque\" x=\"-20\" y=\"-20\" width=\""+pageWidth+"\" height=\"92\" "
					+ "backcolor=\"#006699\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<staticText>");
			sb.append("<reportElement x=\"20\" y=\"20\" width=\"234\" height=\"43\" forecolor=\"#FFFFFF\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textElement>");
			sb.append("<font size=\"34\" isBold=\"true\"/>");
			sb.append("</textElement>");
			sb.append("<text><![CDATA["+arc.getTitle()+"]]></text>");
			sb.append("</staticText>");
			sb.append("<staticText>");
			sb.append("<reportElement x=\"395\" y=\"43\" width=\"180\" height=\"20\" forecolor=\"#FFFFFF\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			
			sb.append("<textElement textAlignment=\"Right\">");
			sb.append("<font size=\"14\" isBold=\"false\"/>");
			sb.append("</textElement>");
			sb.append("<text><![CDATA["+arc.getDescription()+"]]></text>");
			sb.append("</staticText>");
			sb.append("</frame>");
			sb.append("</band>");
			sb.append("</title>");
			
			
			sb.append("<pageHeader>");
			sb.append("<band height=\"13\"/>");
			sb.append("</pageHeader>");
			sb.append("<columnHeader>");
			sb.append("<band height=\"21\">");
			sb.append("<staticText>");
			sb.append("<reportElement mode=\"Opaque\" x=\"0\" y=\"0\" width=\"183\" height=\"20\" forecolor=\"#006699\" "
					+ "backcolor=\"#E6E6E6\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textElement textAlignment=\"Center\">");
			sb.append("<font size=\"14\" isBold=\"true\"/>");
			sb.append("</textElement>");
			sb.append("<text><![CDATA["+arc.getNameDetail()+"]]></text>");
			sb.append("</staticText>");
			sb.append("<line>");
			sb.append("<reportElement x=\"-20\" y=\"20\" width=\""+pageWidth+"\" height=\"1\" forecolor=\"#666666\""
					+ " uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("</line>");
			sb.append("</band>");
			sb.append("</columnHeader>");
			
			
			sb.append("<detail>");
			sb.append("<band height=\"20\">");
			sb.append("<textField isStretchWithOverflow=\"true\">");
			sb.append("<reportElement x=\"0\" y=\"0\" width=\"183\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textElement>");
			sb.append("<font size=\"14\"/>");
			sb.append("</textElement>");
			sb.append("<textFieldExpression><![CDATA[\""+arc.getDataField()+"\"]]></textFieldExpression>");
			sb.append("</textField>");
			sb.append("<line>");
			sb.append("<reportElement positionType=\"FixRelativeToBottom\" x=\"0\" y=\"19\" width=\""+(pageWidth - 40)+"\" height=\"1\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("</line>");
			sb.append("</band>");
			sb.append("</detail>");
			
			
			sb.append("<columnFooter>");
			sb.append("<band/>");
			sb.append("</columnFooter>");
	
			
			sb.append("<pageFooter>");
			sb.append("<band height=\"17\">");
			sb.append("<textField>");
			sb.append("<reportElement mode=\"Opaque\" x=\"0\" y=\"4\" width=\""+(pageWidth - 80)+"\" height=\"13\" backcolor=\"#E6E6E6\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textElement textAlignment=\"Right\"/>");
			sb.append("<textFieldExpression><![CDATA[\"Page \"+$V{PAGE_NUMBER}+\" of\"]]></textFieldExpression>");
			sb.append("</textField>");
			sb.append("<textField evaluationTime=\"Report\">");
			sb.append("<reportElement mode=\"Opaque\" x=\"515\" y=\"4\" width=\"40\" height=\"13\" backcolor=\"#E6E6E6\" "
					+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>");
			sb.append("</textField>");
			sb.append("<textField pattern=\"EEEEE dd MMMMM yyyy\">");
			sb.append("<reportElement x=\"0\" y=\"4\" width=\"100\" height=\"13\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>");
			sb.append("</textField>");
			sb.append("</band>");
			sb.append("</pageFooter>");
			
			sb.append("<summary>");
			sb.append("<band/>");
			sb.append("</summary>");
			
			sb.append("</jasperReport>");
			
			System.out.println("GENERATE SUCCESS!");
		
		}catch(Exception e) {
			throw new Exception(e);
		}
		return sb.toString();
	}
}
