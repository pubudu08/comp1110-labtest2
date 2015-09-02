package comp1110.labtest2;

/**
 * Created by Pubudu Dissanayake on 8/29/15.
 * Project : comp1110-labtest2
 */
public abstract class Shape {
    private double x;
    private double y;
    private double length;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract double perimeter();

    public abstract double area();

    public abstract boolean overlaps(Shape other);


    public static void main(String[] args) {
        Shape s1 = new Square(10);  // a square with sides of 10.0 units
        Shape s2 = new Circle(1.0);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
    }
}

class Square extends Shape {
    private double value;


    public Square(double length, double x, double y) {
        setX(x);
        setY(y);
        setLength(length);
    }

    public Square(double value) {
        this.value = value;
    }

    @Override
    public double perimeter() {
        return 4 * value;
    }

    @Override
    public double area() {
        return value * value;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Square) {
            double squareDistancex = Math.abs(other.getX() - this.getX());
            double squareDistancey = Math.abs(other.getY() - this.getY());

            if (squareDistancex > (this.getLength() / 2 + other.getLength() / 2)) {
                return false;
            }
            if (squareDistancey > (this.getLength() / 2 + other.getLength() / 2)) {
                return false;
            }

            if (squareDistancex <= (this.getLength() / 2)) {
                return true;
            }
            if (squareDistancey <= (this.getLength() / 2)) {
                return true;
            }
            double cornerDistance_sq = Math.pow((squareDistancex - this.getLength() / 2), 2.0) +
                    Math.pow((squareDistancey - this.getLength() / 2), 2.0);

            return (cornerDistance_sq <= Math.pow(other.getLength(), 2.0));

        } else {
            double circleDistancex = Math.abs(other.getX() - this.getX());
            double circleDistancey = Math.abs(other.getY() - this.getY());

            if (circleDistancex > (this.getLength() / 2 + other.getLength())) {
                return false;
            }
            if (circleDistancey > (this.getLength() / 2 + other.getLength())) {
                return false;
            }

            if (circleDistancex <= (this.getLength() / 2)) {
                return true;
            }
            if (circleDistancey <= (this.getLength() / 2)) {
                return true;
            }

            double cornerDistance_sq = Math.pow((circleDistancex - this.getLength() / 2), 2.0) +
                    Math.pow((circleDistancey - this.getLength() / 2), 2.0);

            return (cornerDistance_sq <= Math.pow(other.getLength(), 2.0));

        }
    }
}

    class Circle extends Shape {

        private double radius;

        public Circle(double length, double x, double y) {
            setX(x);
            setY(y);
            setLength(length);
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double area() {
            return Math.PI * (radius * radius);
        }

        @Override
        public boolean overlaps(Shape other) {
//        double distance = Math.sqrt(
//                (this.getX() - other.getX()) * (this.getX() - other.getX()) +
//                        (this.getY() - other.getY()) * (this.getY() - other.getY()));
//
//        return distance <= ( other.getLength()+ this.getLength());
            boolean overlap = false;
            if (other instanceof Circle) {
                double distance = Math.pow((Math.pow((this.getX() - other.getX()), 2.0)) + (Math.pow((this.getY() - other.getY()), 2.0)), 0.5);
                if (distance > (other.getLength() + this.getLength())) {
                    overlap = false;
                } else {
                    overlap = true;
                }
            } else {
                double circleDistancex = Math.abs(this.getX() - other.getX());
                double circleDistancey = Math.abs(this.getY() - other.getY());

                if (circleDistancex > (other.getLength() / 2 + this.getLength())) {
                    return false;
                }
                if (circleDistancey > (other.getLength() / 2 + this.getLength())) {
                    return false;
                }

                if (circleDistancex <= (other.getLength() / 2)) {
                    return true;
                }
                if (circleDistancey <= (other.getLength() / 2)) {
                    return true;
                }

                double cornerDistance_sq = Math.pow((circleDistancex - other.getLength() / 2), 2.0) +
                        Math.pow((circleDistancey - other.getLength() / 2), 2.0);

                return (cornerDistance_sq <= Math.pow(this.getLength(), 2.0));
            }
            return overlap;
        }
    }

