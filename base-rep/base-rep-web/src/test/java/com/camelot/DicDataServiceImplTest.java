package com.camelot;

import com.camelot.common.CommonTest;
import com.camelot.domain.DicDataBean;
import com.camelot.service.DicDataService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/** 
 * <p>Description: [数据字典service 单元测试]</p>
 * Created on 2016年3月25日
 * @author  <a href="mailto: liuchao@camelotchina.com">刘超</a>
 * @version 1.0 
 * Copyright (c) 2016 北京柯莱特科技有限公司 交付部 
 */ 
public class DicDataServiceImplTest extends CommonTest {


	@Resource
	DicDataService dicDataService;
	

	@Test
	public void testQueryById() {
		DicDataBean t = dicDataService.queryById(6l);
		Assert.assertNotNull(t);
	}



}
