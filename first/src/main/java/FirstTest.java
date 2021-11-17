import test.ship.StarShip;

public class FirstTest {
    public static void main(String[] args) {
        System.out.println("We are here! Hello!");

        System.out.println(8 + 2);
        System.out.println(8 - 2);
        System.out.println(8 * 2);
        System.out.println(8 / 3);

        System.out.println(8.0 / 3);

        int side = 7;
        System.out.println("Площадь квадрата со стороной " + side + " = " + (side * side));

        double s = 7.45;
        String text = "Площадь квадрата со стороной ";
        System.out.println(text + s + " = " + (s * s));
        helloTest();
        helloTest("username");
        System.out.println(helloTest("Значение 1","Зачение 2"));

        //создаю экземпляр класса корабля
        StarShip ship = new StarShip(253.25);
        displayHeight (ship);

    }

    /*демо методов*/
    //1 метод без параметров
    public static void helloTest() {
        System.out.println("We are here! Hello!");
    }

    //2 метод с параметром
    public static void helloTest(String text) {
        System.out.println("We are here! Hello! "+ text);
    }

    //3 метод с возвратом значения
    public static String helloTest(String value1, String value2) {
        return "We are here! Hello! "+ value1 +" , "+ value2;
    }
    public static void displayHeight (StarShip ship) {
        System.out.println("Высота корабля составляет : "+ ship.getShipHeight());
    }

}

