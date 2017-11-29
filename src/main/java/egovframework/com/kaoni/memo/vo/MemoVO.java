package egovframework.com.kaoni.memo.vo;

public class MemoVO {
	private int memoNo;
	private int tabNo;
	private int userNo;
	private String content;
	private String filePath;
	private String color;

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

	@Override
	public String toString() {
		return "MemoVO [memoNo=" + memoNo + ", tabNo=" + tabNo + ", userNo="
				+ userNo + ", content=" + content + ", filePath=" + filePath
				+ ", color=" + color + "]";
	}

}
