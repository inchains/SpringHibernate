package com.gOooL.util.download;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController implements ApplicationContextAware {

	private WebApplicationContext context = null;
	private static final String DOWN_DIR_PATH = "/WEB-INF/download";
	
	@RequestMapping("/download")
	public ModelAndView download(@RequestParam("fileName") String fileName, HttpServletResponse response) throws IOException {
		
		File downloadFile = getFile(fileName);
		
		if (downloadFile == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
		
		return new ModelAndView("download", "downloadFile", downloadFile);
	}

	private File getFile(String fileName) {
		
		String baseDir = context.getServletContext().getRealPath(DOWN_DIR_PATH);
		
		if (!StringUtils.isEmpty(fileName))
			return new File(baseDir, fileName);
		
		return null;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		this.context = (WebApplicationContext)applicationContext;
	}
}
