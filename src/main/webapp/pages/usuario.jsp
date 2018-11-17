<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 + Spring + Hibernate integration example</h1>

<h2>Add Customer</h2>
<s:form action="addUsuarioAction" >
    <s:textfield name="nombre" label="Nombre" value="" />
    <s:submit />
</s:form>

<h2>Usuarios:</h2>

<s:if test="customerList.size() > 0">
    <table border="1px" cellpadding="8px">
        <tr>
            <th>Id</th>
            <th>Nombre</th>
        </tr>
        <s:iterator value="usuarioList" status="userStatus">
            <tr>
                <td><s:property value="id" /></td>
                <td><s:property value="nombre" /></td>
            </tr>
        </s:iterator>
    </table>
</s:if>
<br/>
<br/>

</body>
</html>

