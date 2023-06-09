package com.ezen.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ezen.member.dto.DataBaseConnectionInfo;

public class StudentDao {

	// 스프링 컨테이너에 넣어서 사용할 예정이므로, 싱글턴 코딩은 하지 않음
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String driver;
	String url;
	String id;
	String pw;
	
	StudentDao( DataBaseConnectionInfo dbconinfo){ // 생성자에 전달인수가 객체인 형태
		this.driver = dbconinfo.getDriver();
		this.url = dbconinfo.getUrl();
		this.id = dbconinfo.getId();
		this.pw = dbconinfo.getPw();
		
		
		
		
	}
	
}
