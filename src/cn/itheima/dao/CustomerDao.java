/**  

* Title: CustomerDao.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月21日  

* @version 1.0  

*/
package cn.itheima.dao;

import java.util.List;

import cn.itheima.domain.Customer;
import cn.itheima.domain.LinkMan;

/**  

* Title: CustomerDao  

* Description:   

* @author 172219902  

* @date 2018年3月21日  

*/
public interface CustomerDao {
    void save(Customer customer);

	/**  
	
	 * Title: getAll  
	
	 * Description:  
	
	 * @return  
	
	 */ 
	List<Customer> getAll();

	/**  
	
	 * Title: addLinkMan  
	
	 * Description:  
	
	 * @param linkman  
	
	 */ 
	void addLinkMan(LinkMan linkman);

	/**  
	
	 * Title: getCustmerById  
	
	 * Description:  
	
	 * @param cust_id
	 * @return  
	
	 */ 
	Customer getCustmerById(Long cust_id);
}
