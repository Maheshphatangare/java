
public class HeronsFormula {
    static void area(double a, double b, double c){
        double s = (a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        System.out.println("Area of triangle is\n " 
                            + Math.sqrt(s));
    }
    public static void main(String[] args) {
        double a,b,c;
            a = 4;
            b = 5;
            c = 6;
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Input");
            return;
        }
        area(a,b,c);
    }
}
