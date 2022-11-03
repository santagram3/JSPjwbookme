package jwBookMe;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc/input")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out 
           = response.getWriter();
       out.append("<!doctype html><html><head><title>Hello World</title></head>");
       out.append("<body><h2>");
       out.append(" Hello input world!!</h2></body></html>");
	}
}
