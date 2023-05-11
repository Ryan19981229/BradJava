package tw.brad.ok;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//java繼承serverlet
/**
 * Servlet implementation class Brad01
 */
@WebServlet("/Brad01") //對外營業
public class Brad01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//呼叫doGet;request用戶端提出請求
		response.getWriter().append("Served at:Ryan ");
	}

}
