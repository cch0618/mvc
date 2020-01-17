package com.test.signup.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.signup.dao.ISignupDAO;
import com.test.signup.dto.LoginSession;
import com.test.signup.dto.SignupDTO;

@Controller
public class SignupController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value ="/signupform.action", method = RequestMethod.GET)
    public String signup()
    {
        String view = null;

        view = "signupform";

        return view;
    }

    @RequestMapping(value ="/insertsignup.action", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView insertSignup(SignupDTO dto)
    {
        ModelAndView mav = new ModelAndView();

        ISignupDAO dao = sqlSession.getMapper(ISignupDAO.class);

        try {
            dao.insertSignup(dto);
        } catch (Exception e) {
            e.printStackTrace();
            mav.setViewName("error");
            return mav;
        }
        LoginSession loginSession = new LoginSession();
        loginSession.setUser_no(dto.getUser_no());

        mav.addObject("user_name", dto.getUser_name());
        mav.setViewName("completesignup");

        return mav;
    }

}
