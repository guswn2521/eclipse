package chap14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//SQL
	private final String MEMBER_INSERT = "insert into member(age,name, tel, email,nation) values(?,?,?,?,?)";
	private final String MEMBER_UPDATE = "update member set age =?,tel =?,email =?,nation =? where idx = ?";
	private final String MEMBER_DELETE = "delete from member where idx =?";
	private final String MEMBER_GET = "select idx,age,name, tel,email,nation,regdate from member where idx = ?";
	private final String MEMBER_LIST = "select idx,age,name, tel,email,nation,regdate from member order by regdate desc";
	private final String MEMBER_SEARCH = "select idx,age,name, tel,email,nation,regdate from member where name like ? order by regdate desc";
	
	ArrayList<MemberVO> getMemberList() {
		System.out.println("getemberList()");
		MemberVO member = null;
		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		
		
		conn = JdbcUtil.getConnection();
		System.out.println("connection ok");
		
		try {
			pstmt = conn.prepareStatement(MEMBER_LIST);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int idx = rs.getInt("idx");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String nation= rs.getString("nation");
				String regdate = rs.getString("regdate");
				member = new MemberVO(idx, age, name, tel, email, nation, regdate);
				System.out.println(member);
				memberList.add(member);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs,pstmt,conn);
		}
		
		
		return memberList;
		
	}
	
	
	MemberVO getMember(int idx) {
		System.out.println("getmember()");
		MemberVO member = null;
		
		conn = JdbcUtil.getConnection();
		System.out.println("connection ok");
		
		try {
			pstmt = conn.prepareStatement(MEMBER_GET);
			pstmt.setInt(1, idx);  //?순서 1부터
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String nation= rs.getString("nation");
				String regdate = rs.getString("regdate");
				
				member = new MemberVO(idx, age, name, tel, email, nation, regdate);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(rs,pstmt,conn);
		}
		
		return member;
	}
	
	
	void insertMember(MemberVO member) {
		System.out.println("insertmember()");
		
		conn = JdbcUtil.getConnection();
		System.out.println("connection ok");
		
		try {
			pstmt = conn.prepareStatement(MEMBER_INSERT);
			//age,name, tel, email,nation
			pstmt.setInt(1, member.getAge());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getTel());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getNation());
			int rs = pstmt.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(pstmt,conn);
		}
		
	}
	
	
	//1명 회원정보수정
	void updateMember(MemberVO member) {
		System.out.println("updatemember()");
		
		conn = JdbcUtil.getConnection();
		System.out.println("connection ok");
		
		try {
			pstmt = conn.prepareStatement(MEMBER_UPDATE);
			//age,name, tel, email,nation
			pstmt.setInt(1, member.getAge());
			pstmt.setString(2, member.getTel());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getNation());
			pstmt.setInt(5, member.getIdx());
			int rs = pstmt.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(pstmt,conn);
		}
		
	}
	
	
	void deleteMember(int idx) {
		System.out.println("deletemember()");
		
		conn = JdbcUtil.getConnection();
		System.out.println("connection ok");
		
		try {
			pstmt = conn.prepareStatement(MEMBER_DELETE);
			pstmt.setInt(1,idx);
			int rs = pstmt.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(pstmt,conn);
		}
		
	}
	
	
	ArrayList<MemberVO> getMemberSearch(String sname) {
		System.out.println("getemberSearch()");
		MemberVO member = null;
		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		
		conn = JdbcUtil.getConnection();
		System.out.println("connection ok");
		
		try {
			sname = "%"+sname+"%";
			pstmt = conn.prepareStatement(MEMBER_SEARCH);
			pstmt.setString(1, sname);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int idx = rs.getInt("idx");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String nation= rs.getString("nation");
				String regdate = rs.getString("regdate");
				member = new MemberVO(idx, age, name, tel, email, nation, regdate);
				System.out.println(member);
				memberList.add(member);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs,pstmt,conn);
		}
		
		
		return memberList;
		
	}
	
	
	
	
	
	
	
}
