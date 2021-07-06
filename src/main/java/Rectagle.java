public class Rectagle {
    // DECLARACION DE VARIABLES DE LA CLASE
    int width = 0;
    int height = 0;
    float area = 0;

    // CONSTRUCTOR DE CLASE
    public Rectagle() {
    }

    // METODO PARA OBTENER EL AREA
    public float getArea() {
        area = width * height;
        return area;
    }

    public static void main(String[] args) {


        Rectagle myRect = new Rectagle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRects area is " + myRect.getArea());
    }
}