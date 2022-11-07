package jwbook;

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


@WebServlet("/todolist")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) throws ServletException, IOException {
     List<Todo> todoList = new ArrayList<>();
     todoList.add(new Todo(1, "첫번째 할일", "모닝커피", new Date(), new Date()));
     todoList.add(new Todo(2, "두번째 할일", "조깅하기", new Date(), new Date()));
     todoList.add(new Todo(3, "세번째 할일", "출근준비", new Date(), new Date()));
     todoList.add(new Todo(4, "네번째 할일", "출근", new Date(), new Date()));
     
     //request에 "todolist"라는 이름으로 todoList객체를 실어보냄.
     request.setAttribute("todolist", todoList);
     request.getSession().setAttribute("todolist", todoList);
     
     //todolist.jsp로 포워딩처리
     RequestDispatcher disptacher 
           = request.getRequestDispatcher("todolist.jsp");
     //결과를 다른페이지로 포워딩
     disptacher.forward(request, response);
     
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}
