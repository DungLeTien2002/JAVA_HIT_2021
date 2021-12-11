package Bai2;

public class RunMain {
    public static void main(String[] args) {
      IShape[] iShapes=new IShape[3];
      iShapes[0]=new Rectangle(3.4,5.3);
      iShapes[1]=new Rectangle(7.4,4.3);
      iShapes[2]=new Circle(5.5);
      for(int i=0;i<3;i++){
          System.out.println("Area of Shapes["+i+"]:"+iShapes[i].getArea());
          System.out.println("Perimeter of Shapes["+i+"]:"+iShapes[i].getPerimeter());
      }

    }
}
