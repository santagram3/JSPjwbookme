package jwbook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jwbook.model.Member;


@WebServlet("/memberlist")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Member>mlist=new ArrayList<>();
		
		mlist.add(new Member("hong", "hong@naver.com"));
		mlist.add(new Member("kim",  "kim@naver.com"));
		mlist.add(new Member("kang", "kang@naver.com"));
		mlist.add(new Member("wang",  "wang@daum.net"));
		mlist.add(new Member("iljimae", "iljimae@naver.com"));
		
		//콘솔
		for(Member m:mlist){
			System.out.println(m);
		}
		
		//웹 출력
		PrintWriter out = response.getWriter();
		out.append("<html><body>");
		for(Member m:mlist) {
		  out.append(m.getName()+","+m.getEmail()+"<br>");
		}
		out.append("</boby></html>");
		
		//forward로 이동 전에 request객체에 전달할 객체를 속성(attribute)으로 저장
		//setAttribute(속성명,객체);
		request.setAttribute("mlist", mlist);
		
		//jsp로 출력을 넘김
		//1.이동(forward)할 경로 지정
		RequestDispatcher dispatcher 
		   = request.getRequestDispatcher("members.jsp");
		//2.request와 response를 넘김
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
