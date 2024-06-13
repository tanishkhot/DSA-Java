// Writing the array of objects syntax:

Classname obj[] = new Classname[5];

Classname obj1[] = new Classname[5];

Classname obj[] = new Classname[5];

Classname arrOfObj[] = new Classname[5];

Classnmae obj[]=  new classnmae[5];

// Static method: 

@staticmethod


public static void method_name () {

    // This is hiow your create a static method. To call this:

    classname.methodname();

    //Just like there are instance methods, everything is usually called an Instance method unless it is specified to be static. 

    // Instance requires object, static does not, 

    // Instance methoids can be accessed by :
    object_reference.methodname();

    //static method have to be acessed using:
    classname.methodname();


}


class BoxDemo{

    int height;
    int width;
    int depth;

    public BoxDemo(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

}

public static void main(String[] args) {
    BoxDemo myBox = new BoxDemo(10,15,23);

    int vol;

    vol = myBox.width*myBox.height*myBox.depth;

    System.out.println("Volume: " + vol);
}