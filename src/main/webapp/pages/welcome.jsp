<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Esto no es un Titulo</h1>

<h2>Usuarios</h2>
<s:form action="addUsuarioAction">
    <s:textfield name="nombre" label="Nombre" value=""/>
    <%--<s:textarea name="address" label="Address" value="" cols="50" rows="5" />--%>
    <s:submit/>
</s:form>

<h2>Todos los Usuarios</h2>

<s:if test="usuarioList.size() > 0">
    <table border="1px" cellpadding="8px">
        <tr>
            <th>Nombre</th>
        </tr>
        <s:iterator value="usuarioList" status="rowStatus">
            <tr>
                <td><s:property/></td>
            </tr>
        </s:iterator>
    </table>
</s:if>
<br/>
<br/>

</body>
</html>
