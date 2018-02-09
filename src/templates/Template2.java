package templates;

import java.util.UUID;

public class Template2 {
	
	public String gerarJRXML() {
		
	String columns[] = {"code","name","age","city","dog","cat"}; 	
	int wPage = 419;
	int wPage2 = 499;
	
	//limite por folha 555
	int widthColumns[] = {100, 139, 76, 240, 139, 139};
	
	//tamanho folha
	int width = 595;
	int height = 842;
	String orientation = "Portrait";
	
	//verifica tamanho das colunas
	int widthTotal = 0;
	for(int i = 0;i < widthColumns.length; i++) {
		widthTotal += widthColumns[i]; 
	}
	
	if(widthTotal > 555) {
		orientation = "Landscape";
		width = 842;
		height = 595;
		wPage = 659;
		wPage2 = 739;
	}
				
	StringBuilder sb = new StringBuilder();
	
	sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	sb.append("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" "
			+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
			+ "xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports "
			+ "http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"report1\" "
			+ "orientation=\""+orientation+"\" "
			+ "pageWidth=\""+ width +"\" pageHeight=\""+ height +"\" columnWidth=\"555\" leftMargin=\"20\" "
			+ "rightMargin=\"20\" topMargin=\"20\" bottomMargin=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\">");
	
	sb.append("<property name=\"ireport.zoom\" value=\"1.2100000000000006\"/>");
	sb.append("<property name=\"ireport.x\" value=\"0\"/>");
	sb.append("<property name=\"ireport.y\" value=\"0\"/>");
	//fields
	for(int i = 0; i < columns.length; i++) {
		sb.append("<field name=\""+columns[i]+"\" class=\"java.lang.String\"/>");
	}
	
	/*
	sb.append("<field name=\"code\" class=\"java.lang.Integer\"/>");
	sb.append("<field name=\"name\" class=\"java.lang.String\"/>");
	sb.append("<field name=\"city\" class=\"java.lang.String\"/>");
	sb.append("<field name=\"age\" class=\"java.lang.Integer\"/>");
	*/
	
	sb.append("<background>");
	sb.append("<band splitType=\"Stretch\"/>");
	sb.append("</background>");
	
	sb.append("<title>");
	sb.append("<band height=\"79\" splitType=\"Stretch\">");
	sb.append("<staticText>");
	sb.append("<reportElement x=\"0\" y=\"0\" width=\"555\" height=\"79\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"34\" isBold=\"true\"/>");
	sb.append("</textElement>");
	sb.append("<text><![CDATA[LAB TEST]]></text>");
	sb.append("</staticText>");
	sb.append("</band>");
	sb.append("</title>");
	
	sb.append("<pageHeader>");
	sb.append("<band height=\"35\" splitType=\"Stretch\"/>");
	sb.append("</pageHeader>");
	sb.append("<columnHeader>");
	sb.append("<band height=\"20\" splitType=\"Stretch\">");
	sb.append("<staticText>");
	sb.append("<reportElement x=\"0\" y=\"0\" width=\"100\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\" isBold=\"true\"/>");
	sb.append("</textElement>");
	sb.append("<text><![CDATA[Code]]></text>");
	sb.append("</staticText>");
	sb.append("<staticText>");
	sb.append("<reportElement x=\"100\" y=\"0\" width=\"139\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\" isBold=\"true\"/>");
	sb.append("</textElement>");
	sb.append("<text><![CDATA[Name]]></text>");
	sb.append("</staticText>");
	sb.append("<staticText>");
	sb.append("<reportElement x=\"315\" y=\"0\" width=\"240\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\" isBold=\"true\"/>");
	sb.append("</textElement>");
	sb.append("<text><![CDATA[City]]></text>");
	sb.append("</staticText>");
	sb.append("<staticText>");
	sb.append("<reportElement x=\"239\" y=\"0\" width=\"76\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\" isBold=\"true\"/>");
	sb.append("</textElement>");
	sb.append("<text><![CDATA[Age]]></text>");
	sb.append("</staticText>");
	sb.append("</band>");
	sb.append("</columnHeader>");
	
	
	sb.append("<detail>");
	sb.append("<band height=\"20\" splitType=\"Stretch\">");
	int w = 0;
	
	for(int i = 0; i < columns.length; i++) {
		
		sb.append("<textField>");
		sb.append("<reportElement x=\""+ w +"\" y=\"0\" width=\"100\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
		sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
		sb.append("<font size=\"12\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{"+columns[i]+"}]]></textFieldExpression>");
		sb.append("</textField>");
		w += widthColumns[i];
	}
	
	/*
	sb.append("<textField>");
	sb.append("<reportElement x=\"0\" y=\"0\" width=\"100\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\"/>");
	sb.append("</textElement>");
	sb.append("<textFieldExpression><![CDATA[$F{code}]]></textFieldExpression>");
	sb.append("</textField>");
	
	sb.append("<textField>");
	sb.append("<reportElement x=\"100\" y=\"0\" width=\"139\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\"/>");
	sb.append("</textElement>");
	sb.append("<textFieldExpression><![CDATA[$F{name}]]></textFieldExpression>");
	sb.append("</textField>");
	
	sb.append("<textField>");
	sb.append("<reportElement x=\"315\" y=\"0\" width=\"240\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\"/>");
	sb.append("</textElement>");
	sb.append("<textFieldExpression><![CDATA[$F{city}]]></textFieldExpression>");
	sb.append("</textField>");
	
	sb.append("<textField>");
	sb.append("<reportElement x=\"239\" y=\"0\" width=\"76\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
	sb.append("<font size=\"12\"/>");
	sb.append("</textElement>");
	sb.append("<textFieldExpression><![CDATA[$F{age}]]></textFieldExpression>");
	sb.append("</textField>");
	*/
	
	sb.append("</band>");
	sb.append("</detail>");
	
	
	sb.append("<columnFooter>");
	sb.append("<band height=\"45\" splitType=\"Stretch\"/>");
	sb.append("</columnFooter>");
	sb.append("<pageFooter>");
	sb.append("<band height=\"37\" splitType=\"Stretch\">");
	sb.append("<textField>");
	sb.append("<reportElement x=\""+wPage+"\" y=\"17\" width=\"80\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textElement textAlignment=\"Right\"/>");
	sb.append("<textFieldExpression><![CDATA[\"Page \"+$V{PAGE_NUMBER}+\" of\"]]></textFieldExpression>");
	sb.append("</textField>");
	sb.append("<textField evaluationTime=\"Report\">");
	sb.append("<reportElement x=\""+wPage2+"\" y=\"17\" width=\"40\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>");
	sb.append("</textField>");
	sb.append("<textField>");
	sb.append("<reportElement x=\"0\" y=\"17\" width=\"100\" height=\"20\" uuid=\""+ UUID.randomUUID().toString() +"\"/>");
	sb.append("<textFieldExpression><![CDATA[$V{PAGE_NUMBER}]]></textFieldExpression>");
	sb.append("</textField>");
	sb.append("</band>");
	sb.append("</pageFooter>");
	
	
	sb.append("<summary>");
	sb.append("<band height=\"42\" splitType=\"Stretch\"/>");
	sb.append("</summary>");
	sb.append("</jasperReport>");
	
	
	return sb.toString();
	}
}
