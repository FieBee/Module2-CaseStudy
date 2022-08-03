package view;


import storage.ReadWriteFile;
import system.RunByAdmin;



public class Client {
    private static RunByAdmin admin = new RunByAdmin();
//    private static final String CART_OF_FILE = ProductUser.CART_MANAGEMENT;

    private static final ReadWriteFile readWriteFile = new ReadWriteFile();


//    private static  List<Products> getListProductOfUser = readWriteFile.readData(CART_OF_FILE);
    public static final String SUCCESSFUL_NEW_CREATION = "Thao tác thành công!! ";


    public static void main(String[] args) {
        admin.menuManager();

    }


}









