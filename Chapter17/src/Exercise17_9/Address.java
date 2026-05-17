package Exercise17_9;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String name, String street, String city, String state, String zip) {
        setName(name);
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    public String getFixedName() {
        return String.format("%-32s", name);
    }

    public String getFixedStreet() {
        return String.format("%-32s", street);
    }

    public String getFixedCity() {
        return String.format("%-20s", city);
    }

    public String getFixedState() {
        return String.format("%-2s", state);
    }

    public String getFixedZip() {
        return String.format("%-5s", zip);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip.trim();
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s", name, street, city, state, zip);
    }
}
