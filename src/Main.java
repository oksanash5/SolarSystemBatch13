import com.company.Planet1;
import com.company.SUN;
import com.company.solarSystem;

public class Main {
    public static void main(String[] args) {
          solarSystem inseption = new solarSystem();
          inseption.Sun=1;
          inseption.Moon =4;
          inseption.Planets=2;
        System.out.println("The basic structure is ready");
        //developing the feature Sun
        SUN omaro=new SUN();
        omaro.temperature="12334556j";
        omaro.name="ferro";
        omaro.radius =12345567;
        omaro.color ="pink";

        // developing planet1
        Planet1 superplanet=new Planet1();
        superplanet.color= "magenta";
        superplanet.name ="hash";
        superplanet.size= "545487km";
    }

}