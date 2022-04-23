package lesson24.service;

import lesson24.dto.PersonDto;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.net.http.HttpResponse.BodyHandlers.ofString;

public class PersonService implements IPersonService<PersonDto> {
    @Override
    public List<PersonDto> getPersonFromApi(int numbersRequest) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(String.format("https://randomuser.me/api/?nat=us,dk,fr,gb&results=%s", numbersRequest)))
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, ofString());

        return jsonParser(response.body(), numbersRequest);
    }

    @Override
    public List<PersonDto> jsonParser(String date, int numbs) {
        JSONObject fullJsonObj = new JSONObject(date);
        List<PersonDto> personDtos = new ArrayList<>();
        for (int i = 0; i < numbs; i++) {
            JSONObject results = fullJsonObj.getJSONArray("results").getJSONObject(i);
            String gender = results.getString("gender").toUpperCase().substring(0, 1);
            JSONObject name = results.getJSONObject("name");
            String first = name.getString("first");
            String last = name.getString("last");
            JSONObject location = results.getJSONObject("location");
            String city = location.getString("city");
            String country = location.getString("country");
            String email = results.getString("email");
            JSONObject dob = results.getJSONObject("dob");
            ZonedDateTime dates = ZonedDateTime.parse(dob.getString("date"));
            Integer age = dob.getInt("age");

            PersonDto personDto = new PersonDto.Builder()
                    .setGender(gender)
                    .setFirstName(first)
                    .setLastName(last)
                    .setCity(city)
                    .setCountry(country)
                    .setEmail(email)
                    .setDate(dates)
                    .setAge(age)
                    .build();

//            PersonDto personDto1 = new PersonDto(gender, first, last, city, country, email, dates, age);
            personDtos.add(personDto);
        }
        return personDtos;
    }
}