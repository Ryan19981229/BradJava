package tw.brad.ok;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Brad21
 */
@WebServlet("/Brad21")
public class Brad21 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source = "C:\\Users\\Ryan\\git\\JAVA-course\\BradJava\\dir1\\下載.jpeg";
		BufferedImage img = ImageIO.read(new File(source));
		Graphics2D g2d = img.createGraphics();
		
		Font font = new Font(null , Font.BOLD + Font.ITALIC, 30);
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(30));
		font = font.deriveFont(tran);
		
		g2d.setColor(Color.BLUE);
		g2d.setFont(font);
      
		g2d.drawString("資展國際",50,50);
		
		
		//response.setContentType("image/jpeg");
		//OutputStream os = response.getOutputStream();
		//ImageIO.write(img, "jpeg", os);
		
		ImageIO.write(img,"jpeg",new FileImageOutputStream(new File("C:\\Users\\Ryan\\eclipse-workspace\\BradWeb\\src\\main\\webapp\\dir1/123.jpg")));
		
		
		response.flushBuffer();
		
		
		
	}


}
