/**  

* Title: CustemerDaoImpl.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月21日  

* @version 1.0  

*/
package cn.itheima.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itheima.dao.CustomerDao;
import cn.itheima.domain.Customer;
import cn.itheima.utils.HibernateUtils;

/**  

* Title: CustemerDaoImpl  

* Description:   

* @author 172219902  

* @date 2018年3月21日  

*/
public class CustemerDaoImpl implements CustomerDao {

	/* (non-Javadoc)  
	
	 * Title: save 
	
	 * Description:   
	
	 * @param customer  
	
	 * @see cn.itheima.dao.CustomerDao#save(cn.itheima.domain.Customer)  
	
	 */
	@Override
	public void save(Customer customer) {
		//1获得session
		Session session = HibernateUtils.openSession();
		//2打开事务
		Transaction tx = session.beginTransaction();
		//3执行保存
		session.save(customer);
		//4提交事务
        tx.commit();
        //5关闭资源
        session.close();
	}

}
