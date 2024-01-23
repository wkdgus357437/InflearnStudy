package hello.jdbc.connection;

public abstract class ConnectionConst {

	//어느 DB에 연결하는지 확인하기 지금은 h2 db 사용중

	public static final String URL = "jdbc:h2:tcp://localhost/~/test";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "";
}
