package egovframework.com.kaoni.memo.service;

import java.util.List;

import egovframework.com.kaoni.memo.vo.MemoVO;

public interface MemoService {
	boolean createMemo(MemoVO memoVO) throws Exception;

	boolean update(MemoVO memoVO) throws Exception;

	boolean delete(int memoNo) throws Exception;

	List<MemoVO> getList(int tabNo) throws Exception;
}
