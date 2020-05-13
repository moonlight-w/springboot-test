package com.moon.interceptor;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.moon.entity.User;
import com.moon.service.PermitService;
import com.moon.utils.BaseController;

public class InterceptorB extends BaseController implements HandlerInterceptor {
	@Autowired
	private PermitService permitService;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("InterceptorB");
		// 根据account拿到apis
		User user = (User) arg0.getSession().getAttribute("user");
		List<String> apis = permitService.selectApisByUserAccount(user.getAccount());
		// 鉴权
		if (!apis.contains(arg0.getRequestURI())) {
			if (super.isAjax(arg0)) {
				arg1.getWriter().print("auth-fail");
			} else {
				arg0.getRequestDispatcher("/error").forward(arg0, arg1);
			}
			return false;
		}
		return true;
	}

}
