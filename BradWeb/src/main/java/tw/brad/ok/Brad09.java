package tw.brad.ok;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad09
 */
@WebServlet("/Brad09")
public class Brad09 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		
		
		String[] hs = request.getParameterValues("hobbies");
		
		System.out.printf("%s : %s : %s\n" , account, passwd, gender);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//有資料隱藏效果
		//如果有檔案上傳就要用這個
		//缺點:看不出來，URL沒有顯現
		
		doGet(request,response);
	
	}

}
