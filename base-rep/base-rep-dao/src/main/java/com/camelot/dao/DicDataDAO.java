package com.camelot.dao;

import com.camelot.domain.DicDataBean;

/** 
 * <p>Description: [数据字典dao]</p>
 * Created on 2016年3月25日
 * @author  <a href="mailto: liuchao@camelotchina.com">刘超</a>
 * @version 1.0 
 * Copyright (c) 2016 北京柯莱特科技有限公司 交付部 
 */ 
public interface DicDataDAO {
	/**
	 * <p>Discription:[根据ID查询]</p>
	 * Created on 2016年3月29日
	 * @param id 主键编号
	 * @return
	 * @author:[刘香平]
	 */
	public DicDataBean queryById(Long id);
	
}
