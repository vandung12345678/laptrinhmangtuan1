/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laptrinhmang_bai1;

import java.net.InetAddress;

/**
 *
 * @author Admin
 */
public class LapTrinhMang_Bai1 {

    public static void main(String[] args) {
        try{
            // lay dia chi IP cua mot trang wweb
            InetAddress inet = InetAddress.getByName("www.youtube.com");
            //thu ket noi trong thoi gian 5s
            boolean lsKN=inet.isReachable(5000);
            //in ra thong bao
            if(lsKN){
                System.out.println("co Internet");
            }else{
                 System.out.println("khong ket noi duoc voi  Internet");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
