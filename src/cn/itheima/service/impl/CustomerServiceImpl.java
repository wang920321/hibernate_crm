/**  

* Title: CustomerServiceImpl.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月21日  

* @version 1.0  

*/
package cn.itheima.service.impl;

import cn.itheima.dao.CustomerDao;
import cn.itheima.dao.impl.CustemerDaoImpl;
import cn.itheima.domain.Customer;
import cn.itheima.service.CustomerService;

/**  

* Title: CustomerServiceImpl  

* Description:   

* @author 172219902  

* @date 2018年3月21日  

*/
public class CustomerServiceImpl implements CustomerService{
    private CustomerDao customerDao=new CustemerDaoImpl();
	/* (non-Javadoc)  
	
	 * Title: save 
	
	 * Description:   
	
	 * @param customer  
	
	 * @see cn.itheima.service.CustomerService#save(cn.itheima.domain.Customer)  
	
	 */
	@Override
	public void save(Customer customer) {
		//调用Dao保存客户
		customerDao.save(customer);
	}

}
