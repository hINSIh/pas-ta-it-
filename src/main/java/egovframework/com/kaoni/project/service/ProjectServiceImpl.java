package egovframework.com.kaoni.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.kaoni.project.dao.ProjectDAO;
import egovframework.com.kaoni.project.vo.ProjectVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("ProjectService")
public class ProjectServiceImpl extends EgovAbstractServiceImpl implements ProjectService {
	
	@Resource(name="ProjectDAO")
	private ProjectDAO dao;
	
	@Override
	public boolean insertProject(String name, int userNo) throws Exception {
		return dao.insertProject(name, userNo);
	}

	@Override
	public boolean updateProject(ProjectVO projectVO) throws Exception {
		return dao.updateProject(projectVO);
	}

	@Override
	public boolean deleteProject(int projectNo) throws Exception {
		return dao.deleteProject(projectNo);
	}

	@Override
	public List<ProjectVO> getList(int userNo) throws Exception {
		return dao.getList(userNo);
	}

}
