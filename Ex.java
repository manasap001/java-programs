class Ex{
public static void main(String args[]){
int i=30;
int j=19;
int k=i-- - i++ + --i - ++j + --i - j-- + ++i - j++;
System.out.println("the value is:"+k);
}
}