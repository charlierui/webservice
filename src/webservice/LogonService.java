package webservice;

public class LogonService {
	public String checkUserRight(String userId, String password) {
		// 假设进行数据库操作
		if (password != null && "fred".equals(userId)) {
			System.out.println("success");
			return "success";
		}
		return "fali";
	}
	
	public static void main(String[] args) {
		
	}
}
