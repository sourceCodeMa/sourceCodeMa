package com.camelot.service;

import com.camelot.domain.DicDataBean;

/** 
 * <p>Description: [数据字典service]</p>
 * Created on 2016年3月25日
 * @author  <a href="mailto: liuchao@camelotchina.com">刘超</a>
 * @version 1.0 
 * Copyright (c) 2016 北京柯莱特科技有限公司 交付部 
 */ 
public interface DicDataService {


	/**
	 * <p>Discription:[通过id查询]</p>
	 * Created on 2016年3月25日
	 * @param id
	 * @return
	 * @author:[刘超]
	 */
	public DicDataBean queryById(Long id);


}
