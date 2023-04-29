package com.app.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.Dto.MemberDto;

public class MemberDaoImpl {
	
	private Connection conn;
	
	// 데이터베이스 연결 담당 메소드
	public Connection connection()
	{
		//conn = DBConn.getConnection();
		return conn;
	}
	
	// 회원 추가
	public int insertAccount(MemberDto dto) throws SQLException
	{
		int result = 0;
		String sql = "INSERT INTO MEMBER(USER_ID, USER_NAME, PASSWORD, EMAIL, PHONE, ZIP, ADDRESS1, ADDRESS2, GENDER, BIRTH)"
				   + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getUser_id());
		pstmt.setString(2, dto.getUser_name());
		pstmt.setString(3, dto.getPassword());
		pstmt.setString(4, dto.getEmail());
		pstmt.setString(5, dto.getPhone());
		pstmt.setString(6, dto.getZip());
		pstmt.setString(7, dto.getAddress1());
		pstmt.setString(8, dto.getAddress2());
		pstmt.setInt(9, dto.getGender());
		pstmt.setInt(10, dto.getBirth());
				
		result = pstmt.executeUpdate();
		pstmt.close();
		return result;
	}
	
	// 회원 리스트 전체 출력
	public ArrayList<MemberDto> lists() throws SQLException
	{
		ArrayList<MemberDto> result = new ArrayList<MemberDto>();
		String sql = "SELECT USER_ID, USER_NAME, PASSWORD, EMAIL, PHONE, ZIP, ADDRESS1, ADDRESS2, GENDER, BIRTH FROM MEMBER ORDER BY USER_ID";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next())
		{
			MemberDto member = new MemberDto();
			member.setUser_id(rs.getString("USER_ID"));
			member.setUser_name(rs.getString("USER_NAME"));
			member.setPassword(rs.getString("PASSWORD"));
			member.setEmail(rs.getString("EMAIL"));
			member.setPhone(rs.getString("PHONE"));
			member.setZip(rs.getString("ZIP"));
			member.setAddress1(rs.getString("ADDRESS1"));
			member.setAddress2(rs.getString("ADDRESS2"));
			member.setGender(rs.getInt("GENDER"));
			member.setBirth(rs.getInt("BIRTH"));
			
			result.add(member);
		}
		rs.close();
		pstmt.close();
		return result;
	}
	
	// 회원 정보 수정
	public int updateAccount(MemberDto dto) throws SQLException
	{
		int result = 0;
		String sql = "UPDATE MEMBER SET USER_NAME=?, PASSWORD=?, EMAIL=?, PHONE=?, ZIP=?, ADDRESS1=?, ADDRESS2=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getUser_name());
		pstmt.setString(2, dto.getPassword());
		pstmt.setString(3, dto.getEmail());
		pstmt.setString(4, dto.getPhone());
		pstmt.setString(5, dto.getZip());
		pstmt.setString(6, dto.getAddress1());
		pstmt.setString(7, dto.getAddress2());
		
		result = pstmt.executeUpdate();
		
		return result;
	}

	// 회원 정보 삭제
	public int deleteAccount(String user_id) throws SQLException
	{
		MemberDto dto = new MemberDto();

		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE USER_ID = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user_id);
		result = pstmt.executeUpdate();
		return result;
	}	
}