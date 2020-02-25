

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookshelf.implementations.BooksDAOImpl;
import com.bookshelf.model.Books;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		Books b1=new Books();
		BooksDAOImpl bi=new BooksDAOImpl();
		b1.setBookName(request.getParameter("bookName"));
		b1.setBookVersion(Integer.parseInt(request.getParameter("bookVersion")));
		b1.setBookAuthor(request.getParameter("bookAuthor"));
		b1.setBookLanguage(request.getParameter("bookLanguage"));
		b1.setBookType(request.getParameter("bookType"));
		b1.setBookPublisher(request.getParameter("bookPublisher"));
		b1.setBookPublishedDate(Date.valueOf(request.getParameter("bookPublishedDate")));
		String link=splitUrl(request.getParameter("bookLink"));
		b1.setBookLink(link);
		String link1=splitUrl(request.getParameter("imgLink"));
		b1.setImgLink(link1);
	   
		try {
			bi.addBook(b1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		String splitUrl(String url)
		{
			
			String words[]=url.split("\\\\");
			int l=words.length;
			return(words[l-1]);
		}

}
