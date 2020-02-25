<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@page import ="com.bookshelf.implementations.BooksDAOImpl" %>
        <%@page import ="com.bookshelf.model.Books" %>
        <%@page import ="java.util.ArrayList" %>
        <%@page import ="java.util.List" %>
        <%@page import ="java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Books</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<style>
.left{
float:left;
padding-left:60px;
padding-right:80px;
padding-top:20px;
padding-bottom:20px;
}

</style>
<body>
<%

BooksDAOImpl bl=new BooksDAOImpl();
List<Books> l=new ArrayList<Books>();

l=bl.viewAllBooks();

for(Books b:l)
{

%>
<div class='left'><div class="card-desk">
<div class="card bg-white" style="width:16rem;height:33rem;color:black;">
<img src="assets/images/<%=b.getImgLink()%>" height="320" width="255"></img> 
<div class='container'><h5><b> <%=b.getBookName()%> </b></h5> <p >Author : <%=b.getBookAuthor()%><br>Version : <%=b.getBookVersion()%> <br>
 Language :<%=b.getBookLanguage() %><br> Publisher :<%=b.getBookPublisher() %><br><br>
 </div></div></div></div>
<%
}
%>
</body>
</html>