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
@WebServlet("/Brad05")
public class Brad05 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {//request用端地同步請求
		Enumeration<String> names = request.getHeaderNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getHeader(name);
			System.out.printf("%s : %s\n",name,value);
			
			//http://10.0.104.190:8080/MyWeb2/Brad05     直接與老師連結
		}
	}

}
