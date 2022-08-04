package view;


import login.Login;
import storage.ReadWriteFile;
import system.RunByAdmin;



public class Client {
//    Login login = new Login();
    private static RunByAdmin admin = new RunByAdmin();
//    private static final String CART_OF_FILE = ProductUser.CART_MANAGEMENT;

    private static final ReadWriteFile readWriteFile = new ReadWriteFile();


//    private static  List<Products> getListProductOfUser = readWriteFile.readData(CART_OF_FILE);
    public static final String SUCCESSFUL_NEW_CREATION = "Thao tác thành công!! ";


    public static void main(String[] args) {
        Login login1 = new Login();
        login1.menuLogin();

    }


}









