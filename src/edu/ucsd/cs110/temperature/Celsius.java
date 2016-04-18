package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

    public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        Temperature temp = new Celsius(value);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature temp = new Celsius(value*9/5+32);
        return temp;
        //return (value*9/5+32);
    }


    public String toString()
        {
            // TODO: Complete this method
            return ""+this.getValue()+" "+"C";
        }
}
