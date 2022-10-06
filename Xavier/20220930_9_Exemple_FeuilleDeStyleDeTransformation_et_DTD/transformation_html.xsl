<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
	<xsl:output method="html" 
	            doctype-public="-//W3C//DTD HTML4.01//EN" 
				doctype-system="http://www.w3.org/TR/html4/strict.dtd"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>La mailing list</title>
			</head>
			<body>
				<h2>La mailing list</h2>
				<table border="1">
					<xsl:apply-templates select="//email"/>
				</table>
			</body>
		</html>
	</xsl:template>
	
	<xsl:template match="email">
		<tr>
			<td><xsl:value-of select="../nom"/></td>
			<td style="color: blue;">
			<xsl:if test="@statut='prof'">
				<xsl:attribute name="style">color: red; </xsl:attribute>
			</xsl:if>
				<xsl:value-of select="."/>
			</td>
		</tr>
	</xsl:template>
	
</xsl:stylesheet>