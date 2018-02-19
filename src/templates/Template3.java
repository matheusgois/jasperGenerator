package templates;

import java.util.UUID;

public class Template3 {
	
	public String gerarJRXML(){
		StringBuilder sb = new StringBuilder();
		
		String columns[] = {"id","name","usercode","password","idDomain","status","registration","email","dateCreated",
				"dateLastLogin","passwordChange","passwordPolicy","dateLastChangeLogin","administrator", "funcionario",
				"cadastrado", "obstruido"};
		
		int widthColumns[] = {44,100,89,100,76,64,108,100,100,107,113,122,159,108,100,100,100};
		int heightBand = 0;
		
		//tamanho folha
		int width = 595;
		int height = 842;
		
		//tamanho da folha para conteudo
		int wPage = 555;
		//int wPage2 = 499;
		String orientation = "Portrait";
		
		double total = 0;
		for(int i=0;i<widthColumns.length;i++) {
			total += widthColumns[i];
		} 
		
		if(total > 555) {
			orientation = "Landscape";
			width = 842;
			height = 595;
			wPage = 802;
			//wPage2 = 739;
		}
		
		double result = Math.ceil(total / 750);
		
		for(int i=0;i<result;i++) {
			heightBand += 15;
		}
		//System.out.println("result "+result);
		//System.out.println("band inicial"+heightBand);

		int x = 11;
		int y = 0;
		
		sb.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		sb.append("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" "
				+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
				+ "xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports "
				+ "http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"report1\" "
				+ "language=\"java\" "
				+ "pageWidth=\""+width+"\" pageHeight=\""+height+"\" "
				+ "orientation=\""+orientation+"\" "
				+ "columnWidth=\""+wPage+"\" "
				+ "leftMargin=\"20\" rightMargin=\"20\" topMargin=\"20\" bottomMargin=\"20\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\">");
		
	
		sb.append("<property name=\"ireport.zoom\" value=\"1.2100000000000017\"/>");
		sb.append("<property name=\"ireport.x\" value=\"0\"/>");
		sb.append("<property name=\"ireport.y\" value=\"0\"/>");
		//sb.append("<parameter name=\"base_dir\" class=\"java.io.InputStream\"/>");
		//sb.append("<parameter name=\"filter_search\" class=\"java.lang.String\"/>");
		
		for(int i=0;i<columns.length;i++) {
			sb.append("<field name=\""+columns[i]+"\" class=\"java.lang.String\"/>");
		}
		
		sb.append("<background>");
		sb.append("<band splitType=\"Stretch\"/>");
		sb.append("</background>");
		sb.append("<pageHeader>");
		sb.append("<band height=\"47\" splitType=\"Stretch\">");
		sb.append("<staticText>");
		sb.append("<reportElement x=\"0\" y=\"15\" width=\""+wPage+"\" height=\"26\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement textAlignment=\"Center\">");
		sb.append("<font size=\"12\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Relatório Usuário]]></text>");
		sb.append("</staticText>");
		sb.append("<image isUsingCache=\"true\">");
		sb.append("<reportElement x=\"10\" y=\"0\" width=\"139\" height=\"47\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		//sb.append("<imageExpression><![CDATA[$P{base_dir}]]></imageExpression>");
		sb.append("</image>");
		sb.append("<textField pattern=\"dd/MM/yyyy HH:mm:ss\">");
		sb.append("<reportElement x=\""+(wPage-100)+"\" y=\"15\" width=\"100\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField>");
		sb.append("<reportElement x=\"0\" y=\"27\" width=\""+wPage+"\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"8\" isBold=\"false\"/>");
		sb.append("</textElement>");
		//sb.append("<textFieldExpression><![CDATA[$P{filter_search}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("</band>");
		sb.append("</pageHeader>");
		
		
		sb.append("<columnHeader>");
		sb.append("<band height=\""+heightBand+"\" splitType=\"Stretch\">");
		
		
		int l = 1;
		int next = 2;
		//titulo
		for(int i=0;i<columns.length;i++) {
			if(x > (wPage - 50)) {
				l += 1;
			}
			
			//linha 2
			if(l == 2 && next == 2) {
				y = 14;
				x = 67;
				next += 1;
			}
			//linha 3
			if(l == 3 && next == 3) {
				y = 29;
				x = 95;
				next += 1;
			}
			
			sb.append("<staticText>");
			sb.append("<reportElement x=\""+x+"\" y=\""+y+"\" width=\""+widthColumns[i]+"\" height=\"14\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textElement verticalAlignment=\"Middle\">");
			sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
			sb.append("</textElement>");
			sb.append("<text><![CDATA["+columns[i].substring(0,1).toUpperCase().concat(columns[i].substring(1))+"]]></text>");
			sb.append("</staticText>");
			
			x = x + widthColumns[i];
		}
		
		sb.append("<line>");
		sb.append("<reportElement x=\"0\" y=\"0\" width=\""+wPage+"\" height=\"1\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("</line>");
		sb.append("<line>");
		sb.append("<reportElement x=\"0\" y=\""+(y+14)+"\" width=\""+wPage+"\" height=\"1\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("</line>");
		sb.append("</band>");
		sb.append("</columnHeader>");
		
		
		//detail
		sb.append("<detail>");
		sb.append("<band height=\""+heightBand+"\" splitType=\"Stretch\">");
		sb.append("<rectangle>");
		sb.append("<reportElement positionType=\"Float\" stretchType=\"RelativeToTallestObject\" "
				+ "isPrintRepeatedValues=\"false\" x=\"0\" y=\"0\" width=\""+wPage+"\" height=\""+heightBand+"\" "
				+ "isPrintWhenDetailOverflows=\"true\" forecolor=\"#FFFFFF\" backcolor=\"#CCCCCC\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\">");
		sb.append("<printWhenExpression><![CDATA[new Boolean(($V{COLUMN_COUNT}.intValue() % 2) != 0)]]></printWhenExpression>");
		sb.append("</reportElement>");
		sb.append("</rectangle>");
		
		x = 11;
		y = 0;
		l = 1;
		next = 2;
		for(int i=0;i<columns.length;i++) {
			if(x > (wPage - 50)) {
				l += 1;
			}
			
			//linha 2
			if(l == 2 && next == 2) {
				y = 14;
				x = 67;
				next += 1;
			}
			//linha 3
			if(l == 3 && next == 3) {
				y = 29;
				x = 95;
				next += 1;
			}
			
			sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
			sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\""+x+"\" y=\""+y+"\" width=\""+widthColumns[i]+"\" height=\"14\""
					+ " uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textElement verticalAlignment=\"Top\">");
			sb.append("<font fontName=\"Courier New\"/>");
			sb.append("</textElement>");
			sb.append("<textFieldExpression><![CDATA[$F{"+columns[i]+"}]]></textFieldExpression>");
			sb.append("</textField>");
			
			x = x + widthColumns[i];
		}
				
		sb.append("</band>");
		sb.append("</detail>");
		
		
		sb.append("<pageFooter>");
		sb.append("<band height=\"23\" splitType=\"Stretch\">");
		sb.append("<textField>");
		sb.append("<reportElement x=\""+(wPage-220)+"\" y=\"3\" width=\"80\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement textAlignment=\"Right\"/>");
		sb.append("<textFieldExpression><![CDATA[$V{PAGE_NUMBER}+\" /\"]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField evaluationTime=\"Report\">");
		sb.append("<reportElement x=\""+(wPage-140)+"\" y=\"3\" width=\"40\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("</band>");
		sb.append("</pageFooter>");
		
		sb.append("</jasperReport>");
		
		System.out.println(sb.toString());
		return sb.toString();
	}

}
