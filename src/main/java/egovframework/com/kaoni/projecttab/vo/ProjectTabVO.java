package egovframework.com.kaoni.projecttab.vo;

public class ProjectTabVO {
	private int tabNo;
	private int projectNo;
	private String tabName;

	public int getTabNo() {
		return tabNo;
	}

	public void setTabNo(int tabNo) {
		this.tabNo = tabNo;
	}

	public int getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}

	public String getTabName() {
		return tabName;
	}

	public void setTabName(String tabName) {
		this.tabName = tabName;
	}
	
	@Override
	public String toString() {
		return "ProjectTabVO [tabNo=" + tabNo + ", projectNo=" + projectNo + ", tabName=" + tabName + "]";
	}
}
