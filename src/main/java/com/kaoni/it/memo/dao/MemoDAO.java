package com.kaoni.it.memo.dao;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kaoni.it.memo.vo.MemoVO;

@Repository("MemoDAO")
public class MemoDAO {
	@Inject
	public SqlSession session;
	
	//insert
	public void memoInsert(MemoVO param) {
		session.insert("memo.memoCreate", param);
	}
	
	public MemoVO memoSelect(MemoVO param){
		return session.selectOne("memo.memoSelect", param);
	}
	
	//delete
	public void memoDelete(int memoNo) {
		session.delete("memo.memoDelete", memoNo);
	}
	
	//update
	public void memoUpdate(MemoVO param) {
		session.update("memo.memoUpdate", param);
	}
	
	
}
