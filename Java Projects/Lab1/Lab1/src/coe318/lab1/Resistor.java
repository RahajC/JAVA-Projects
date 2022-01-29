/**
 * A Resistor models an ideal resistor that obeys Ohm's Law.
 *
 * @RahajChowdhury 500898736    
 */
package coe318.lab1;



public class Resistor {
  //Set Resistance & Current variables as Res & II, respectively
    private double Res; 
    private double II;
  
    public Resistor(double resistance) {
  //Constructor is used to initialize the res variable
    Res = resistance;
    }

    public double getResistance() {
  //Returns resistance variable by retrieving it
        return Res;
    }

    public double getVoltage() {
  //Returns voltage by multiplying resitance & current variable which gives the voltage
        return Res*II;
    }
    
    public void setVoltage(double voltage) {
  //Assigns values to current and resistance variables by using voltage variable
  //Uses if statement to check if voltage is within limits
    if (voltage > -50 && voltage < 50){
    II = voltage/Res; 
    Res = voltage/II;
    } else 
        {  
            System.out.println("Error: voltage value beyond limit");
        }
    }
    
    public double getCurrent() {
  // Returns current value to the statement calling it
        return II;
    }

    public void setCurrent(double current) {
  //Uses if statements to check if current values are within limits
    if (current>-5 && current<5){
        II = current; 
    } else 
        {  
            System.out.println("Error: current value beyond limit");
       
        }
    
    }

    public double getPower() {
  //Returns power variable by using power equation
        return II*(Res*II);
    }

    /**
     * A simple example of using a Resistor.
     * <p>
     * The output should be:
     * <pre>
     * Creating a 50 Ohm resistor (r1)
     * Its resistance is 50.0 Ohms
     * Its current is 0.0 Amps
     * Its voltage is 0.0 Volts
     * * Its power is 0.0 Watts
     * Creating a 100 Ohm resistor (r2)
     * Its resistance is 100.0 Ohms
     * Setting r1's current to 10 Amps
     * Error: current value beyond limit
     * Setting r1's current to 2 Amps
     * Its current is 2.0 Amps
     * Its voltage is 100.0 Volts
     * Its power is 200.0 Watts
     * Setting r1's voltage to 90 Volts
     * Error: voltage value beyond limit
     * Setting r1's voltage to 50 Volts
     * Its current is 1.0 Amps
     * Setting r2's current to 3 Amps
     * Its voltage is 300.0 Volts
     * </pre>
     *
     * @param args (Command line arguments not used.)
     */
    public static void main(String[] args) {
        Resistor r1, r2;
        System.out.println("Creating a 50 Ohm resistor (r1)");
        r1 = new Resistor(50.0);
        System.out.println("Its resistance is "
                + r1.getResistance() + " Ohms");
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Creating a 100 Ohm resistor (r2)");
        r2 = new Resistor(100.0);
        System.out.println("Its resistance is "
                + r2.getResistance() + " Ohms");
        System.out.println("Setting r1's current to 10 Amps");
        r1.setCurrent(10.0);
        System.out.println("Setting r1's current to 2 Amps");
        r1.setCurrent(2.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Its voltage is "
                + r1.getVoltage() + " Volts");
        System.out.println("Its power is "
                + r1.getPower() + " Watts");
        System.out.println("Setting r1's voltage to 90 Volts");
        r1.setVoltage(90.0);
        System.out.println("Setting r1's voltage to 50 Volts");
        r1.setVoltage(50.0);
        System.out.println("Its current is "
                + r1.getCurrent() + " Amps");
        System.out.println("Setting r2's current to 3 Amps");
        r2.setCurrent(3.0);
        System.out.println("Its voltage is "
                + r2.getVoltage() + " Volts");
    }
}
