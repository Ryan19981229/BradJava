package tw.brad.ok;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.classes.Bike;



@WebServlet("/Course16")
public class Brad16 extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
  Bike b1= (Bike)request.getAttribute("b1");
  
  response.setContentType("text/html; charset=UTF-8");//讓瀏覽器知道要用什麼形式呈現

  PrintWriter out= response.getWriter();
  out.print("I am iroMan" + b1);
 }
 

}
