package egovframework.com.kaoni.memo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.com.kaoni.memo.service.MemoService;
import egovframework.com.kaoni.memo.service.MemoServiceImpl;
import egovframework.com.kaoni.memo.vo.MemoVO;

@Controller
public class MemoContoller {
	
	@Resource(name = "MemoService")
    private MemoService service;
	
	/**
	 * memo생성
	 * @param memoVO
	 */
	@RequestMapping()
	public String createMemo(MemoVO memoVO){
		try {
			service.createMemo(memoVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "url";
	}

	/**
	 * memo수정
	 * @param memoVO
	 */
	@RequestMapping()
	public String update(MemoVO memoVO){
		try {
			service.update(memoVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "url";
	}
	
	/**
	 * memo삭제
	 * @param memoNo
	 */
	@RequestMapping()
	public String delete(int memoNo){
		try {
			service.delete(memoNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "url";
	}
	
	/**
	 * memo리스트 가져오기
	 * @param memoNo
	 */
	@RequestMapping()
	public String getList(int tabNo){
		try {
			service.getList(tabNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "url";
	}
}
