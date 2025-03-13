package chap08.src.sec02.verify.exam03;


public class DaoExample {
	public static void dbWork(chap08.src.sec02.verify.exam03.DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new chap08.src.sec02.verify.exam03.OracleDao());
		dbWork(new chap08.src.sec02.verify.exam03.MySqlDao());
	}
}

