package a3assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Chatroom{
    private String name;
    private Set<String> username;
    private List<String> messages;
    public Chatroom(){
    	name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }
    
    public Chatroom(String name, Set<String> username, List<String> messages) {
		super();
		this.name = name;
		this.username = username;
		this.messages = messages;
		
	}

	public boolean removeUser(String username) {
		if(this.username.contains(username)) {
			this.username.remove(username);
			return true;
		}
    	return false;
    }
	public void addUsername(String name) {
		if(username.contains(name)) {
			System.out.println("Entered user already Exists! ");
		}else {
			username.add(name);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}

class User{

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    public User(){
    	
    }
	public User(String username, String password, String firstName, String lastName) {

		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
class ChatApplication{

    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {
    	
    	return chatrooms.containsKey(name);
    }

    public boolean isUsernameExists(String username) {
    	
    	return users.containsKey(username);
    	
    }

    public boolean authenticateUser(String username, String password) {
    	User usr = users.get(username);
    	if(usr != null) {
    	 if(usr.getPassword().equals(password)) {
    		return true;
    	}
    	}
    	return false;
    }

    //UI Methods Below
    public void createChatroom() {
    	Scanner scan = new Scanner(System.in);
    	String chatRoomName = "room1";
    	try {
    		System.out.println("Enter Chat room Name");
    		chatRoomName = scan.nextLine();
    		if(isChatroomNameValid(chatRoomName)) {
    			//TODO create and add new chat room to collections
    			//Create new Chatroom Instance and add to collection;
    			/*
    			 * public Chatroom(String name, Set<String> username, List<String> messages) {
					super();
					this.name = name;
					this.username = username;
					this.messages = messages;
				}*/
				/*Set<String> usr = new HashSet<String>();
    			System.out.println("Enter Users");
    			while(scan.hasNext()) {
    				String user = scan.nextLine();
    				///check user already exists or not
    				usr.add(user);
    			}
			   	Chatroom ch1 = new Chatroom();*/
    			
    		}else {
    			System.out.println("ChatRoom name already exists or Not Valid!");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		scan.close();
    	}
    }

    public void addNewUser() {
    	Scanner sc = new Scanner(System.in);
    	String uName = "";
    	try {
    		System.out.println("Enter user name");
    		uName = sc.nextLine();
    		if(isUsernameExists(uName)) {
    			System.out.println("User name Already exists");
    		}else {
    			//TODO Add new user to collection
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		
    	}
    	
    }

    public boolean login() {
    	//TODO: Login Work
    	return true;
    }

    public void sendMessage() {
    	
    }
    public void printMessages() {
    	
    }

    public void listUsersFromChatroom() {
    	//private Map<String, User> users = new HashMap<String, User>();
    	for(HashMap.Entry<String,User> entry : users.entrySet()) {
    		System.out.println(entry.getKey());
    	}
    }

    public void logout(){}

    public void deleteUser(){
    	//Take user name
    	//check user exists or not
    	//if found delete
    }

    public void deleteChatroom() {
    	//Take ChatroomName
    	//check if name exixts or not
    	//delete if exists
    }
    public void menu() {
    	System.out.println("> Java Chat Application");
    	System.out.println("A) Create chatroom");
    	System.out.println("B) Add the user");
    	System.out.println("C) User login");
    	System.out.println("D) Send a message");
    	System.out.println("E) Display the messages from a specific chatroom");
    	System.out.println("F) List down all users belonging to the specified chat room.");
    	System.out.println("G) Logout");
    	System.out.println("H) Delete an user");
    	System.out.println("I) Delete the chat room.");
    	System.out.println("Please enter your option:");
    	Scanner scan = new Scanner(System.in);
    	String ch = "";
    	try {
    		ch = scan.next();
    		ch = ch.toUpperCase();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		scan.close();
    	}
    	switch(ch) {
    	case "A":
    		createChatroom();
    		break;
    	case "B":
    		addNewUser();
    		break;
    	case "C":
    		login();
    		break;
    	case "D":
    		sendMessage();
    		break;
    	case "E":
    		printMessages();
    		break;
    	case "F":
    		listUsersFromChatroom();
    		break;
    	case "G":
    		logout();
    		break;
    	case "H":
    		deleteUser();
    		break;
    	case "I":
    		deleteChatroom();
    		break;
    	default:
    		System.out.println("Inavalid choice!");
    		break;
    	}
    	
    }
}

public class Assignment3Q6{
    public static void main(String[] args){
    	ChatApplication obj = new ChatApplication();
    	//obj.menu();
    	System.out.println(obj.authenticateUser("Hashmi", "PassMeAao"));
    }
}