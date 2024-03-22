package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.bean.Member2DTO;

public class Member2DAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String username = "jspexam";
	String password = "m1234";

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	// OracleDriver Ŭ������ ��ϵǾ� �ִ��� Ȯ��
	// 1. �����ͺ��̽��� �����ϴ� ����̹� ������ ã�´�.
	public Member2DAO() {
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	// 3. SQL �۾� ó�� : ȸ������
	public int write(Member2DTO member2DTO) {
		int su=0;
		conn = getConnection();
		String sql = "insert into member2 values (?,?,?,?,?,?,?,?,?,?,?, sysdate)";
		//('id', 'pwd', 'name', 911215, 'gender','email1', 'email2','tel1', 'tel2', 'tel3','addr', sysdate);
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member2DTO.getId());
			pstmt.setString(2, member2DTO.getPwd());
			pstmt.setString(3, member2DTO.getName());
			pstmt.setInt(4, member2DTO.getBirth());
			pstmt.setString(5, member2DTO.getGender());
			pstmt.setString(6, member2DTO.getEmail1());
			pstmt.setString(7, member2DTO.getEmail2());
			pstmt.setString(8, member2DTO.getTel1());
			pstmt.setString(9, member2DTO.getTel2());
			pstmt.setString(10, member2DTO.getTel3());
			pstmt.setString(11, member2DTO.getAddr());
			su = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return su;
	}
	// �α��� ��� - ID, PWD�� �����Ͽ� ���� Ȯ���ϴ� ����
	public String login(String id, String pwd) {
		String name = null;
		
		conn = getConnection();
		String sql =" select * from member2 where id=? and pwd=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return name;
	}
	// ���̵� �ߺ� üũ 
	public boolean isExistId(String id) {
		boolean exist = false;
		conn = getConnection();
		String sql = "select * from member where id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				exist = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return exist;
	}
}
