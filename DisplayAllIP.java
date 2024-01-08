
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DisplayAllIP {
    public static void main(String[] args) {
        try{
            //lay ve tat ca cac interface cua may
            Enumeration<NetworkInterface> netInterface = NetworkInterface.getNetworkInterfaces();
            //duyet qua tung giao dien
            while(netInterface.hasMoreElements()){
            NetworkInterface networkInterface = netInterface.nextElement();
            //lay danh sach dia chi ip cua cac giao dien mang
            Enumeration<InetAddress> inetAdress = networkInterface.getInetAddresses();
            //duyet qua tung dia chi IP va in ra man hinh
            while(inetAdress.hasMoreElements()){
                InetAddress address = inetAdress.nextElement();
                System.out.println("Interface:"+networkInterface.getName()+"; Dia chi IP:"+address.getHostAddress());
            }
        }
        }catch(Exception e){
            
        }
    }
}
