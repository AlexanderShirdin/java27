package lesson24.dto;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class PersonDto {
    private final String gender;
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String country;
    private final String email;
    private final ZonedDateTime date;
    private final Integer age;

    public PersonDto(String gender, String firstName, String lastName, String city, String country, String email, ZonedDateTime date, Integer age) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.country = country;
        this.email = email;
        this.date = date;
        this.age = age;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private String gender;
        private String firstName;
        private String lastName;
        private String city;
        private String country;
        private String email;
        private ZonedDateTime date;
        private Integer age;

        public void show() {
            System.out.println(this);
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDate(ZonedDateTime date) {
            this.date = date;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonDto build() {
            return new PersonDto(gender, firstName, lastName, city, country, email, date, age);
        }
    }
}