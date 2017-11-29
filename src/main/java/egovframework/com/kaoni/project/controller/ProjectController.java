package egovframework.com.kaoni.project.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import egovframework.com.kaoni.project.service.ProjectService;
import egovframework.com.kaoni.project.vo.ProjectVO;

@Controller
public class ProjectController {
	
	@Resource(name="ProjectService")
	private ProjectService service;
	
	/**
	 * 프로젝트생성
	 * @param name
	 * @param userNo
	 * @return
	 */
	public String insertProject(String name, int userNo){
		try {
			service.insertProject(name, userNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 프로젝트수정
	 * @param projectVO
	 * @return
	 */
	public String updateProject(ProjectVO projectVO){
		try {
			service.updateProject(projectVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 프로젝트삭제
	 * @param projectNo
	 * @return
	 */
	public String deleteProject(int projectNo){
		try {
			service.deleteProject(projectNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 프로젝트리스트 가져오기(내비게이션에 보여줄 리스트)
	 * @param userNo
	 * @return
	 */
	public String getList(int userNo){
		try {
			service.getList(userNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
