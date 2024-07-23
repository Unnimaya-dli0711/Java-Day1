package Basics.com;

public class PrimitiveDataTypes {
    int aint;
    short bshort;
    long clong;
    boolean dboolean;
    byte ebyte;
    double fdouble;
    float gfloat;
    char hchar;
    public static void main(String [] args){
        PrimitiveDataTypes obj1=new PrimitiveDataTypes();
        System.out.println("These are the primitive datatypes with their default values");
        System.out.println("Integer Default value : " +obj1.aint);
        System.out.println("Short Default value : " +obj1.bshort);
        System.out.println("Long Default value : " +obj1.clong);
        System.out.println("Double Default value : " +obj1.fdouble);
        System.out.println("Float Default value : " +obj1.gfloat);
        System.out.println("Byte Default value : " +obj1.ebyte);
        System.out.println("Boolean Default value : " +obj1.dboolean);
        System.out.println("Character Default value : " +obj1.hchar);
    }
}
