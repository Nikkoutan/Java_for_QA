//задаём класс для сладостей
class sweets {
    String name;
    double weight;
    double price;
    String description;
    //задаём конструктор с параметрами
    sweets(String n, double w, double p, String d) {
        name = n;
        weight = w;
        price = p;
        description = d;
    }
}
public class sweetGift {
    public static void main(String[] args) {

        //создаём три объекта класса sweets
        sweets Candy = new sweets("Каракумы",0.25,300,"орехово-шоколадные конфеты");
        sweets Jelly = new sweets("Jellyworms",0.2,200,"разноцветное фруктовое желе");
        sweets Marshmallow = new sweets("Fluffies",0.15,600, "средние кусочки маршмэллоу");

        //общая стоимость и вес подарка
        double giftPrice = Candy.price* Candy.weight + Jelly.price* Jelly.weight+ Marshmallow.price* Marshmallow.weight;
        double giftWeight = Candy.weight+ Jelly.weight+ Marshmallow.weight;

        //вывод информации о подарке в консоль
        System.out.println("Общий вес подарка: "+ giftWeight*1000 + " г.");
        System.out.println("Стоимость подарка: "+giftPrice+" р.");
        System.out.println("Состав: ");
        System.out.println(Candy.name +" (" + Candy.description + "): " + Candy.weight*1000 + " г - " + Candy.price + " руб/кг");
        System.out.println(Jelly.name +" (" + Jelly.description + "): " + Jelly.weight*1000 + " г - " + Jelly.price + " руб/кг");
        System.out.println(Marshmallow.name +" (" + Marshmallow.description + "): " + Marshmallow.weight*1000 + " г - " + Marshmallow.price + " руб/кг");
    }

}