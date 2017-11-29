package com.kaoni.it.memo.service;

import java.util.List;

import com.kaoni.it.memo.vo.MemoVO;

public interface MemoService {
	boolean createMemo(MemoVO memoVO);

	boolean update(MemoVO memoVO);

	boolean delete(int memoNo);

	List<MemoVO> getList(int tabNo);
}
