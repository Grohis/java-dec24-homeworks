package ru.otus.java.basic.homeworks;

public class Box {
    private final int width;
    private final int height;
    private boolean status;
    private String color;
    private String item;


    public int getWidth() { return width;}
    public int getHeight() {return height;}
    public boolean isStatus() {return status;}
    public String getColor() {return color;}
    public String getItem() {return item;}


    public Box(int width, int height,String color){
        this.width = width;
        this.height = height;
        this.color = color;
        this.status = false;
        this.item = null;
    }

    public void open(){
        if(!status){
            status = true;
            System.out.println("Коробка открыта.");
            return;
        }
        System.out.println("Коробка уже открыта.");
    }

    public void close(){
        if(status){
            status = false;
            System.out.println("Коробка закрыта.");
            return;
        }
        System.out.println("Коробка уже закрыта.");
    }

    public void paint(String newColor){
        this.color = newColor;
        System.out.println("Коробка перекрашена в " + newColor + " цвет.");
    }

    public void putItem(String newItem){
        if(!status){
            System.out.println("Коробка закрыта, нельзя положить в нее предмет.");
            System.out.println("Попробуй сначала открыть коробку.");
            return;
        }
        if(item == null){
            item = newItem;
            System.out.println("Предмет " + newItem + " положен в коробку.");
            return;
        }
        System.out.println("В коробке уже есть предмет.");
    }

    public void removeItem(){
        if(!status){
            System.out.println("Коробка закрыта, нельзя положить в нее предмет.");
            System.out.println("Попробуй сначала открыть коробку.");
            return;
        }
        if(item != null){
            System.out.println("Предмет " + item + " вынут из коробки.");
            item = null;
            return;
        }
        System.out.println("Коробка пустая.");
    }

    public void printInfo(){

        System.out.println("Коробка: размер " + width + "x" + height  + " , цвет  " + color + ", " + ( status ? "открыта" : "закрыта"));
        System.out.println(item != null ? "В коробке лежит: " + item + " ." : "Коробка пустая.");
    }
}
