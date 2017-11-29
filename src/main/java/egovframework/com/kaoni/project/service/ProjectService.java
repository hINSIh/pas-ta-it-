package egovframework.com.kaoni.project.service;

import java.util.List;

import egovframework.com.kaoni.project.vo.ProjectVO;

public interface ProjectService {
	boolean insertProject(String name, int userNo) throws Exception;
	
	boolean updateProject(ProjectVO projectVO) throws Exception;
	
	boolean deleteProject(int projectNo) throws Exception;
	
	List<ProjectVO> getList(int userNo) throws Exception;
}
