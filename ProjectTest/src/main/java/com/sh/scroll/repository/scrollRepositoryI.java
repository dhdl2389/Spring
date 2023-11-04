package com.sh.scroll.repository;

import java.util.List;

import com.sh.scroll.domain.ScrollDTO;

public interface scrollRepositoryI {
	public int totalCnt();
	public List<ScrollDTO> getScroll(int curpage, int pageSize, String mode);
	public List<ScrollDTO> getSearch(int curpage, int pageSize, String searchTerm);
	
}
