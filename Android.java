// ryan slipher
//class Android for test

public class Android {
	public String make;
	public String model
	public int quantity
/*---------------------------------------------------------*/
Android () {
	make = "Unknown";
	model = "Unkown";
	quantity = "Unkown";
	}
Android (String thisMake) {
	this();
	make = thisMake;
	}
Android (String thisMake, String thisModel) {

        make = thisMake;
	model = thisModel;
        }
Android (String thisMake, String thisModel, int thisQuantity) {

        make = thisMake;                                                        
        model = thisModel;
	quantity = thisQuantity
        }                      
public String toString() {
	String desc = "Make: " + make + " Model: " + model + " Quantity: " + quantity;
	return desc;
	}
}
