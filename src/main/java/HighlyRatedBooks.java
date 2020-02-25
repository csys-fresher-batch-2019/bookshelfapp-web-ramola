

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

@WebServlet("/HighlyRatedBooks")
public class HighlyRatedBooks extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BooksDAOImpl bl=new BooksDAOImpl();
		//PrintWriter out=response.getWriter();
		List<Books> l=new ArrayList<Books>();
		try {
			l=bl.extractHighlyRatedBooks();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			//request.setAttribute("BOOKS", l);
			// go to jsp - getATtribute - it will return list. iterate list
			//out.print("<center><h2><u>Highly Rated Books</h2></center></u></br>");
			//out.print("<table><tr><th>Books</th><th>Book Details</th></tr>");
		
		/*
		for(Books b:l)
		{
			System.out.println(b);
			out.print("<tr><td><img src=assets/images/"+b.getImgLink()+" height='140' width='150'></td><td>Book Name  : "+toUpp(b.getBookName())+" </br> Book Version  :"+b.getBookVersion()+"</br>Book Author  : "+toUpp(b.getBookAuthor())+" </br>Book Language  : "+b.getBookLanguage()+"</tr>");
			out.print("</br>");
		}
		out.print("</table>");
		
		
	}
		String toUpp(String word)
		{
			String words[]=word.split("\\s");
			String res="";
			for(String s:words)
			{
			String first=s.substring(0,1);
			String f_after=s.substring(1);
			res+=first.toUpperCase()+f_after+" ";
			}
			
			return(res);
		}
		

	*/
		}
}
