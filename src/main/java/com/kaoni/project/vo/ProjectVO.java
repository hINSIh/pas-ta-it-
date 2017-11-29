package com.kaoni.project.vo;

public class ProjectVO {
	private int projectNo;
	private int userNo;
	private String projectName;
	private String projectKey; // uuid.toString

	public int getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	@Override
	public String toString() {
		return "ProjectVO [projectNo=" + projectNo + ", userNo=" + userNo + ", projectName=" + projectName + ", projectKey=" + projectKey + "]";
	}

}
