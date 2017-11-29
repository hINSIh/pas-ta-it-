package com.kaoni.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kaoni.project.vo.ProjectVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("ProjectService")
public class ProjectServiceImpl extends EgovAbstractServiceImpl implements ProjectService {

	@Override
	public boolean insertProject(String name, int userNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProject(ProjectVO projectVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProject(int projectNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProjectVO> getList(int userNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
