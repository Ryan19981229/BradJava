package tw.brad.ok;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.classes.Brad18;



@WebServlet("/Brad17") //負責接收參數
public class Brad17 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 1. 接收參數
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String view = request.getParameter("view");
		
		// 2. 演算法
		RequestDispatcher dispatcher;
		dispatcher = 
				request.getRequestDispatcher("Brad19");
		try {
			Brad18 brad18 = new Brad18(x, y); //交給類別成是去算
			int result = brad18.plus();//呼叫涵式;有可能回傳NULL

			request.setAttribute("view", view==null? "view1":view);
			request.setAttribute("x", x);
			request.setAttribute("y", y);
			request.setAttribute("result", result+"");
		}catch(Exception e) {
			// 參數不對 null or 非數字
			request.setAttribute("view", view==null?"view1":view);
			request.setAttribute("x", "");
			request.setAttribute("y", "");
			request.setAttribute("result","");
		}
		
		// 3. 呈現 View
		dispatcher.forward(request, response);
		
	}
}
