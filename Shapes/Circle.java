class Circle extends Shape{
    public Circle(int y) {
        this.width=y;
    }


    public void area() {
        System.out.println(width*width*Math.PI);
        
    }
}
