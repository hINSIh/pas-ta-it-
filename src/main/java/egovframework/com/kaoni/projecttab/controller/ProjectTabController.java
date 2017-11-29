package egovframework.com.kaoni.projecttab.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import egovframework.com.kaoni.projecttab.service.ProjectTabService;
import egovframework.com.kaoni.projecttab.vo.ProjectTabVO;

@Controller
public class ProjectTabController {
	
	@Resource(name="ProjectTabService")
	private ProjectTabService service;
	
	public String createTab(String name, int projectNo){
		try {
			service.createTab(name, projectNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String updateTab(ProjectTabVO tabVO){
		try {
			service.updateTab(tabVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String deleteTab(int tabNo){
		try {
			service.deleteTab(tabNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String getList(int projectNo){
		try {
			service.getList(projectNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
