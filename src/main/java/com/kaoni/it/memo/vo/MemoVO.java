package com.kaoni.it.memo.vo;

import org.springframework.beans.factory.annotation.Value;

public class MemoVO {
	private int memoNo;
	private int tabNo;
	private int userNo;
	private String content;
	private String filePath;
	private String color;
	private int memoX;
	private int memoY;

	public int getMemoNo() {
		return memoNo;
	}

	public void setMemoNo(int memoNo) {
		this.memoNo = memoNo;
	}

	public int getTabNo() {
		return tabNo;
	}

	public void setTabNo(int tabNo) {
		this.tabNo = tabNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public int getMemoX() {
		return memoX;
	}

	public void setMemoX(int memoX) {
		this.memoX = memoX;
	}

	public int getMemoY() {
		return memoY;
	}

	public void setMemoY(int memoY) {
		this.memoY = memoY;
	}

	@Override
	public String toString() {
		return "MemoVO [memoNo=" + memoNo + ", tabNo=" + tabNo + ", userNo=" + userNo + ", content=" + content + ", filePath=" + filePath + ", color=" + color + "]";
	}

}
