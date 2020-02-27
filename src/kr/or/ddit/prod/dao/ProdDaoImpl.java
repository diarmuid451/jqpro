package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements IProdDao {

	private SqlMapClient client;
	private static IProdDao dao;
	
	private ProdDaoImpl() {
		client = SqlMapClientFactory.getSMClient();
	}
	
	public static IProdDao getInstance() {
		if(dao == null) dao = new ProdDaoImpl();
		
		return dao;
	}
	
	
	
	@Override
	public List<ProdVO> listProd(String lprod_gu) throws SQLException {
		
		return client.queryForList("prod.listProd",lprod_gu);
	}

	@Override
	public ProdVO checkProd(String prod_id) throws SQLException {
		
		return (ProdVO) client.queryForObject("prod.checkProd", prod_id);
	}

}
