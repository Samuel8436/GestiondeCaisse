<%-- 
    Document   : Login
    Created on : 21 janv. 2023, 23:35:52
    Author     : NOMENY
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="bootstrap/._bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="StylText.css" rel="stylesheet" type="text/css"/>
        <link href="StyleContainer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="body">
        <form method="post" action="login">
            <center>
                <table align='TOP'>
                    <tr height='100px'>
                        <th colspan="2"><h1><center>AUTHENTIFICATION</center></h1><br></th>
                    </tr>
                    <tr height='100px'>
                        <td><label class="form-lael">Nom d'utilisateur : </label></td>
                        <td><input type="text" class="form-control" name="username" placeholder="Nom d'utilisateur" autocomplete='off' required></td>
                    </tr>
                    <tr height='100px'>
                        <td><label class="form-lael">Mot de passe : </label></td>
                        <td><input type="password" name="password" id="mdpconfirm" class="form-control" aria-describedby="pwdHelpBlock" placeholder="Mot de passe" required></td>
                    </tr>
                    <tr height='100px'>
                        <td colspan="2"><center><input type="submit" value="Se conecter" id="btn" name="login"></center></td>
                    </tr>
                </table>
            </center>
            
        </form>
            <%--Afficher le message d'erreur--%>
            <%--
                if(request.getAttribute("errorMessage")!= null{ %>
                <script>
                    alert("<%= request.getAtribute("errorMessage") %>");
            </script>
            <%
            }
            --%>
            <input type="submit" value="Afficher le mot de passe" onclick="togglePwd('mdpconfirm')">
        <a class="Autre" href="Autre_compte.jsp">Créer un compte</a>
        <br><br>
        </div>
        <script>
            "use strict";
            function togglePwd(id) {
                var x=document.getElementById(id);
                x.type=(x.type ==="password")? "text" : "password";

            }
            if (x.type ==="password") {
                    x.type="text";
                }
                else{
                    x.type="password";
                }
        </script>
    </body>
</html>
