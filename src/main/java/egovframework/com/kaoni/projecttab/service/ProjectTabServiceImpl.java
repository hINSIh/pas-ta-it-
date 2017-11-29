package egovframework.com.kaoni.projecttab.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.kaoni.projecttab.dao.ProjectDAO;
import egovframework.com.kaoni.projecttab.vo.ProjectTabVO;

@Service("ProjectTabService")
public class ProjectTabServiceImpl implements ProjectTabService {
	
	@Resource(name="ProjectTabDAO")
	private ProjectDAO dao;
	
	@Override
	public boolean createTab(String name, int projectNo) throws Exception {
		return dao.createTab(name, projectNo);
	}

	@Override
	public boolean updateTab(ProjectTabVO tabVO) throws Exception {
		return dao.updateTab(tabVO);
	}

	@Override
	public boolean deleteTab(int tabNo) throws Exception {
		return dao.deleteTab(tabNo);
	}

	@Override
	public List<ProjectTabVO> getList(int projectNo) throws Exception {
		return dao.getList(projectNo);
	}

}
