<%-- 
    Document   : cadastroImovel
    Created on : 17/10/2019, 20:05:30
    Author     : Gustavo,Marcos, Ricardo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/> 
       
       <title>Imóvel</title>
    </head>
    
    <body>
        <h1>Cadastro do Imóvel</h1>
        <div>
            <form>
                <div class="form-group">
                    Endereço
                    <input type="text" endereco="endereco" id="endereco" class="form-control"><br>
                    Bairro
                    <input type="text"  bairro="bairro" id="bairro" class="form-control"><br>
                    Cidade
                    <input type="text" cidade="cidade" id="cidade" class="form-control"><br>
                    Estado
                    <input type="text" estado="estado" id="estado" class="form-control"><br>
                    País
                    <input type="text" pais="pais" id="pais" class="form-control"><br>
                    Preço
                    <input type="text" preco="preco" id="preco" class="form-control"><br>
                    Financiado? (Sim/Não)
                    <input type="text" financiado="financiado" id="financiado" class="form-control"><br>
                    Está no nome do Proprietário? (Sim/Não)
                    <input type="text" noproprietario="noproprietario" id="noproprietario" class="form-control"><br>                      
                    Corretor
                    <input type="text" correto="corretor" id="corretor" class="form-control"><br>
                    Proprietário
                    <input type="text" proprietario="proprietario" id="proprietario" class="form-control"><br>
                </div>
            </form>
        </div>
    </body>
</html>