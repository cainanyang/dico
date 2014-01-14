package org.cainanyang.dico.server.web;

import org.cainanyang.dico.common.sst.SSTable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SSTableController implements Controller {
	SSTable sstable;

	public void setSstable(SSTable sstable) { this.sstable = sstable; }
	public SSTable getSstable() { return sstable; }

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("sstable", "sstable", sstable);
	}

}