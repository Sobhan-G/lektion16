class CarDemo {
    public static void main(String[] args) {

        class Car {


            int year;
            String model;
            int price;
            int hp;
        }
        Car car1;
        car1 = new Car();
        System.out.println(car1);
        Car car2 = new Car();
        System.out.println(car2);
        Car car3;
        car3 = new Car();

        car1.model = "tesla1";
        car1.price = 350000;
        car1.year = 2020;
        car1.hp = 300;


        car2.model = "tesla2";
        car2.price = 250000;
        car2.year = 2020;
        car2.hp= 450;

        car3.model = "tesla";
        car3.price = 500000;
        car3.year = 2020;
        car3.hp = 700;

        System.out.println(car1.model + " kostar " + car1.price + "kr");
        System.out.printf("%s kostar %,d kr \n", car1.model , car1.price+ car1.hp);

        System.out.println(car2.model + " kostar " + car2.price + "kr");
        System.out.printf("%s kostar %,d kr \n", car2.model , car2.price+ car2.hp);

        System.out.println(car3.model + " kostar " + car3.price + "kr");
        System.out.printf("%s kostar %,d kr \n", car3.model , car3.price+ car3.hp);


    }
}