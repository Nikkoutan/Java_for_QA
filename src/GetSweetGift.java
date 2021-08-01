import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//задаём класс для сладостей
class Sweets {
    String name;
    double weight;
    double price;

    //задаём конструктор с параметрами
    public Sweets(String n, double w, double p) {
        name = n;
        weight = w;
        price = p;
    }

    public double getWeight() {
        return weight;
    }

    public String showSpec() {
        return (name + weight*1000 + " г - " + price + " руб/кг");
    }
    public double howMuch(){
        return price*weight;
    }
}

class Candy extends Sweets {
    private int amountInPack;

    public Candy(String n, double w, double p, int amountInPack) {
        super(n, w, p);
        this.amountInPack = amountInPack;
    }

    public String showSpec() {
        return (name + " " + weight*1000 + " г (" + amountInPack+ " шт. в пакетике) - " + price + " руб/кг");
    }
}

class Jelly extends Sweets {
    private String colour;

    public Jelly(String n, double w, double p, String colour) {
        super(n, w, p);
        this.colour = colour;
    }

    public String showSpec() {
        return (name + "(" + colour + ") " + weight*1000 + " г - " + price + " руб/кг");
    }
}

class Marshmallow extends Sweets {
    private String size;

    public Marshmallow(String n, double w, double p, String size) {
        super(n, w, p);
        this.size = size;
    }
    public String showSpec() {
        return (name + "(" + size + " кусочки) " + weight * 1000 + " г - " + price + " руб/кг");
    }
}

class SweetGift {
    Sweets[] gift;

     public SweetGift(Sweets a, Sweets b, Sweets c) {
        this.gift = new Sweets[]{a, b, c};
    }

    public void printGiftSpec() {
        double giftPrice = 0;
        double giftWeight = 0;
        for (Sweets sw : gift){
            giftWeight += sw.getWeight();
            giftPrice += sw.howMuch();
        }
        System.out.println("Общий вес подарка: "+ giftWeight*1000 + " г.");
        System.out.println("Стоимость подарка: "+giftPrice+" р.");
        System.out.println("Состав: ");
        for (Sweets sw : gift) {
            System.out.println(sw.showSpec());
        }
    }
}

public class GetSweetGift {
    public static void main(String[] args) {
        Sweets candy = new Candy("Леденцы",0.25,300, 10);
        Sweets jelly = new Jelly("Jellyworms",0.2,200,"зелёные");
        Sweets marshmallow = new Marshmallow("Fluffies",0.15,600, "средние");

        SweetGift gift1 = new SweetGift(candy, jelly, marshmallow);
         gift1.printGiftSpec();

    }

}