class box3d extends box1{
    private int length,breadth,height;
    public box3d(int length,int breadth,int height){
        super(length,breadth,height);
        
        System.out.println("Constructor of box3d created");
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    void volume(){
        System.out.println(length*breadth*height);
    }
    void area(){
        System.out.println(2*length+2*height+2*breadth);
    }
}
class box1{
    private int length,breadth,height;
    public box1(int length,int breadth,int height){
        System.out.println("Constrictor created");
        this.length=length;
        this.breadth=breadth;
        this.height=height;

    }
    void volume(){
        System.out.println(length*breadth*height);
    }
    void area(){
        System.out.println(2*length+2*height+2*breadth);
    }
}
class box{  
    public static void main(String args[]){
        box1 bn=new box1(20,30,40);  
        bn.area();
        bn.volume();
       box3d bk=new box3d(20,30,40);
        bk.area();
        bk.volume();  
    }
   }  
