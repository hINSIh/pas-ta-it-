package egovframework.com.kaoni.memo.service;

import java.util.List;

import egovframework.com.kaoni.memo.vo.MemoVO;

public interface MemoService {
	boolean createMemo(MemoVO memoVO);

	boolean update(MemoVO memoVO);

	boolean delete(int memoNo);

	List<MemoVO> getList(int tabNo);
}
