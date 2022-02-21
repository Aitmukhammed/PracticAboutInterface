package com.company;
//import Intefaces2.ByTwos;
import Intefaces2.*;
import Interface5.Series2;
import Interfaces3.MyIfImp;
import Practic.Alpha;
import Practic.Interface6;
import bookpack.Book;
import Interfaces.*;
import Interface5.*;
import sIf.*;



import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String args[])
            throws java.io.IOException {
        Integer esep = new Integer();

//        esep.intE1();
//        esep.intE2();
//        esep.intE3();
//        esep.intE4();
//        esep.intE5();
//        esep.intE6();
//        esep.intE7();
//        esep.intE8();
//        esep.intE9();
//        esep.intE10();
//        esep.intE11();
//        esep.intE12();
//        esep.intE13();
//        esep.intE14();
//        esep.intE15();
//        esep.intE16();
//        esep.intE17();
//        esep.intE18();
//        esep.intE19();
//        esep.intE20();
//        esep.intE21();
//        esep.intE21();
//        esep.intE23();
//        esep.intE24();
//        esep.intE25();

        Interface6 IF6 = new Interface6();
        System.out.println("Beta: "+ IF6.getAteb());
        System.out.println("Alpha: "+IF6.showAlpha());

        System.out.println();

        System.out.println("Повторение массива");
        int number = 10;                  //[10]                 Примитивный тип данных
        int numbers[] = new int[5];       //numbers -> [massiv]  Ссылочный тип данных

        for (int i=0; i<numbers.length; i++){
            numbers[i]=i*10;
        }
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println();

        int uId = staticIf.getUniversal();
        System.out.println(uId);

        System.out.println();

        MyIfImp obj = new MyIfImp();
        System.out.println("Идентификатор пользователя: "+obj.getUserId());
        System.out.println("Идентификатор администратора: "+obj.getAdminId());

        ByTwos ob = new ByTwos();
        for (int i=0; i<5; i++)
            System.out.println("Следующее значение: "+ob.getNext());
        System.out.println("\nсброс");
        ob.reset();

        for (int i=0; i<5; i++)
            System.out.println("Следующее значение: "+ob.getNext());

        System.out.println("\n Начальное значение: 110");
        ob.setStart(110);
        for(int i=0; i<5; i++)
            System.out.println("След знач: "+ob.getNext());




        System.out.println();
        System.out.println();
        System.out.println();





        ByThrees ob2 = new ByThrees();
        for (int i=0; i<5; i++)
            System.out.println("Следующее значение: "+ob2.getNext());
        System.out.println("\nсброс");
        ob.reset();

        for (int i=0; i<5; i++)
            System.out.println("Следующее значение: "+ob2.getNext());

        System.out.println("\n Начальное значение: 30");
        ob.setStart(30);
        for(int i=0; i<5; i++)
            System.out.println("След знач: "+ob2.getNext());

        Person person1 = new Person("Bob");
        Animal animal1 = new Animal(5);
        person1.showInfo();
        animal1.showInfo();

        System.out.println();
        System.out.println();




//        Book books[] = new Book[5];
//        books[0] = new Book("Java: руководство для начинающих, 7-е издание ", "Герберт Шилдт ", 2018);
//        books[1] = new Book(" Java: полное руководство, 10-е издание ", " Герберт Шилдт ", 2018);
//        books[2] = new Book(" Искусство программирования на Java ", "Герберт Шилдт ", 2005);
//        books[3] = new Book(" Красный шторм поднимается ", " Том Клэнси ", 2006) ;
//        books[4] = new Book(" B дороге ", " Джек Керуак" , 2012);
//
//        for(int i=0; i< books.length; i++) books[i].show();


    }
        }