package edu.gatech.hongbao;

import java.util.ArrayList;

public class QunZhu extends User{

    public QunZhu() {
    }

    public QunZhu(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> sendHongBao(int money, int count){
        ArrayList<Integer> result = new ArrayList<>();
        //check if have enough balance to sent money
        if (this.getBalance() < money) return result;


        this.setBalance(this.getBalance() - money);
        for (int i = 1; i <= count - 1; i++) {
            result.add(money/count);
        }

        //put rest remainder to the last hongbao
        int last = money/count + (money%count);
        result.add(last);


        return result;

    }
}
