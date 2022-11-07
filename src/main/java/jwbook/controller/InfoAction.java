package jwbook.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jwbook.model.Member;
import jwbook.service.MemberService;

public class InfoAction implements ActionCommand {
   MemberService service=new MemberService();
	
	@Override
	public String action(HttpServletRequest request, 
			             HttpServletResponse response) {
		//프론트콘트롤러로 부터 넘어온 파라미터 "id"를 추출하여
		String id=request.getParameter("id");
		//Memberservice에있는 find()메소드의 매개변수로 넘기고 결과를 받음
		Member member =service.find(id);
		//request에 속성명으로 저장하고 이동할페이지를 프론트컨트롤러로 리턴함
		request.setAttribute("mem", member);
		return "/MemberInfo.jsp";
	}

}
