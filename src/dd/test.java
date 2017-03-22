package dd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test extends DBpool {
	public static void main(String[] args) throws SQLException{
		new test().t();
	}
	public  void t() throws SQLException{
		conn=getConn();
		String sql="select * from student";
		PreparedStatement ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next())
			System.out.println(rs.getString("stuId"));
	}
}
