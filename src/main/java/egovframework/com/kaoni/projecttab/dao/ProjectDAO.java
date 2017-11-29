package egovframework.com.kaoni.projecttab.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.kaoni.projecttab.vo.ProjectTabVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("ProjectTabDAO")
public class ProjectDAO extends EgovAbstractDAO {
	
	/**
	 * 프로젝트 탭 생성
	 * @param name
	 * @param projectNo
	 * @return
	 * @throws Exception
	 */
	public boolean createTab(String name, int projectNo) throws Exception{
		return false;
	}
	
	/**
	 * 프로젝트 탭 수정
	 * @param tabVO
	 * @return
	 * @throws Exception
	 */
	public boolean updateTab(ProjectTabVO tabVO) throws Exception{
		return false;
	}
	
	/**
	 * 프로젝트 탭 삭제
	 * @param tabNo
	 * @return
	 * @throws Exception
	 */
	public boolean deleteTab(int tabNo) throws Exception{
		return false;
	}
	
	/**
	 * 프로젝트 탭 리스트 가져오기
	 * @param projectNo
	 * @return
	 * @throws Exception
	 */
	public List<ProjectTabVO> getList(int projectNo) throws Exception{
		return null;
	}
}
