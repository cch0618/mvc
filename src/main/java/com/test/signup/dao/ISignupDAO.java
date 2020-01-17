package com.test.signup.dao;

import com.test.signup.dto.SignupDTO;

public interface ISignupDAO {

    // 회원가입
    public void insertSignup(SignupDTO dto);
    // 시퀀스로 회원 데이타 select
    public void getDataByUserNo(String user_no);
    // 아이디로 회원 데이터 select
    public void getDataByUserID(String user_id);
    // 아이디 찾기
    public void selectID(SignupDTO dto);
    // 비밀번호 변경
    public void modifyPW(SignupDTO dto);
    // 로그인
    public void login(SignupDTO dto);
    // 아이디 중복 확인
    public void checkDuplicatedID(String user_id);

}
