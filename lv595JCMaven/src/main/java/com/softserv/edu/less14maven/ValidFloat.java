package main.java.com.softserv.edu.less14maven;

public class ValidFloat{
    private float minimum;
    private float maximum;

    public ValidFloat(float min, float max){
        minimum = min;
        maximum = max;
    }

    public boolean validFloat (float arg){
        if (arg >= minimum && arg <= maximum) return true;
        return false;
    }

}