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

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itheima.dao.CustomerDao;
import cn.itheima.domain.Customer;
import cn.itheima.domain.LinkMan;
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
		Session session = HibernateUtils.getCurrentSession();
		
		//3执行保存
		session.save(customer);

	}

	/* (non-Javadoc)  
	
	 * Title: getAll 
	
	 * Description:   
	
	 * @return  
	
	 * @see cn.itheima.dao.CustomerDao#getAll()  
	
	 */
	@Override
	public List<Customer> getAll() {
		Session session = HibernateUtils.getCurrentSession();
		Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> list = criteria.list();
		return list;
	}

	/* (non-Javadoc)  
	
	 * Title: addLinkMan 
	
	 * Description:   
	
	 * @param linkman  
	
	 * @see cn.itheima.dao.CustomerDao#addLinkMan(cn.itheima.domain.LinkMan)  
	
	 */
	@Override
	public void addLinkMan(LinkMan linkman) {
		Session session = HibernateUtils.getCurrentSession();
		session.save(linkman);
		
	}

	/* (non-Javadoc)  
	
	 * Title: getCustmerById 
	
	 * Description:   
	
	 * @param cust_id
	 * @return  
	
	 * @see cn.itheima.dao.CustomerDao#getCustmerById(java.lang.Long)  
	
	 */
	@Override
	public Customer getCustmerById(Long cust_id) {
		Session session = HibernateUtils.getCurrentSession();
		Customer customer = session.get(Customer.class, cust_id);
		return customer;
	}

}
