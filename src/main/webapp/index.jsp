<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%-- Indicamos que vamos a usar las TagLibs de Struts 
	Estas sirven para manejar errores y formularios con struts en los JSP
--%>	
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%-- Esta es la cabezera del documento html --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.0 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html:html>
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Bienvenida de desarrolladores</title>
</head>
<body>
		<h2>Top Group Bienvenida</h2>
		<p>Ingreso de texto para concatenar un mensaje de bienvenida</p>
		<div>
			<html:form action="ingresar" method="post" focus="name">
			<br/>
			<div><label>Nombre: </label>
				<html:text property="name"/>
				<label>Apellido: </label>
				<html:text property="lastname"/>
				<label>Cargo: </label>
				<html:text property="charge"/>
			</div>
			<br/>
			<div></div><html:errors property="erName"/></div>
			<div><html:errors property="erLastname"/></div>
			<div><html:errors property="erCharge"/></div>
			
			<div>
				<html:submit value="Ingresar desarollador"/>
			</div>
			
			<logic:notEmpty name="ingresarForm" property="msg">
				<bean:write name="ingresarForm" property="msg"/>
			</logic:notEmpty>
			</html:form>
		</div>
		
		<%--Es otro forma de mostrar errores
		<logic:messagesPresent>
			<div class= "errors">
				<html:errors/>
			</div>
		</logic:messagesPresent>
		--%>
</body>
</html:html>
