//задаём класс для сладостей
class sweets {
    private String name;
    private double weight;
    private double price;
    private String description;
    //задаём конструктор с параметрами
    public sweets(String n, double w, double p, String d) {
        name = n;
        weight = w;
        price = p;
        description = d;
    }

    public double getWeight() {
        return weight;
    }

    public String showSpec() {
        return (name +" (" + description + "): " + weight*1000 + " г - " + price + " руб/кг");
    }
    public double howMuch(){
        return price*weight;
    }
}
public class sweetGift {
    public static void main(String[] args) {

        //создаём три объекта класса sweets
        sweets Candy = new sweets("Каракумы",0.25,300,"орехово-шоколадные конфеты");
        sweets Jelly = new sweets("Jellyworms",0.2,200,"разноцветное фруктовое желе");
        sweets Marshmallow = new sweets("Fluffies",0.15,600, "средние кусочки маршмэллоу");
        sweets[] Gift = new sweets[]{Candy, Jelly, Marshmallow};

        //общая стоимость и вес подарка
        double giftPrice = 0;
        double giftWeight = 0;
        for (sweets sw : Gift){
            giftWeight += sw.getWeight();
            giftPrice += sw.howMuch();
        }


        //вывод информации о подарке в консоль
        System.out.println("Общий вес подарка: "+ giftWeight*1000 + " г.");
        System.out.println("Стоимость подарка: "+giftPrice+" р.");
        System.out.println("Состав: ");
        for (sweets sw : Gift) {
            System.out.println(sw.showSpec());
        }
    }

}