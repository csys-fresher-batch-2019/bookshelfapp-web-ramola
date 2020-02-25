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
<title>User</title>
<jsp:include page="header.jsp"/>

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


<h4>

<ul>
<li><a href="AuthorSpecificBooks.jsp">View Author Specific Books</a>
</li>
<li><a href="LanguageSpecificBooks.jsp">View Language Specific Books</a>
</li>

<li><a href="TypeSpecificBooks.jsp">View Type Specific Books</a>
</li>
<li><a href="TodaysSpecial.jsp">View Today's Special Books</a>
</li>

<li><a href="HighlyRatedBooks.jsp">Highly Rated Books</a>
</li>
<li><a href="RelatedBooks.jsp">Related Books</a>
</li>
</ul></h4>
</body>
</html>