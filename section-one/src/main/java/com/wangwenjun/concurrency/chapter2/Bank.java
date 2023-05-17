package com.wangwenjun.concurrency.chapter2;

/***************************************
 * @author:Alex Wang
 * @Date:2017/2/15 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class Bank {
    public static void main(String[] args) {



        com.wangwenjun.concurrency.chapter2.TicketWindow ticketWindow1 = new com.wangwenjun.concurrency.chapter2.TicketWindow("一号柜台");
        ticketWindow1.start();

        com.wangwenjun.concurrency.chapter2.TicketWindow ticketWindow2 = new com.wangwenjun.concurrency.chapter2.TicketWindow("二号柜台");
        ticketWindow2.start();

        com.wangwenjun.concurrency.chapter2.TicketWindow ticketWindow3 = new com.wangwenjun.concurrency.chapter2.TicketWindow("三号柜台");
        ticketWindow3.start();

    }
}
