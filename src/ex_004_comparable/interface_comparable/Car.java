package ex_004_comparable.interface_comparable;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене/модель/цвет
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int tempSpeed = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (tempSpeed == 0) {
            int tempPrice = this.price - ((Car)o).price;
            if (tempPrice == 0) {
                int tempModel = this.model.compareTo(((Car)o).model);
                if (tempModel == 0) {
                    return this.color.compareTo(((Car)o).color);
                }
                else return tempModel;
            }
            else return tempPrice;
        }
        else return tempSpeed;

    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}