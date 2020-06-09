package edu.gatech.hongbao;

import java.util.ArrayList;
import java.util.Random;

public class NormalUser extends User{

    public NormalUser() {
    }

    public NormalUser(String name, int balance) {
        super(name, balance);
    }

    public void receiveHongBao(ArrayList<Integer> list){

        //random get money from list
        Random r = new Random();
        int index = r.nextInt(list.size());//range 0 --- size-1;
        int received = list.remove(index);
        this.setBalance(received+this.getBalance());
    }

}
