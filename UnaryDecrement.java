class UnaryDecrement{
public static void main(String args[]){
int i=10;
int preDecrement=--i - --i;
System.out.println("the value of preDecrement is:"+preDecrement);
System.out.println("the value of i is:"+i);
int postDecrement=i-- - i - i--;
System.out.println("the value of postDecrement is:"+postDecrement);
}
}