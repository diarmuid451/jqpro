package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdDao {

	public List<ProdVO> listProd(String lprod_gu) throws SQLException;
	public ProdVO checkProd(String prod_id) throws SQLException;
}
