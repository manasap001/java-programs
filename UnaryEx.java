class UnaryEx{
public static void main(String args[]){
int i=24;
int increment=i++ + ++i;
System.out.println("the value of preIncrement is:"+increment);
int a=5;
int b=10;
int c=a + b + a++ + b++ + ++a + ++b;
System.out.println("the value of c is:"+c);
int y=7;
y=y++ - --y + ++y - y--;
System.out.println("the value of y is:"+y);

}
}