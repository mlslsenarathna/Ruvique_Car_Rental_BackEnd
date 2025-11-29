package ecom.mlslsenarathna.service;



public interface PasswordService {
   String hashPassword(String plainPassword);
   boolean checkPassword(String plainPassword, String storedHash);

}
