public class Company {
    private String name;
    private String address;
    private int numberOfEmployees;
    private String googleMapPinLink;
    private String websiteUrl;

    public Company(String name, String address, int numberOfEmployees, String googleMapPinLink, String websiteUrl) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.googleMapPinLink = googleMapPinLink;
        this.websiteUrl = websiteUrl;
    }
    public Company(){}

    //region Seters and Geters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getGoogleMapPinLink() {
        return googleMapPinLink;
    }

    public void setGoogleMapPinLink(String googleMapPinLink) {
        this.googleMapPinLink = googleMapPinLink;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }
    //endregion

    public void printProperties(){
        System.out.println("Name -  " + name);
        System.out.println("Address -  " + address);
        System.out.println("Number of employees -  " + numberOfEmployees);
        System.out.println("google map pin link -  " + googleMapPinLink);
        System.out.println("website url -  " + websiteUrl);
    }
}
