package tw.brad.ok;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad13") //轉向給Brad14面對;但是請求是向這裡處理
public class Brad13 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("Brad14?x=10&y=3");
		//x被換掉變成10;但是不建議這樣寫
		request.setAttribute("x", 123);
		request.setAttribute("y", 456);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>Brad Big Company</h1>");
		
		dispatcher.include(request, response);
		
		out.print("<hr /> ");
		out.print("Hello, World");
	}

}