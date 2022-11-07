package jwbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jwbook.model.Product;
import jwbook.service.ProductService;


@WebServlet("/pcontrol")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProductService service;


	@Override
	protected void service(HttpServletRequest request, 
			               HttpServletResponse response) 
			            		   throws ServletException, IOException {
     System.out.println("서비스호출....");
	 String action=request.getParameter("action");
     String view="";
     
     if(action==null) {
    	 view="/pcontrol?action=list";
    	 getServletContext().getRequestDispatcher(view)
    	                    .forward(request, response);
     }else {
    	 switch(action) {
    	 case "list":
    		         view = list(request,response); 
    		         break;
    	 case "info": info(request,response); 
    	              view="/productInfo.jsp";
    	 
    	 break;
    	 }
    	 RequestDispatcher dispatcher
    	  = request.getRequestDispatcher(view);
    	 dispatcher.forward(request, response);
    	 //getServletContext().getRequestDispatcher(view).forward(request, response); 
     }
		
}

	private String info(HttpServletRequest request, HttpServletResponse response) {
		//service의 find(id)메소드로 리스트 추출하여 request에 담기
		String id=request.getParameter("id");
		Product product = service.find(id);
		request.setAttribute("p", product);
		//request.setAttribute("p", service.find(request.getParameter("id"))); 
		return "/productInfo.jsp";
	}

	private String list(HttpServletRequest request, HttpServletResponse response) {
		//service의 findAll()메소드로 리스트 추출하여 request에 담기
		List<Product> products = service.findAll();
		request.setAttribute("products", products);
		return "/productList.jsp";//이동할 페이지
	}

	//서블릿이 초기화될때 서비스객체가 주입됨.
	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화....");
		super.init(config);
		service = new ProductService();
	}
}
