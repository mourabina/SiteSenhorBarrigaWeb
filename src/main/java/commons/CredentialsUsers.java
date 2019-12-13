package commons;

import configuration.AccountCredentialsUsers;

public enum CredentialsUsers implements AccountCredentialsUsers {


	USER_WEB_SNF_QA {

		@Override
		public String user(String usuario) {
			
			return usuario;
		}

		@Override
		public String password() {
			return ",-RE6M|u1(8%gCp2_R;jwOH}yW|a0";
		}
		
	},
	
	USER_WEB_SAD_QA {

		@Override
		public String user(String usuario) {
			
			return usuario;
		}

		@Override
		public String password() {
			return "111111";
		}
		
	},

}
