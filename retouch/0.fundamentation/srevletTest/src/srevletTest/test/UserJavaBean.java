package srevletTest.test;

public class UserJavaBean {
		private String username;
		private String password;
		public UserJavaBean(){}
		public UserJavaBean(String username,String password){
			this.username = username;
			this.password = password;
		}
		public String getUsername(){
			return this.username;
		}
		public void setUsername(String name){
			this.username = name;
		}		
		public String getPassword(){
			return this.password;
		}
		public void setPassword(String password){
			this.password = password;
		}
				
}
