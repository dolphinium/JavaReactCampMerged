public class UserManager  {

    public void addUser(User user){
        System.out.println(user.getUsername()+" sisteme başarılı bir şekilde kaydolmuştur!");
    }
    public void deleteUser(User user){
        System.out.println(user.getUsername()+" sistemden başarılı bir şekilde silinmiştir!");

    }

    public void addMultipleUser(User [] user){
        for(User users : user){
            addUser(users);
        }

    }

}
