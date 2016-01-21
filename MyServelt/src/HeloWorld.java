

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


/**
 * Servlet implementation class HeloWorld
 */
@WebServlet("/HeloWorld")
public class HeloWorld extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	{
	try{
	response.setContentType("text/html");
	PrintWriter printWriter = response.getWriter();
	printWriter.println("<h2>");
	
	printWriter.println("Hello World");
	printWriter.println("</h2>"); }
	catch (IOException ioException) {
	ioException.printStackTrace();
	}
	}

}
