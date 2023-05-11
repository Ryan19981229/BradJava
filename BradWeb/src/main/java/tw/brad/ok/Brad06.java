package tw.brad.ok;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad04
 */
@WebServlet("/Brad06")
public class Brad06 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {// request用端地同步請求
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String param = params.nextElement();
			String value = request.getParameter(param);
			System.out.printf("%s : %s \n", param, value );
		}
		//http://localhost:8080/BradWeb/Brad05?key=value&x=10&y=3
	}
}
