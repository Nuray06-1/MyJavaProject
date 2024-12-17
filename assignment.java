class Donor{//create class with name Donor
    private String name; //name
    private double totalDonations; //donation by donor
    public Donor(String name){//a function with name attribute
        this.name = name;//to initialize name
        this.totalDonations = 0.0;//donation = 0
    }public String getName(){//getter for the name
        return name;//return name
    }public void setName(String name){//setter for the name
        this.name = name;//to update
    }public double getTotalDonations(){//getter for the donation
        return totalDonations;//return donation
    }public void addDonation(double amount){//method to add donation
        this.totalDonations += amount;
    }public void displayInfo(){//method to display info about a donor
        System.out.println("Donor Name: " + name);//his/her name
        System.out.println("Total Donations: $" + totalDonations);
    }
}class Charity{//class of charity
    private String name; //charity's name
    private double totalReceived; //total amount
    public Charity(String name){//a function to initialize attributes
        this.name = name;
        this.totalReceived = 0.0;
    }public String getName(){//getter for the name of charity
        return name;
    }public void setName(String name){//setter to update name
        this.name = name;
    }public double getTotalReceived(){//getter for total amount
        return totalReceived;
    }public void receiveDonation(double amount){//method to receive donation
        this.totalReceived += amount;
    }public void displayInfo(){//method to display info about charity
        System.out.println("Charity Name: " + name);
        System.out.println("Total Donations Received: $" + totalReceived);
    }
}class Donation{//class to represent donation
    private Donor donor; //donor
    private Charity charity; //charity
    private double amount; //donation amount
    public Donation(Donor donor, Charity charity, double amount){//a function to initialize attributes
        this.donor = donor;
        this.charity = charity;
        this.amount = amount;
        donor.addDonation(amount);//update
        charity.receiveDonation(amount);//update
    }public void displayDetails(){//method to display information of donation
        System.out.println("Donation Details:");
        System.out.println("Donor: " + donor.getName());
        System.out.println("Charity: " + charity.getName());
        System.out.println("Amount: $" + amount);
    }
}public class CharityDonationPlatform{//the main code/instances
    public static void main(String[] args){
        Donor donor1 = new Donor("Alice");//the 1st donor
        Donor donor2 = new Donor("Bob");//the 2nd one
        Charity charity1 = new Charity("Save the Children");//charity 1
        Charity charity2 = new Charity("Red Cross");//charity 2
        Donation donation1 = new Donation(donor1, charity1, 100);//donation 1
        Donation donation2 = new Donation(donor2, charity1, 150);//donation 2
        Donation donation3 = new Donation(donor1, charity2, 200);//donation 3
        System.out.println("\n--- Donation Details ---");//a table to display donation details
        donation1.displayDetails();
        donation2.displayDetails();
        donation3.displayDetails();
        System.out.println("\n--- Donor Information ---");//another table to display information of donors
        donor1.displayInfo();
        donor2.displayInfo();
        System.out.println("\n--- Charity Information ---");//the next one to display info about charity
        charity1.displayInfo();
        charity2.displayInfo();
        System.out.println("\n--- Comparing Donors ---");//compare total donations of donors
        if (donor1.getTotalDonations() > donor2.getTotalDonations()) {
            System.out.println(donor1.getName() + " donated more than " + donor2.getName());
        }else if (donor1.getTotalDonations() < donor2.getTotalDonations()) {
            System.out.println(donor2.getName() + " donated more than " + donor1.getName());
        }else {
            System.out.println(donor1.getName() + " and " + donor2.getName() + " donated the same amount.");
        }System.out.println("\n--- Comparing Charities ---");//compare total donations of charity
        if (charity1.getTotalReceived() > charity2.getTotalReceived()) {
            System.out.println(charity1.getName() + " received more donations than " + charity2.getName());
        }else if (charity1.getTotalReceived() < charity2.getTotalReceived()) {
            System.out.println(charity2.getName() + " received more donations than " + charity1.getName());
        }else {
            System.out.println(charity1.getName() + " and " + charity2.getName() + " received the same amount of donations.");
        }
    }
}