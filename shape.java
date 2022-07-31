class circle extends shape1{
    public void draw(){
        System.out.println("circle created");
    }
    public void erase(){
        System.out.println("Erase circle sucessfully");
    }
}
class triangle extends shape1{
    public void draw(){
        System.out.println("triangle created");
    }
    public void erase(){
        System.out.println("Erase triangle sucessfully");
    }
}
class square extends shape1{
    public void draw(){
        System.out.println("square created");
    }
    public void erase(){
        System.out.println("Erase square sucessfully");
    }
}
class shape1{
    public void draw(){
        System.out.println("Shape created");
    }
    public void erase(){
        System.out.println("Erase shape sucessfully");
    }
}
public class shape {
    public static void main(String args[]){
        shape1 s=new square();
        s.draw();
        s.erase();
    }
}
