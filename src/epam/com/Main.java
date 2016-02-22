package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args) {


        MyWindow window1 = new MyWindow(1.5,1.5,5,"White",false);
        MyWindow window2 = new MyWindow(2.5,2.2,2,"Black",true);
        MyWindow window3 = new MyWindow(3.5,3.3,3,"Red",true);
        MyWindow window4 = new MyWindow(1.3,4.45,5,"Yellow",false);
        MyWindow window5 = new MyWindow(4.5,4.4,10,"White_Black",false);
        MyWindow window6 = new MyWindow(2.5);
        MyWindow window7 = new MyWindow(5.5,2.5,52);
        MyWindow window8 = new MyWindow(10.5,10.5);

        window8.printFields();

    }
}
