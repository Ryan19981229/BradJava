package tw.brad.ok;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad04
 */
@WebServlet("/Brad04")
public class Brad04 extends HttpServlet {
	public Brad04() {
		System.out.println();
		System.out.println("Brad04()");
		
	}
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw = response.getWriter();//進行編譯了 JAVA.io
		pw.append("Brad04");
		System.out.println("Brad04");//除錯
	}



}