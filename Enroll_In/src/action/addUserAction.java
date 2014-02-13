package action;

import java.util.List;
import action.AutoArrayList;
import action.User;

public class addUserAction {
	
	private List users = new AutoArrayList(User.class,5);
	
	public String execute() throws Exception{
		User user;
		
		for (int i=0; i<users.size();i++)      
		{      
			user = (User)users.get(i);  
		    
		   
		    
		  
		}      		
	
		return "success";
	}


	public void setUsers(List users) {
		this.users = users;
	}


	public List getUsers() {
		return users;
	}


}
