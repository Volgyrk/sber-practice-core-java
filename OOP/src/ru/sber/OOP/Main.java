package ru.sber.OOP;

// Класс Phone
class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String[] phoneNumbers) {
        System.out.print("Отправка сообщения на номера: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.print(phoneNumber + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

// Класс Circle
class Circles {
    private double radius;
    private String color;

    public Circles(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}

// Класс Matrix
class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];
    }

    public void setValue(int i, int j, double value) {
        if (i >= 0 && i < rows && j >= 0 && j < cols) {
            matrix[i][j] = value;
        } else {
            System.out.println("Неверные индексы элемента.");
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Нельзя сложить матрицы разного размера.");
            return null;
        }

        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }

        return result;
    }

    public void multiplyByNumber(double number) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] *= number;
            }
        }
    }

    public void print() {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}

// Класс Book
class Author {
    private String name;
    private String gender;
    private String email;

    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return "Author: " + name + " (" + gender + ")";
    }
}

class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return "Book: " + title + ", " + author + ", " + year;
    }
}

// Enum для размеров пиццы
enum PizzaSize {
    SMALL, MEDIUM, BIG
}

// Класс PizzaOrder
class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean sauceNeeded;
    private String deliveryAddress;
    private boolean orderAccepted;

    public PizzaOrder(String name, PizzaSize size, boolean sauceNeeded, String deliveryAddress) {
        this.name = name;
        this.size = size;
        this.sauceNeeded = sauceNeeded;
        this.deliveryAddress = deliveryAddress;
        this.orderAccepted = false;
    }

    public void order() {
        if (!orderAccepted) {
            System.out.println("Заказ принят. " + size + " пицца \"" + name + "\""
                    + (sauceNeeded ? " с соусом" : " без соуса") + " на адрес " + deliveryAddress + ".");
            orderAccepted = true;
        } else {
            System.out.println("Заказ уже принят.");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            System.out.println("Заказ отменен.");
            orderAccepted = false;
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public boolean isSauceNeeded() {
        return sauceNeeded;
    }

    public void setSauceNeeded(boolean sauceNeeded) {
        this.sauceNeeded = sauceNeeded;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public boolean isOrderAccepted() {
        return orderAccepted;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "PizzaOrder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", sauceNeeded=" + sauceNeeded +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderAccepted=" + orderAccepted +
                '}';
    }
}

// Класс с методом main
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("12345", "Samsung", 0.3);
        phone1.receiveCall("John");
        phone1.receiveCall("Alice", "67890");

        System.out.println("Номер телефона: " + phone1.getNumber());

        String[] phoneNumbers = {"11111", "22222", "33333"};
        phone1.sendMessage(phoneNumbers);

        System.out.println(phone1);

        Circles circle1 = new Circles(5.0, "Red");
        System.out.println(circle1);

        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setValue(0, 0, 1);
        matrix1.setValue(0, 1, 2);
        matrix1.setValue(1, 0, 3);
        matrix1.setValue(1, 1, 4);

        System.out.println("Matrix 1:");
        matrix1.print();

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(0, 0, 5);
        matrix2.setValue(0, 1, 6);
        matrix2.setValue(1, 0, 7);
        matrix2.setValue(1, 1, 8);

        System.out.println("\nMatrix 2:");
        matrix2.print();

        Matrix result = matrix1.add(matrix2);

        if (result != null) {
            System.out.println("\nMatrix Sum:");
            result.print();
        }

        Book book1 = new Book("Java Programming", new Author("John Smith", "Male", "john@example.com"), 2022);
        System.out.println("\nBook info:");
        System.out.println(book1);


        PizzaOrder order1 = new PizzaOrder("Аль-Капчоне", PizzaSize.BIG, true, "Ярославская 101");
        order1.order(); // Выведет информацию о заказе
        order1.order(); // Выведет, что заказ уже принят
        order1.cancel(); // Отменит заказ

        PizzaOrder order2 = new PizzaOrder("Маргарита", PizzaSize.SMALL, false, "Московский проспект 5");
        order2.order(); // Выведет информацию о заказе


    }
}

// Класс Point
class Point {
    int x;
    int y;

    // конструктор
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Абстрактный класс Figure
abstract class Figure {
    Point point;

    // абстрактные методы для вычисления площади и периметра фигуры
    abstract double area();
    abstract double perimeter();
}

// Класс Круг
class Circle extends Figure implements Drawable {
    double radius;

    // методы area() и perimeter() реализованы здесь
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    // методы интерфейса Drawable
    @Override
    public void draw() {
        System.out.println("Нарисован круг с координатами (" + point.x + ", " + point.y + ")");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован круг с цветом " + color + " и координатами (" + point.x + ", " + point.y + ")");
    }
}


// Enum Color
enum Color {
    RED, BLUE, GREEN, YELLOW, BLACK
}

// Интерфейс Drawable
interface Drawable {
    void draw();
    void draw(Color color);
}

// Класс FigureUtil
class FigureUtil {
    private FigureUtil() {
        // приватный конструктор
    }

    // статические методы для вычисления площади и периметра фигуры
    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    // статические методы для рисования фигур
    public static void draw(Drawable figure) {
        figure.draw();
    }

    public static void draw(Drawable figure, Color color) {
        figure.draw(color);
    }
}

// Класс PaintExample
class PaintExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.point = new Point(0, 0);
        circle.radius = 5;

        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.RED);
    }
}