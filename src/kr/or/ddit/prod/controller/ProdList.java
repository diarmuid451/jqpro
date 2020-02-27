package kr.or.ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.ProdVO;

/**
 * Servlet implementation class ProdList
 */
@WebServlet("/p.do")
public class ProdList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// 0. 요청시 클라이언트에서 값을 전달 받는다.
				String lgu = request.getParameter("lprod_gu");
				// 1. service객체 얻기
				IProdService service = ProdServiceImpl.getInstance();
				// 2. service메서드 호출 - 결과값 얻기
				List<ProdVO> list = service.listProd(lgu);
				// 3. 결과값을 request에 저장하기
				request.setAttribute("listProd", list);
				// 4. 결과값을 출력(json데이터 생성) - view페이지로 이동(forward방식)
				RequestDispatcher disp = request.getRequestDispatcher("0224/prodNo.jsp");
				
				disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// 0. 클라이언트 요청시 전달되는 값을 받는다. 
				String id = request.getParameter("prod_id");
				// 1. service객체를 얻는다.
				IProdService service = ProdServiceImpl.getInstance();
						
				// 2. service메소드를 호출한다. 결과값을 받는다.
				ProdVO vo = service.checkProd(id);		
						
				// 3. 결과값을 request에 저장
				request.setAttribute("checkProd", vo);	

				// 4. 출력을 위해 view 페이지(jsp)로 이동 
				// forword : controller와 view가 response와 request를 공유한다.
				// redirect : 한번 서버 밖으로 응답한 후 새로운 request로 재요청하기 때문에 공유 못함. 
				//    request에 저장된 결과값을 jsp페이지로 넘겨준다.

				RequestDispatcher disp = request.getRequestDispatcher("0224/prodVO.jsp");

				disp.forward(request, response);
		
	}

}
