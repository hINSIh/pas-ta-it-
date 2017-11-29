package egovframework.com.kaoni.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.kaoni.project.vo.ProjectVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("ProjectDAO")
public class ProjectDAO extends EgovAbstractDAO {
	
	/**
	 * 프로젝트 생성
	 * @param name
	 * @param userNo
	 * @return
	 * @throws Exception
	 */
	public boolean insertProject(String name, int userNo) throws Exception{
		
		return false;
	}
	
	/**
	 * 프로젝트 수정
	 * @param projectVO
	 * @return
	 * @throws Exception
	 */
	public boolean updateProject(ProjectVO projectVO) throws Exception{
		
		return false;
	}
	
	/**
	 * 프로젝트 삭제
	 * @param projectNo
	 * @return
	 * @throws Exception
	 */
	public boolean deleteProject(int projectNo) throws Exception{
		
		return false;
	}
	
	/**
	 * 프로젝트리스트 가져오기
	 * @param userNo
	 * @return
	 * @throws Exception
	 */
	public List<ProjectVO> getList(int userNo) throws Exception{
		
		return null;
	}
	
	
	
}
