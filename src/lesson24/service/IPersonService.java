package lesson24.service;

import java.io.IOException;
import java.util.List;

public interface IPersonService<T> {
   List<T> getPersonFromApi(int numbersRequest) throws IOException, InterruptedException;
   List<T> jsonParser(String date, int nums);
}