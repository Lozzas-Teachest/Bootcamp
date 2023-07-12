

public class Customer {

        // Instance variables to hold customer's name and account number
        private String name;
        private int accountNumber;
        private char customerStatus;

        private static int lastUsedAccountNumber = 1000;

        public Customer(String name)
        {
            this.name = name;
        }

        public Customer(char customerStatus, String name) {
            this(name);
            if(customerStatus == 'A' || customerStatus == 'I' || customerStatus == 'H') {
                this.customerStatus = customerStatus;
            } else {
                customerStatus = 'H';
            }
            accountNumber = ++lastUsedAccountNumber;
        }

        public static void setLastUsedAccountNumber(int aValue) {
            lastUsedAccountNumber = aValue;
        }

        public boolean isHeld() {
            if(customerStatus == 'H') {
                return true;
            } else {
                return false;
            }
        }

        public char getCustomerStatus() {
            return  customerStatus;
        }



        //
        // The getName method returns the name
        //
        public String getName()
        {
            return name;
        }

        //
        // The getAccountNumber method returns the accountNumber
        //
        public int getAccountNumber()
        {
            return accountNumber;
        }

        //
        // This changeDetails method changes the name
        //
        public void changeDetails(String name)
        {
            this.name = name;
        }

        public void changeDetails(String name, char status) {
            this.name = name;
            this.customerStatus = status;
        }
    }

