
/**
 * DepthFilter returns quakes between two depths 
 *
 */
public class DepthFilter implements Filter
{
    private double minDepth; 
    private double maxDepth; 
    
    public DepthFilter(double min, double max) { 
        minDepth = min;
        maxDepth = max;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getDepth() >= minDepth && qe.getDepth() <= maxDepth; 
    } 

}
