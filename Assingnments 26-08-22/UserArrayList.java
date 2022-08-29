package collectionframework;

import java.util.ArrayList;

public class UserArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> userlist=new ArrayList<User>();
//		User u1=new User(101,"Nilanjan","kolkata");
//		User u2=new User(102,"Chayan","Midnapur");
//		User u3=new User(103,"Shawin","Darjeeling");
//		userlist.add(u1);
//		userlist.add(u2);
//		userlist.add(u3);
		//Annonymus object
		userlist.add(new User(101,"Nilanjan","kolkata"));
		userlist.add(new User(102,"Chayan","Midnapur"));
		userlist.add(new User(103,"Shawin","Darjeeling"));
		for(User u:userlist)
		{
			System.out.println("Id: "+u.getId());
			System.out.println("Name: "+u.getName());
			System.out.println("Address: "+u.getAddress());
		}
	}

}
