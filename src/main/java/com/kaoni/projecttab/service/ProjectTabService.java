package com.kaoni.projecttab.service;

import java.util.List;

import com.kaoni.projecttab.vo.ProjectTabVO;

public interface ProjectTabService {
	boolean createTab(String name, int projectNo);
	
	boolean updateTab(ProjectTabVO tabVO);
	
	boolean deleteTab(int tabNo);
	
	List<ProjectTabVO> getList(int projectNo);
}