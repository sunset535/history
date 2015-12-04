package rml.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import rml.model.HistoryTag;
import rml.service.HistoryTagService;

@Controller
@RequestMapping("/historytagController")
public class HistoryTagController {

	@Autowired
	HistoryTagService histagTagService;
	
	@RequestMapping(value="/listHistoryTag")
	public String listUser(HttpServletRequest request) {
		
		List <HistoryTag> list = histagTagService.getAll();
		request.setAttribute("historyTagList", list);
		return "listHistoryTag";
	}
	
	@RequestMapping(value="/addHistoryTag")
	public String addHistoryTag(HistoryTag historyTag) {
		
		historyTag.setCreatetime(new Date());
		historyTag.setLastupdatetime(new Date());
		histagTagService.insert(historyTag);
		return "redirect:/historytagController/listHistoryTag.do";
	}
}
