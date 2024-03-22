package member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.bean.MemberDTO;

// Data Access Object
public class MemberDAO { //DB�� �����ϴ� Ŭ����
	String driver = "oracle.jdbc.driver.OracleDriver";	// ��Ű���� ����..
	String url = "jdbc:oracle:thin:@localhost:1521:xe";	// ����Ŭ �ּ� url
	String username = "jspexam";
	String password = "m1234";
	
	Connection conn;				// ���� API
	PreparedStatement pstmt;		// ���� �Ҵ� API
	ResultSet rs;					// ��� �� API
	
	// OracleDriver Ŭ������ ��ϵǾ� �ִ� �� Ȯ��
	// 1. �����ͺ��̽��� �����ϴ� ����̹� ������ ã�´�. ������
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
	public int write(MemberDTO memberDTO) {	// write �������� ����� DTO�� DB�� �����ϱ� ���� �Ű� ������ DTO�� ����.
		int su = 0;
		conn = getConnection();	// ����̹� �Ŵ����� ���Ͽ� ����Ŭ��, ������, �н����带 �Է��Ͽ� �����Ѵ�.
		String sql = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";	// sql�� �� �ۼ�
		
		// ���� �Ҵ�
		try {
			pstmt = conn.prepareStatement(sql);		// �����Ҵ翡�ٰ� << ����conn �����Ҵ� sql�� ���
			pstmt.setString(1, memberDTO.getName());	// sql ( ? ) �����ٰ� �����Ҵ�
			pstmt.setString(2, memberDTO.getId());
			pstmt.setString(3, memberDTO.getPwd());
			pstmt.setString(4, memberDTO.getGender());
			pstmt.setString(5, memberDTO.getEmail1());
			pstmt.setString(6, memberDTO.getEmail2());
			pstmt.setString(7, memberDTO.getTel1());
			pstmt.setString(8, memberDTO.getTel2());
			pstmt.setString(9, memberDTO.getTel3());
			pstmt.setString(10, memberDTO.getAddr());
			su = pstmt.executeUpdate();	// �����Ҵ��� ������ ������Ʈ �Ǿ����� Ȯ��
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return su;
	}
	// 4. SQL ������ DB���� ���� �˻��Ͽ� name ��ȯ ���
	public String login (String id, String pwd) {
		String name = null;
		conn = getConnection();
		String sql ="select*from member where id=? and pwd=? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {	// ������ ���� �ִٸ� �� �ҷ����Ŷ�. Generic ����
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return name;
	}
	// 5. ���̵� �ߺ�Ȯ���ϱ� 
	public boolean isExistId(String id) {
		boolean exist= false;
		conn = getConnection();
		String sql = "select*from member where id=?";
		
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
