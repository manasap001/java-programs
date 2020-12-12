class UnaryIncrement{
public static void main(String args[]){
int i=10;
int preIncrement=++i + ++i;
System.out.println("the value of preIncrement is:"+preIncrement);
int j=10;
int postIncrement=j++ + j++ + j ;
System.out.println("the value of postIncrement is:"+postIncrement);
}
}