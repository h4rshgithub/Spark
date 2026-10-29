import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String , User> userMap = new HashMap<>();
    private User currentUser = null;


    public boolean registerUser(String username , String password , String fullName , String contact ){
        if(userMap.containsKey(username)){
            System.out.println("Username already taken , please choose other");
            return false;
        }
        User user = new User(username , password , fullName , contact);
        userMap.put(username , user);
        System.out.println(" User "+ username + " registered successfully :)");
        return true;
    }
    public boolean loginUser(String username , String password){
        if(!userMap.get(username).getPassword().equals(password)){
            System.out.println("Password is Incorrect");
            return false;
        }
        if(!userMap.containsKey(username)){
            System.out.println("Login Failed "+ userMap.get(username).getFullname() + " does not registered ");
            return false;
        }
        currentUser = userMap.get(username);
        System.out.println("Login successfully , Welcome "+ currentUser.getFullname());
        return false;
    }
    public void  logoutUser(){
        if(currentUser!= null){
            System.out.println("Logged Out " + currentUser.getFullname()+  " Successfully ");

        }
        currentUser = null;

    }
    public boolean  forgetPassword(String username , String contact){
        currentUser = userMap.get(username);
        if(currentUser.getContact().equals(contact)){
            System.out.println("Password for "+ currentUser.getUsername()+ " is " + currentUser.getPassword());
            return true;
        }
        return false;

    }

    public User getCurrentUser(){
        return currentUser;
    }
    public boolean isLogin(){
        return currentUser != null;

    }
}