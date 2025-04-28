public class WeatherData
{
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temps) {
        temperatures = temps;
    }
  
    public void cleanData(double lower, double upper)
    for (int i = 0; i < temperatures.length; i++) {
        double temp = temperatures.get(i);
        if (temp < lower || temp > upper)temperatures.remove(i);
    }


    public int longestHeatWave(double threshold)
    int days;
    for (int j = 0; j< temperatures.length; j++) {
        if (temperatures[i] > threshold && temperatures[i+1] > threshold) days++; 
    }
   
}