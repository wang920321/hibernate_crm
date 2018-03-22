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

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itheima.dao.CustomerDao;
import cn.itheima.dao.impl.CustemerDaoImpl;
import cn.itheima.domain.Customer;
import cn.itheima.domain.LinkMan;
import cn.itheima.service.CustomerService;
import cn.itheima.utils.HibernateUtils;

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
		Session session = HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		//调用Dao保存客户
		try{
			customerDao.save(customer);
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		
		//提交事务
		tx.commit();
	}
	/* (non-Javadoc)  
	
	 * Title: getAll 
	
	 * Description:   
	
	 * @return  
	
	 * @see cn.itheima.service.CustomerService#getAll()  
	
	 */
	@Override
	public List<Customer> getAll() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		List<Customer> list=null;
		try{
			list=customerDao.getAll();
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		
		tx.commit();
		return list;
	}
	/* (non-Javadoc)  
	
	 * Title: addLinkMan 
	
	 * Description:   
	
	 * @param linkman  
	
	 * @see cn.itheima.service.CustomerService#addLinkMan(cn.itheima.domain.LinkMan)  
	
	 */
	@Override
	public void addLinkMan(LinkMan linkman) {
		
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		try{
			Long cust_id=linkman.getCust_id();
			Customer customer=customerDao.getCustmerById(cust_id);
			linkman.setCustomer(customer);
			customerDao.addLinkMan(linkman);
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		
		
		tx.commit();
		
	}

}
