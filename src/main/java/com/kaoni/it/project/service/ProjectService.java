package com.kaoni.it.project.service;

import java.util.List;

import com.kaoni.it.project.vo.ProjectVO;

public interface ProjectService {
	boolean insertProject(String name, int userNo);
	
	boolean updateProject(ProjectVO projectVO);
	
	boolean deleteProject(int projectNo);
	
	List<ProjectVO> getList(int userNo);
}
