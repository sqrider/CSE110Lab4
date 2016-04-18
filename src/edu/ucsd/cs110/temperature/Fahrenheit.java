package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature temp = new Fahrenheit((value-32)*5/9);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature temp = new Fahrenheit(value);
        return temp;
    }


    public String toString()
    {
        // TODO: Complete this method
        return ""+this.getValue()+" "+"F";
    }
}

