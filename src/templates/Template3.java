package templates;

import java.util.UUID;

public class Template3 {
	
	public String gerarJRXML(){
		StringBuilder sb = new StringBuilder();
		
		String columns[] = {"id","name","usercode","password","idDomain","status","registration","email","dateCreated",
				"dateLastLogin","passwordChange","passwordPolicy","dateLastChangeLogin","administrator"};
		
		int widthColumns[] = {44,100,89,100,76,64,108,100,100,107,113,122,159,108};
		
		
		int x = 11;
		int y = 0;
		
		sb.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		sb.append("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" "
				+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
				+ "xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports "
				+ "http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"report1\" "
				+ "language=\"java\" pageWidth=\"842\" pageHeight=\"595\" "
				+ "orientation=\"Landscape\" columnWidth=\"802\" "
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
		
		/*
		sb.append("<field name=\"id\" class=\"java.lang.Integer\"/>");
		sb.append("<field name=\"name\" class=\"java.lang.String\"/>");
		sb.append("<field name=\"usercode\" class=\"java.lang.String\"/>");
		sb.append("<field name=\"password\" class=\"java.lang.String\"/>");
		sb.append("<field name=\"idDomain\" class=\"java.lang.Integer\"/>");
		sb.append("<field name=\"status\" class=\"java.lang.String\"/>");
		sb.append("<field name=\"registration\" class=\"java.lang.String\"/>");
		sb.append("<field name=\"email\" class=\"java.lang.String\"/>");
		sb.append("<field name=\"dateCreated\" class=\"java.lang.Long\"/>");
		sb.append("<field name=\"dateLastLogin\" class=\"java.lang.Long\"/>");
		sb.append("<field name=\"passwordChange\" class=\"java.lang.Boolean\"/>");
		sb.append("<field name=\"passwordPolicy\" class=\"java.lang.String\"/>");
		sb.append("<field name=\"dateLastChangeLogin\" class=\"java.lang.Long\"/>");
		sb.append("<field name=\"administrator\" class=\"java.lang.Boolean\"/>");
		*/
		
		sb.append("<background>");
		sb.append("<band splitType=\"Stretch\"/>");
		sb.append("</background>");
		sb.append("<pageHeader>");
		sb.append("<band height=\"47\" splitType=\"Stretch\">");
		sb.append("<staticText>");
		sb.append("<reportElement x=\"0\" y=\"15\" width=\"802\" height=\"26\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
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
		sb.append("<reportElement x=\"702\" y=\"15\" width=\"100\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField>");
		sb.append("<reportElement x=\"0\" y=\"27\" width=\"802\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement textAlignment=\"Center\" verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"8\" isBold=\"false\"/>");
		sb.append("</textElement>");
		//sb.append("<textFieldExpression><![CDATA[$P{filter_search}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("</band>");
		sb.append("</pageHeader>");
		
		
		sb.append("<columnHeader>");
		sb.append("<band height=\"37\" splitType=\"Stretch\">");
		
		//titulo
		for(int i=0;i<columns.length;i++) {
			if(x > 750) {
				y = 14;
				x = 67;
			}
			
			sb.append("<staticText>");
			sb.append("<reportElement x=\""+x+"\" y=\""+y+"\" width=\""+widthColumns[i]+"\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
			sb.append("<textElement verticalAlignment=\"Middle\">");
			sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
			sb.append("</textElement>");
			sb.append("<text><![CDATA["+columns[i].substring(0,1).toUpperCase().concat(columns[i].substring(1))+"]]></text>");
			sb.append("</staticText>");
			
			x = x + widthColumns[i];
		}
		
		/*
		sb.append("<staticText>");
		sb.append("<reportElement x=\"11\" y=\"1\" width=\"44\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Id]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"54\" y=\"1\" width=\"99\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Nome]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"152\" y=\"1\" width=\"91\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Código Usuario]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"243\" y=\"1\" width=\"75\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Dominio]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"317\" y=\"1\" width=\"64\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Situação]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"381\" y=\"1\" width=\"108\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Registro]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"489\" y=\"1\" width=\"101\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Email]]></text>");
		sb.append("</staticText>");
		*/
		
		sb.append("<line>");
		sb.append("<reportElement x=\"0\" y=\"36\" width=\"802\" height=\"1\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("</line>");
		sb.append("<line>");
		sb.append("<reportElement x=\"0\" y=\"0\" width=\"802\" height=\"1\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("</line>");
		
		/*
		sb.append("<staticText>");
		sb.append("<reportElement x=\"589\" y=\"1\" width=\"100\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Data criação]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"688\" y=\"1\" width=\"107\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Último login]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"67\" y=\"18\" width=\"113\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Alteração senha]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"179\" y=\"18\" width=\"122\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Politica de senha]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"300\" y=\"18\" width=\"159\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Data de checagem e login]]></text>");
		sb.append("</staticText>");
		
		sb.append("<staticText>");
		sb.append("<reportElement x=\"459\" y=\"18\" width=\"108\" height=\"17\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Middle\">");
		sb.append("<font fontName=\"Courier New\" size=\"10\" isBold=\"true\"/>");
		sb.append("</textElement>");
		sb.append("<text><![CDATA[Administrador]]></text>");
		sb.append("</staticText>");
		*/
		
		sb.append("</band>");
		sb.append("</columnHeader>");
		
		
		sb.append("<detail>");
		sb.append("<band height=\"29\" splitType=\"Stretch\">");
		sb.append("<rectangle>");
		sb.append("<reportElement positionType=\"Float\" stretchType=\"RelativeToTallestObject\" "
				+ "isPrintRepeatedValues=\"false\" x=\"0\" y=\"0\" width=\"802\" height=\"29\" "
				+ "isPrintWhenDetailOverflows=\"true\" forecolor=\"#FFFFFF\" backcolor=\"#CCCCCC\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\">");
		sb.append("<printWhenExpression><![CDATA[new Boolean(($V{COLUMN_COUNT}.intValue() % 2) != 0)]]></printWhenExpression>");
		sb.append("</reportElement>");
		sb.append("</rectangle>");
		
		x = 11;
		y = 0;
		for(int i=0;i<columns.length;i++) {
			
			if(x > 750) {
				y = 14;
				x = 67;
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
		
		//detail
		
		/*
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"11\" y=\"0\" width=\"44\" height=\"14\""
				+ " uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{id}]]></textFieldExpression>");
		sb.append("</textField>");
		
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"55\" y=\"0\" width=\"100\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{name}]]></textFieldExpression>");
		sb.append("</textField>");
		
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"154\" y=\"0\" width=\"89\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{usercode}]]></textFieldExpression>");
		sb.append("</textField>");
		
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"382\" y=\"1\" width=\"108\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{registration}]]></textFieldExpression>");
		sb.append("</textField>");
		
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"490\" y=\"1\" width=\"100\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{email}]]></textFieldExpression>");
		sb.append("</textField>");
		
		sb.append("<textField isStretchWithOverflow=\"true\" pattern=\"dd/MM/yyyy HH:mm:ss\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"589\" y=\"1\" width=\"100\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{dateCreated}]]></textFieldExpression>");
		sb.append("</textField>");
		
		sb.append("<textField isStretchWithOverflow=\"true\" pattern=\"dd/MM/yyyy HH:mm:ss\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"688\" y=\"1\" width=\"107\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{dateLastLogin}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"67\" y=\"14\" width=\"113\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{passwordChange}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"179\" y=\"14\" width=\"122\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{passwordPolicy}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField isStretchWithOverflow=\"true\" pattern=\"dd/MM/yyyy HH:mm:ss\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"300\" y=\"14\" width=\"159\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{dateLastChangeLogin}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"459\" y=\"14\" width=\"108\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{administrator}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"317\" y=\"0\" width=\"64\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{status}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField isStretchWithOverflow=\"true\" isBlankWhenNull=\"true\">");
		sb.append("<reportElement stretchType=\"RelativeToTallestObject\" x=\"242\" y=\"0\" width=\"76\" height=\"14\" "
				+ "uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement verticalAlignment=\"Top\">");
		sb.append("<font fontName=\"Courier New\"/>");
		sb.append("</textElement>");
		sb.append("<textFieldExpression><![CDATA[$F{idDomain}]]></textFieldExpression>");
		sb.append("</textField>");
		*/
		
		sb.append("</band>");
		sb.append("</detail>");
		
		
		sb.append("<pageFooter>");
		sb.append("<band height=\"23\" splitType=\"Stretch\">");
		sb.append("<textField>");
		sb.append("<reportElement x=\"682\" y=\"3\" width=\"80\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textElement textAlignment=\"Right\"/>");
		sb.append("<textFieldExpression><![CDATA[$V{PAGE_NUMBER}+\" /\"]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("<textField evaluationTime=\"Report\">");
		sb.append("<reportElement x=\"762\" y=\"3\" width=\"40\" height=\"20\" uuid=\""+UUID.randomUUID().toString()+"\"/>");
		sb.append("<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>");
		sb.append("</textField>");
		sb.append("</band>");
		sb.append("</pageFooter>");
		
		sb.append("</jasperReport>");
		
		
		return sb.toString();
	}

}
