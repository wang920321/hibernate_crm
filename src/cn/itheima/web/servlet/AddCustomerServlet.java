package cn.itheima.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.itheima.domain.Customer;
import cn.itheima.service.CustomerService;
import cn.itheima.service.impl.CustomerServiceImpl;

public class AddCustomerServlet extends HttpServlet {

	/**
	 *serialVersionUID
	 */  
	private static final long serialVersionUID = 1L;
	private CustomerService customerService=new CustomerServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1获得参数并封装到Customer对象
		Customer customer=new Customer();
		try {
			BeanUtils.populate(customer, request.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2调用service
		customerService.save(customer);
		//3重定向到客户列表
		response.sendRedirect(request.getContextPath()+"/ListCustomerServlet");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}