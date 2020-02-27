package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.dao.BuyerDaoImpl;
import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.lprod.vo.LprodVO;

public class LprodDaoImpl implements ILprodDao {

	private SqlMapClient client;
	private static ILprodDao dao;
	
	private LprodDaoImpl() {
		client = SqlMapClientFactory.getSMClient();
	}
	
	public static ILprodDao getInstance() {
		if(dao == null) dao = new LprodDaoImpl();
		
		return dao;
	}
	// dao객체 생성, 리턴 - getInstance();
	@Override
	public List<LprodVO> listLprod() throws SQLException {
		// TODO Auto-generated method stub
		return client.queryForList("lprod.listLprod");
	}

}
