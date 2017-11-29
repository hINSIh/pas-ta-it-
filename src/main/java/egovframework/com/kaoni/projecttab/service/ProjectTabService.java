package egovframework.com.kaoni.projecttab.service;

import java.util.List;

import egovframework.com.kaoni.projecttab.vo.ProjectTabVO;

public interface ProjectTabService {
	boolean createTab(String name, int projectNo) throws Exception;
	
	boolean updateTab(ProjectTabVO tabVO) throws Exception;
	
	boolean deleteTab(int tabNo) throws Exception;
	
	List<ProjectTabVO> getList(int projectNo) throws Exception;
}
