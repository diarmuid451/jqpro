package kr.or.ddit.buyer.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.buyer.dao.BuyerDaoImpl;
import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.buyer.vo.BuyerVO;

public class BuyerServiceImpl implements IBuyerService {
	
	private static IBuyerService service;
	private IBuyerDao dao;
	
	public static IBuyerService getInstace() {
		if(service == null) service = new BuyerServiceImpl();
		return service;	
	}
	private BuyerServiceImpl() {
		dao = BuyerDaoImpl.getInstance();
	}
	
	@Override
	public List<BuyerVO> buyerList() {
		List<BuyerVO> list = null;
		
		try {
			list = dao.buyerList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BuyerVO checkList(String id) {
		 BuyerVO vo = null;
		 
		 try {
			vo = dao.checkList(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		return vo;
	}

}
