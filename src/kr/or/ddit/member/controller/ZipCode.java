package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.ZipVO;

/**
 * Servlet implementation class ZipCode
 */
@WebServlet("/ZipCode")
public class ZipCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZipCode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 요청시 클라이언트에서 값을 전달 받는다.
		request.setCharacterEncoding("UTF-8");
		String dong = request.getParameter("dong");
		// 1. service객체 얻기
		IMemberService service = MemberServiceImpl.getInstance();
		// 2. service메서드 호출 - 결과값 얻기
		List<ZipVO> list = service.listZip(dong);
		// 3. 결과값을 request에 저장하기
		request.setAttribute("listZip", list);	
		// 4. 결과값을 출력(json데이터 생성) - view페이지로 이동(forward방식)
		request.getRequestDispatcher("0226/listZip.jsp").forward(request, response);
	}

}
