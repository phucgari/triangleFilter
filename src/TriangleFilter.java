public class TriangleFilter {
    public String triangleFilter(double a,double b,double c){
        double med=(a+b+c)/2;
        if(a>med||b>med||c>med||a==0||b==0||c==0) return "Not a Triangle";
        if(b==c||a==b||a==c){
            if(a==b&&b==c){
                return "Equilateral Triangle";
            }
            return "Isosceles Triangle";
        }
        return "Normal Triangle";

    }
}