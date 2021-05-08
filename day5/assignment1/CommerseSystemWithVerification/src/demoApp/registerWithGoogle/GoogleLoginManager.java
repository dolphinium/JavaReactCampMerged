package demoApp.registerWithGoogle;


import demoApp.entities.concretes.User;

public class GoogleLoginManager{
   void register(User user){
       System.out.println("Google hesabıyla başarılı bir şekilde kayıt olundu: "+user.getEmail());
   }
   void login(User user){
       System.out.println("Google hesabıyla başarılı bir şekilde oturum açıldı: "+user.getEmail());
   }

}
