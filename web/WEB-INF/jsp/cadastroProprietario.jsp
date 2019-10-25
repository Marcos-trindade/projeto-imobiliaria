<%-- 
    Document   : cadastroProprietario
    Created on : 17/10/2019, 20:04:46
    Author     : Gustavo,Marcos, Ricardo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/> 
       
       <title>Cadastro de Proprietario</title>
    </head>
    
    
    <body>
        <h1>Cadastro de Proprietário</h1>
        <div>
            <form>
                <div class="form-group">
                    Nome
                    <input type="text" name="nome" id="nome" class="form-control"><br>
                    e-mail
                    <input type="text" email="email" id="email" class="form-control"><br>
                    Telefone
                    <input type="text" telefone="fone" id="fone" class="form-control"><br>
                    Aceita Negociação
                    <input type="text" negocicao="negociacao" id="negociacao" class="form-control"><br>
         
                </div>
            </form>
        </div>
    </body>
</html>

