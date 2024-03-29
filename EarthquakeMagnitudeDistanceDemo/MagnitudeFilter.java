
/**
 * MagnitudeFilter returns quakes between min and max values given
 *
 */

public class MagnitudeFilter implements Filter
{
    private double magMin; 
    private double magMax; 
    
    public MagnitudeFilter(double min, double max) { 
        magMin = min;
        magMax = max;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getMagnitude() >= magMin && qe.getMagnitude() <= magMax; 
    } 

}
