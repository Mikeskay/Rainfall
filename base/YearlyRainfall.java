package rainfall.base;

/**
 * Complete the implementation of this class.
 * 
 */

public class YearlyRainfall {

	// An (optional) display for the rainfall data.
	
    //private RainfallDisplay display = new RainfallDisplay();

    int[] list; 

	public YearlyRainfall() {

		list = new int[11];

	}

	public int getMonthAmount(int month) {
		if(month >= 0 && month < 11){
            return list[month];
        }
        else return -1;
	}

	public void setMonthAmount(int month, int amount) {
        list[month] = amount;
	}

	public double getMean() {

        double sum = 0;

      for(int i=0; i< list.length; i++){
	         sum = sum + list[i];
	      }


      double mean = sum/list.length;

      return mean;
		
	}

	public String toString(){

		
		return list.toString();
	}

    

}
