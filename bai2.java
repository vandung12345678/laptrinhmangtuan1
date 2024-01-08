
import java.net.InetAddress;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class bai2 {
    public static void main(String[] args) {
        
    //lay dia chi IP cua mot may chu
    try{
    // lay dia chi IP cua motj trang wweb
            InetAddress inet = InetAddress.getByName("www.youtube.com");
            //in ra dia chi IP
            System.out.println("dia chi ip cua tang web www.youtube.com"+inet.getHostAddress());
}catch(Exception e){
    e.printStackTrace();
}
}
}