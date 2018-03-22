package cn.itheima.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.itheima.domain.Customer;
import cn.itheima.domain.LinkMan;
import cn.itheima.service.CustomerService;
import cn.itheima.service.impl.CustomerServiceImpl;

public class AddLinkmanServlet extends HttpServlet {

	/**
	 *serialVersionUID
	 */  
	private static final long serialVersionUID = 1L;
    private CustomerService service=new CustomerServiceImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkMan linkman=new LinkMan();
		try {
			BeanUtils.populate(linkman, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		service.addLinkMan(linkman);
		response.sendRedirect(request.getContextPath()+"/listLinkMan");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}