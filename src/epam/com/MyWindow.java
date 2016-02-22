package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;


    public void printFields(){
        System.out.println(getWidth()+" "+ getHeight()+" "+getNumberOfGlass()+" "+getColor()+" "+getIsOpen());

    }
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;

    }

    public MyWindow(double width) {
        this(width,5,2,"White",false);

    }

    public MyWindow(double width,double height, int numberOfGlass) {
        this(width,height,numberOfGlass,"Yellow",true);

    }



    public MyWindow(double width, double height) {
        this(width,height,10,"gold",false);

    }



    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsOpen() {
        return isOpen;
    }
}
