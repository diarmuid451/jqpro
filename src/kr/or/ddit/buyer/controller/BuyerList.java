package kr.or.ddit.buyer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;

/**
 * Servlet implementation class BuyerList
 */
@WebServlet("/BuyerList")
public class BuyerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 클라이언트 요청시 전달되는 값을 받는다. (없음)
		
		// 1. service객체를 얻는다.
		IBuyerService service = BuyerServiceImpl.getInstace();
		
		// 2. service메소드를 호출한다. 결과값을 받는다.
		List<BuyerVO> list = service.buyerList();
		
		// 3. 결과값을 request에 저장
		request.setAttribute("buyerList", list);
		
		// 4. 출력을 위해 view 페이지(jsp)로 이동 
		// forword : controller와 view가 response와 request를 공유한다.
		// redirect : 한번 서버 밖으로 응답한 후 새로운 request로 재요청하기 때문에 공유 못함. 
		//    request에 저장된 결과값을 jsp페이지로 넘겨준다.
		
		RequestDispatcher disp = request.getRequestDispatcher("0221/buyerList.jsp");
		
		disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. 클라이언트 요청시 전달되는 값을 받는다. 
		String id = request.getParameter("id");
		// 1. service객체를 얻는다.
		IBuyerService service = BuyerServiceImpl.getInstace();
				
		// 2. service메소드를 호출한다. 결과값을 받는다.
		BuyerVO vo = service.checkList(id);		
				
		// 3. 결과값을 request에 저장
		request.setAttribute("buyerVO", vo);	

		// 4. 출력을 위해 view 페이지(jsp)로 이동 
		// forword : controller와 view가 response와 request를 공유한다.
		// redirect : 한번 서버 밖으로 응답한 후 새로운 request로 재요청하기 때문에 공유 못함. 
		//    request에 저장된 결과값을 jsp페이지로 넘겨준다.

		RequestDispatcher disp = request.getRequestDispatcher("0224/checkList.jsp");

		disp.forward(request, response);
	}

}
