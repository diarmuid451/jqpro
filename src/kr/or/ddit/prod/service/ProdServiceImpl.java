package kr.or.ddit.prod.service;

import java.sql.SQLException;
import java.util.List;


import kr.or.ddit.prod.dao.IProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements IProdService {
	
	private static IProdService service;
	private IProdDao dao;
	
	public static IProdService getInstance() {
		if(service == null) service = new ProdServiceImpl();
		return service;
	}
	
	private ProdServiceImpl() {
		dao = ProdDaoImpl.getInstance();
	}
	
	
	@Override
	public List<ProdVO> listProd(String lprod_gu) {
		List<ProdVO> listProd = null;
		
		try {
			listProd = dao.listProd(lprod_gu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return	listProd;
	}

	@Override
	public ProdVO checkProd(String prod_id) {
		ProdVO checkProd = null;
		
		try {
			checkProd = dao.checkProd(prod_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return checkProd;
	}

}
