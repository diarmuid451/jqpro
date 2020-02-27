package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public class MemberDaoImpl implements IMemberDao {
	
	private SqlMapClient client;
	private static IMemberDao dao;
	
	private MemberDaoImpl() {
		client = SqlMapClientFactory.getSMClient();
	}
	
	public static IMemberDao getInstance() {
		if(dao == null) dao = new MemberDaoImpl();
		
		return dao;
	}
	
	@Override
	public String checkId(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (String) client.queryForObject("member.checkId",id);
	}

	@Override
	public List<ZipVO> listZip(String dong) throws SQLException {
		// TODO Auto-generated method stub
		return client.queryForList("member.listZip", dong);
	}

	@Override
	public String insertMember(MemberVO vo) throws SQLException {
		// TODO Auto-generated method stub
		return (String) client.insert("member.insertMember", vo);
	}

}
