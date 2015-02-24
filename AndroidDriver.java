//Ryan Slipher
public class AndroidDriver {                                                    
        public static void main(String [] args ) {
                Android myAndroid = new Android();
                System.out.println(myAndroid.toString());

                Android anotherAndroid = new Android("Samsung", "Galexys5", 1);
                System.out.println(anotherAndroid.toString());
                }
}
