package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class BuyerDaoImpl implements IBuyerDao {
	
	private SqlMapClient client;
	private static IBuyerDao dao;
	
	private BuyerDaoImpl() {
		client = SqlMapClientFactory.getSMClient();
	}
	
	public static IBuyerDao getInstance() {
		if(dao == null) dao = new BuyerDaoImpl();
		
		return dao;
	}
	
	@Override
	public List<BuyerVO> buyerList() throws SQLException {
		// TODO Auto-generated method stub
		return client.queryForList("buyer.buyerList");
	}

	@Override
	public BuyerVO checkList(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (BuyerVO) client.queryForObject("buyer.checkList",id);
	}

}
