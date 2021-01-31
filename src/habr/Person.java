package habr;

public class Person {

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomeOwner;

    public Person(
            final String newLastName,
            final String newFirstName,
            final String newMiddleName,
            final String newSalutation,
            final String newSuffix,
            final String newStreetAddress,
            final String newCity,
            final String newState,
            final boolean newIsFemale,
            final boolean newIsEmployed,
            final boolean newIsHomeOwner) {

        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.salutation = newSalutation;
        this.suffix = newSuffix;
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
        this.isFemale = newIsFemale;
        this.isEmployed = newIsEmployed;
        this.isHomeOwner = newIsHomeOwner;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isHomeOwner() {
        return isHomeOwner;
    }

    public static class Builder {

        private String nestedLastName;
        private String nestedFirstName;
        private String nestedMiddleName;
        private String nestedSalutation;
        private String nestedSuffix;
        private String nestedStreetAddress;
        private String nestedCity;
        private String nestedState;
        private boolean nestedIsFemale;
        private boolean nestedIsEmployed;
        private boolean nestedIsHomeOwner;

        public Builder setNestedLastName(String nestedLastName) {
            this.nestedLastName = nestedLastName;

            return this;
        }

        public Builder setNestedFirstName(String nestedFirstName) {
            this.nestedFirstName = nestedFirstName;

            return this;
        }

        public Builder setNestedMiddleName(String nestedMiddleName) {
            this.nestedMiddleName = nestedMiddleName;

            return this;
        }

        public Builder setNestedSalutation(String nestedSalutation) {
            this.nestedSalutation = nestedSalutation;

            return this;
        }

        public Builder setNestedSuffix(String nestedSuffix) {
            this.nestedSuffix = nestedSuffix;

            return this;
        }

        public Builder setNestedStreetAddress(String nestedStreetAddress) {
            this.nestedStreetAddress = nestedStreetAddress;

            return this;
        }

        public Builder setNestedCity(String nestedCity) {
            this.nestedCity = nestedCity;

            return this;
        }

        public Builder setNestedState(String nestedState) {
            this.nestedState = nestedState;

            return this;
        }

        public Builder setNestedIsFemale(boolean nestedIsFemale) {
            this.nestedIsFemale = nestedIsFemale;

            return this;
        }

        public Builder setNestedIsEmployed(boolean nestedIsEmployed) {
            this.nestedIsEmployed = nestedIsEmployed;

            return this;
        }

        public Builder setNestedIsHomeOwner(boolean nestedIsHomeOwner) {
            this.nestedIsHomeOwner = nestedIsHomeOwner;

            return this;
        }

        public Person build() {
            return new Person(
                    nestedLastName, nestedFirstName, nestedMiddleName,
                    nestedSalutation, nestedSuffix,
                    nestedStreetAddress, nestedCity, nestedState,
                    nestedIsFemale, nestedIsEmployed, nestedIsHomeOwner);
        }

    }

}
