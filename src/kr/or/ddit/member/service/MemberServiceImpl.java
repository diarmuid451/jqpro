package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public class MemberServiceImpl implements IMemberService {
	
	private static IMemberService service;
	private IMemberDao dao;
	
	public static IMemberService getInstance() {
		if(service == null) service = new MemberServiceImpl();
		return service;
	}
	
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	
	@Override
	public String checkId(String id) {
		String check = null;
		try {
			check =  dao.checkId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	@Override
	public List<ZipVO> listZip(String dong) {
		List<ZipVO> list = null;
		try {
			list = dao.listZip(dong);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public String insertMember(MemberVO vo) {
		String result = null;
		try {
			result = dao.insertMember(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
