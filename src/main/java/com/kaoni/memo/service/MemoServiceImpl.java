package com.kaoni.memo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kaoni.memo.vo.MemoVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("MemoService")
public class MemoServiceImpl extends EgovAbstractServiceImpl implements MemoService {

	@Override
	public boolean createMemo(MemoVO memoVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MemoVO memoVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int memoNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MemoVO> getList(int tabNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
