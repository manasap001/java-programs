class Smallest{
public static void main(String args[]){
int a=20;
int b=10;
int c=30;
int smaller;
if(a<b){
if(c<a){
smaller=c;
}
else{
smaller=a;
}
}else{
if(b<c){
smaller=b;
}
else{
smaller=c;
}
}
System.out.println("smallest number is:"+smaller);
}
}