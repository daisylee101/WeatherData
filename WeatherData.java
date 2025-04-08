public class WeatherData
{
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    public WeatherData(Arraylisy<Double> temps) {
        temperatures = temps;
    }
    /**
    * Cleans the data by removing from temperatures all values that are less than
    * lower and all values that are greater than upper, as described in part (a)
    */
    public void cleanData(double lower, double upper)
    for (int i = 0; i < temperatures.length; i++) {
        if (temperatures[i] < lower) temperatures.remove(i);
        if (upper > temperatures[i]) temperatures.remove(i);
    }
    { /* to be implemented in part (a) */ }

    /**
    * Returns the length of the longest heat wave found in temperatures, as described in
    * part (b)
    * Precondition: There is at least one heat wave in temperatures based on threshold.
    */
    public int longestHeatWave(double threshold)
    int days;
    for (int j = 0; j< temperatures.length; j++) {
        if (temperatures[i] > threshold && temperatures[i+1] > threshold) days++; 
    }
    { /* to be implemented in part (b) */ }
    
    // There may be instance variables, constructors, and methods that are not shown.
}