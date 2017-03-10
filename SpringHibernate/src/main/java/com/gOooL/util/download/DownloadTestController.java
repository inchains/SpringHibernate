package com.gOooL.util.download;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownloadTestController {

	@RequestMapping("/download/PDF")
	public String downloadPDF(Model model) {
		
		List<PageRank> pageRanks = Arrays.asList(
			new PageRank(1, "/board/humor/1011"),
			new PageRank(2, "/board/notice/12"),
			new PageRank(3, "/board/phone/190")
		);

		model.addAttribute("pageRanks", pageRanks);
		
		return "downloadPDFView";
	}

	@RequestMapping("/download/Excel")
	public String downloadEXCEL(Model model) {
		
		List<PageRank> pageRanks = Arrays.asList(
			new PageRank(1, "/board/humor/1011"),
			new PageRank(2, "/board/notice/12"),
			new PageRank(3, "/board/phone/190")
		);

		model.addAttribute("pageRanks", pageRanks);
	
		return "downloadExcelView";
	}
}
