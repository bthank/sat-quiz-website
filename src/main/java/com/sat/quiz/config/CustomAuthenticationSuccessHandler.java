package com.sat.quiz.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.abcrentals.binu.thankachan.service.UserService;
import com.sat.quiz.entity.User;


/*
 * Class to handle user authentication success
 * 
 * 
 * 
 */

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private UserService userService;
	/*
	 * method that determines what happens when successful authentication occurs
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		System.out.println("\n\nIn customAuthenticationSuccessHandler\n\n");

		String userName = authentication.getName();
		
		System.out.println("userName=" + userName);

		User theUser = userService.findByUserName(userName);
		
		// now place in the session
		HttpSession session = request.getSession();
		session.setAttribute("user", theUser);
		System.out.println("\n\nIn customAuthenticationSuccessHandler    user.getUserName()= " + ((User)session.getAttribute("user")).getUserName() + "\n\n");
		/*
		 * System.out.
		 * println("In CustomAuthenticationSuccessHandler   in onAuthenticationSuccess()  user= "
		 * + session.getAttribute("user"));
		 */
		
		// forward to home page
		
		response.sendRedirect(request.getContextPath() + "/");
	}

}
