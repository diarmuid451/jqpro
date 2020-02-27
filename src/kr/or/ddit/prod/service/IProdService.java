package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdService {

	public List<ProdVO> listProd(String lprod_gu);
	public ProdVO checkProd(String prod_id);
}
