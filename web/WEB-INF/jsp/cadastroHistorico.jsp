<%-- 
    Document   : cadastroHistorico
    Created on : 17/10/2019, 20:06:18
    Author     : Gustavo,Marcos, Ricardo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/> 
       
       <title>Histórico</title>
    </head>
    
    
    <body>
        <h1>Registro do Histórico</h1>
        <div>
            <form>
                <div class="form-group">
                    Ação
                    <input type="text" acao="acao" id="acao" class="form-control"><br>
                    Imóvel
                    <input type="text"  imovel="imovel" id="imovel" class="form-control"><br>
                    Correto
                    <input type="text" corretor="corretor" id="corretor" class="form-control"><br>
                </div>
            </form>
        </div>
    </body>
</html>