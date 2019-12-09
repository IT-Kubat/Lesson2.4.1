package com.company;

public class Main {


    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);

        System.out.println("Запуск потока -" + Thread.currentThread().getName());
        try{
            for (int i = 1; i <=5; i++) {
                MyThread myth = new MyThread("Поток" + i);
                myth.start();
                myth.setPriority(i);
                myth.join();
            }
        }catch (Exception e){

        }

        System.out.println("Завершение потока -" + Thread.currentThread().getName());
    }

}
