package model.dao.BoareDao;


public class ddao extends Dao{
	
	private static ddao o = new ddao();
	public static ddao getInstance() { return o;}

	public boolean write( String btitle , String bcontent , String bwriter , String bpassword) {
		String sql = "insert into board ( btitle , bcontent ,bwriter ,bpassword ) values( ? , ? , ? , ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bcontent);
			ps.setString(3, bwriter);
			ps.setString(4, bpassword);
			ps.execute();
			return true;
		} catch (Exception e) {System.out.println(e); return false;}
	}
	
}
