public class Transport {
    private String name;
    private String brand;
    private String color;
    private String countryOfOrigin;
    private int yearOfRelease;
    public Transport(String name){
        this.name = name;
    }
    public Transport(String name,String brand){
        this(name);
        this.brand = brand;
    }
    public Transport(String name,String brand,String color,int yearOfRelease){
        this(name,brand);
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }
    public Transport(String name,String brand,String color,String countryOfOrigin,int yearOfRelease){
        this(name, brand);
        this.color = color;
        this.countryOfOrigin =countryOfOrigin;
        this.yearOfRelease =yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return String.format( "%s%n%s%n%s%n%s%n%d",
              name,
               brand, color
                ,countryOfOrigin
                 , yearOfRelease
                );
    }
}
