package com.kaoni.it.memo.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kaoni.it.memo.dao.MemoDAO;
import com.kaoni.it.memo.vo.MemoVO;

@Controller
public class MemoContoller {
	
	@Resource(name="MemoDAO")
	private MemoDAO dao;
	
	@RequestMapping(value="/main")
	public String aaa(){
		return "/main/main";
	}
	/**
	 * memoInsert
	 * */
	@RequestMapping(value="/memoInsert", method=RequestMethod.POST)
	@ResponseBody
	public int memoInsert(@RequestParam String content, @RequestParam String userNo, @RequestParam String color, 
			@RequestParam String memoX, @RequestParam String memoY, @RequestParam String tabNo){
		
		MemoVO param = new MemoVO();
		param.setContent(content);
		param.setUserNo(Integer.parseInt(userNo));
		param.setColor(color);
		param.setMemoX(Integer.parseInt(memoX));
		param.setMemoY(Integer.parseInt(memoY));
		param.setTabNo(Integer.parseInt(tabNo));
		
		dao.memoInsert(param);
		
		return dao.memoSelect(param).getMemoNo();
	}
	
	/**
	 * memoDelete
	 * */
	@RequestMapping(value="/memoDelete", method=RequestMethod.POST)
	@ResponseBody
	public void memoInsert(@RequestParam int memoNo){
		
		dao.memoDelete(memoNo);
	}
	
	/**
	 * memoUpdate
	 * */
	@RequestMapping(value="/memoUpdate", method=RequestMethod.POST)
	@ResponseBody
	public void memoUpdate(@RequestParam String content, @RequestParam int memoX, @RequestParam int memoY, @RequestParam int memoNo){
		
		MemoVO param = new MemoVO();
		param.setContent(content);
		param.setMemoX(memoX);
		param.setMemoY(memoY);
		param.setMemoNo(memoNo);
		
		dao.memoInsert(param);
	}
}
