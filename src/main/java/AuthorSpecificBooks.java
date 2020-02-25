

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;

@WebServlet("/AuthorSpecificBooks")
public class AuthorSpecificBooks extends HttpServlet {
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			BooksDAOImpl bl=new BooksDAOImpl();
			List<Books> l=new ArrayList<Books>();
			PrintWriter out=response.getWriter();
			String bookAuthor=request.getParameter("author");
			try {
				l=bl.extractAuthorSpecificBooks(bookAuthor);
				
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			//request.setAttribute("Book", l);
			//request.getRequestDispatcher("AuthorSpecific.jsp").forward(request, response);
		
			out.print("<center><h2><u>Author Specific Books</u></h2></center></br>");	
	
			out.print("<center><table border='1'><tr><th>Books</th><th>Book Details</th><tr>");
							
			for(Books b:l)
			{

					out.print("<tr><td><img src=assets/images/"+b.getImgLink()+" height='290' width='190'></td><td>Book Name  : "+toUpp(b.getBookName())+" </br> Book Version  :"+b.getBookVersion()+"</br>Book Author  : "+toUpp(b.getBookAuthor())+" </br>Book Language  : "+b.getBookLanguage()+" </br>Book Publisher : "+b.getBookPublisher()+" </br>Book Ratings  : "+b.getBookRating()+"</br></br><a href=assets/books/"+b.getBookLink()+">Read</a></tr></td>");
					
			}

			out.print("</table></center>");

		}
	    String toUpp(String word)
		{
			String words[]=word.split("\\s\\.");
			String res="";
			for(String s:words)
			{
			String first=s.substring(0,1);
			String f_after=s.substring(1);
			res+=first.toUpperCase()+f_after+" ";
			}
			
			return(res);
		}

}
