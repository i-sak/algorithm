package member.dao;
// DB�����ϴ� Ŭ����

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.bean.MemberDTO;

public class MemberDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";	// ��Ű���� ����..
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // ����Ŭ �ּ� url
	String username = "jspexam";
	String password = "m1234";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	// OracleDriver Ŭ������ ��ϵǾ� �ִ� �� Ȯ��
	// 1. �����ͺ��̽��� �����ϴ� ����̹� ������ ã�´�.
	public MemberDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 2. ������ �����ϴ� Connection ��ü�� �����Ѵ�.
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// 3. SQL �۾� ó�� 
	public int write(MemberDTO memberDTO) {
		int su = 0;
		conn = getConnection();
		String sql = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberDTO.getName());
			pstmt.setString(2, memberDTO.getId());
			pstmt.setString(3, memberDTO.getPwd());
			pstmt.setString(4, memberDTO.getGender());
			pstmt.setString(5, memberDTO.getEmail1());
			pstmt.setString(6, memberDTO.getEmail2());
			pstmt.setString(7, memberDTO.getTel1());
			pstmt.setString(8, memberDTO.getTel2());
			pstmt.setString(9, memberDTO.getTel3());
			pstmt.setString(10, memberDTO.getAddr());
			su = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return su;
	}
	
	// 4. SQL ���� �˻��Ͽ� �α����ϴ� ���
	public String login (String id, String pwd) {
		String name = null;
		conn = getConnection();
		String sql = "select * from member where id=? and pwd=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return name;
	}
	
	// 5. sql db ���̵� �ߺ� Ȯ��
	public boolean isExistId(String id) {
		boolean exist = false;
		conn = getConnection();
		String sql = "select * from member where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
		
			if(rs.next()) {
				exist = true;	// id ������ => id ��� �Ұ���
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return exist;
	}
}
