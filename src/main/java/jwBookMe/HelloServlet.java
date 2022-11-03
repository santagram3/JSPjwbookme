package jwBookMe;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 잘 나오는 페이지 
@WebServlet({ "/hello","/hi" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) 
			           throws ServletException, IOException {

		response.getWriter().append("Served at: \n").append(request.getContextPath())
		                    .append("hello world!!!");
	}


	protected void doPost(HttpServletRequest request, 
			              HttpServletResponse response) 
			            throws ServletException, IOException {
		doGet(request, response);
	}

}