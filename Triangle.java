package trianglesmain;

public class Triangle {

    private int size = 10;
    private char symbol = '*';
    private String triangleString = "";

    public void setSize(int s) {
        if (s <= 0) {
            size = 10;
        } else if (s > 50) {
            size = 10;
        } else {
            size = s;
        }
    }

    public void setChar(char c) {
        if (c == ' ') {
            symbol = '*';
        } else {
            symbol = c;
        }
    }

    public Triangle(int s, char c) {
        size = s;
        symbol = c;
        System.out.println("\n");
    }

    public Triangle(int s) {
        size = s;
        symbol = '*';
        System.out.println("\n");
    }

    public Triangle(char c) {
        symbol = c;
        size = 10;
        System.out.println("\n");
    }

    public Triangle() {
        size = 10;
        symbol = '*';
        System.out.println("\n");
    }

    public void displaySolidLL() {

        for (int i = 0; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                triangleString += symbol;
            }
            triangleString += "\n";
        }
        System.out.println(triangleString);
        triangleString = "";
    }

    public void displaySolidLR() {

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j >= 1; j--) {
                triangleString += " ";
            }
            for (int l = 1; l <= i; l++) {
                triangleString += symbol;
            }
            triangleString += "\n";
        }
        System.out.println(triangleString);
        triangleString = "";
    }

    public void displaySolidUR() {

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                triangleString += " ";
            }
            for (int l = size; l > i; l--) {
                triangleString += symbol;
            }
            triangleString += "\n";
        }
        System.out.print(triangleString);
        triangleString = "";
    }

    public void displaySolidUL() {

        for (int i = size; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                triangleString += symbol;
            }
            triangleString += "\n";
        }
        System.out.print(triangleString);
        triangleString = "";
    }

    public void displayHollowLL() {

        triangleString += symbol + "\n" + symbol + symbol + "\n";
        for (int i = 0; i < size - 3; i++) {
            triangleString += symbol;
            for (int j = 0; j <= i; j++) {
                triangleString += ' ';
            }
            triangleString += symbol;
            triangleString += '\n';
        }
        for (int l = 0; l < size; l++) {
            triangleString += symbol;
        }
        triangleString += '\n';
        System.out.print(triangleString + "\n");
        triangleString = "";
    }

    public void displayHollowLR() {
        
        for (int i = 0; i < size; i++) {
            triangleString += symbol;
        }
        triangleString += "\n";
        for (int i = 1; i <= size - 2; i++) {
            triangleString += symbol;
            for (int j = size - i - 1; j >= 1; j--) {
                triangleString += " ";
            }
            triangleString += symbol;
            triangleString += "\n";
        }
        triangleString += symbol;
        System.out.print(triangleString + "\n");
        triangleString = "";
    }
    
    public void displayHollowUR() {

    }
}
