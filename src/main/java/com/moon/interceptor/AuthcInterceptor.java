package com.moon.interceptor;

import com.moon.model.SysUser;
import com.moon.utils.BaseController;
import com.moon.utils.JwtUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthcInterceptor extends BaseController implements HandlerInterceptor {

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
		String mgr_getToken = "http://120.55.53.172:7000/moon/SysUser/getToken";
		String mgr_login = "http://120.55.53.172:7000/login";
		// 查询本系统token
		String token_u = arg0.getParameter("token") == null ? "" : arg0.getParameter("token").trim();
		String token_c = super.getCookieVal(arg0, "token");
		String token = token_u.equals("") ? token_c : token_u;
		// 本系统无token时
		if (token.equals("")) {
			arg1.sendRedirect(mgr_getToken + "?callbackurl=" + arg0.getRequestURL().toString());
			return false;
		}
		// 本系统有token时
		SysUser sysUser = JwtUtils.getObject(token, SysUser.class);
		if (sysUser == null) {
			arg1.sendRedirect(mgr_login);
			return false;
		}
		// success
		super.setCookieVal(arg1, "token", token);
		return true;
	}

}
