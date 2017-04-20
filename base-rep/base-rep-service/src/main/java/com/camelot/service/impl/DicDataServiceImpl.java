package com.camelot.service.impl;


import com.camelot.dao.DicDataDAO;
import com.camelot.domain.DicDataBean;
import com.camelot.service.DicDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/** 
 * <p>Description: [数据字典service实现类]</p>
 * Created on 2016年3月25日
 * @author  <a href="mailto: liuchao@camelotchina.com">刘超</a>
 * @version 1.0 
 * Copyright (c) 2016 北京柯莱特科技有限公司 交付部 
 */ 
@Service("dicDataService")
public class DicDataServiceImpl implements DicDataService {

	@Resource
	DicDataDAO dicDataDAO;


	/**
	 * <p>Discription:[通过id查询]</p>
	 * Created on 2016年3月25日
	 * @param id
	 * @return
	 * @author:[刘超]
	 */
	@Override
	public DicDataBean queryById(Long id) {
		DicDataBean dicDataBean = null;
		try {
			dicDataBean = dicDataDAO.queryById(id);

		} catch (Exception e) {
		}
		return dicDataBean;
	}


}
