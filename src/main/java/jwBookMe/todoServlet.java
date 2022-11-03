package jwBookMe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class todoServlet
 */
@WebServlet("/todoServlet")
public class todoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Todo> todoList = new ArrayList<>();
		todoList.add(new Todo(1,"첫번째 할일" , "모닝커피",new Date(),new Date()));
		todoList.add(new Todo(2,"두번째 할일" , "조깅커피",new Date(),new Date()));
		todoList.add(new Todo(3,"세번째 할일" , "샤워커피",new Date(),new Date()));
		todoList.add(new Todo(4,"네번째 할일" , "운동커피",new Date(),new Date()));
		
		// request에 "todolist" 라는 이름으로 todoList 객체를 실어 보냄 
		request.setAttribute("todolist", todoList);
		request.getSession().setAttribute("todolist", todoList);
		ServletContext application = null;
		application.setAttribute("todolist", todoList);
		
		// todolist.jsp 로 포워딩 
		RequestDispatcher dispatcher 
		  = request.getRequestDispatcher("todolist3.jsp");
		// 결과를 다른 페이지로 포워딩 
		dispatcher.forward(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
