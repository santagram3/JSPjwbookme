package jwbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) throws ServletException, IOException {
		//요청받기(request)
		int n1 = Integer.parseInt(request.getParameter("n1"));
		String op = request.getParameter("op");
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		//처리
		long result =0;
		
		switch(op) {
		case "+": result=n1+n2; break;
		case "-": result=n1-n2; break;
		case "*": result=n1*n2; break;
		case "/": result=n1/n2; break;
		}
		
		//응답(response)
		//PrintWriter 객체 생성 전 에 setContentType설정
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		out.append("<!doctype html><html><body><h2>계산기 서블릿</h2>");
		out.append("계산결과: "+result+"</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
