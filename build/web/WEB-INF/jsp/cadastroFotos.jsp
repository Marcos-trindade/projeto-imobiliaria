<%-- 
    Document   : cadastroFotos
    Created on : 17/10/2019, 20:05:49
    Author     : Gustavo,Marcos, Ricardo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/> 
       
       <title>Fotos</title>
    </head>
    
    
    <body>
        <h1>Fotos do Imóvel</h1>
        <div>
            <form>
                <div class="form-group">
                    Imóvel
                    <input type="text" imovel="imovel" id="imovel" class="form-control"><br>
                    Nome da foto
                    <input type="text"  nomefoto="nomefoto" id="nomefoto" class="form-control"><br>
                    Upload
                    <input type="text" upload="uplod" id="upload" class="form-control"><br>
                             
                </div>
            </form>
        </div>
    </body>
</html>

