package edu.gatech.hongbao;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        QunZhu q = new QunZhu("Manager", 100);

        NormalUser a = new NormalUser("userA", 0);
        NormalUser b = new NormalUser("userB", 0);
        NormalUser c = new NormalUser("userD", 0);

        q.show();
        a.show();
        b.show();
        c.show();
        System.out.println("=====================");

        ArrayList<Integer> sendM = q.sendHongBao(20, 3);
        a.receiveHongBao(sendM);
        b.receiveHongBao(sendM);
        c.receiveHongBao(sendM);

        q.show();
        a.show();
        b.show();
        c.show();
        System.out.println("=====================");


    }
}
