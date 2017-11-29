package egovframework.com.kaoni.memo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.kaoni.memo.dao.MemoDAO;
import egovframework.com.kaoni.memo.vo.MemoVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("MemoService")
public class MemoServiceImpl extends EgovAbstractServiceImpl implements MemoService {

	@Resource(name = "MemoDAO")
    private MemoDAO dao;
	
	@Override
	public boolean createMemo(MemoVO memoVO) throws Exception{
		return dao.createMemo(memoVO);
	}

	@Override
	public boolean update(MemoVO memoVO) throws Exception{
		return dao.update(memoVO);
	}

	@Override
	public boolean delete(int memoNo) throws Exception {
		return dao.delete(memoNo);
	}

	@Override
	public List<MemoVO> getList(int tabNo) throws Exception {
		return dao.getList(tabNo);
	}

}
