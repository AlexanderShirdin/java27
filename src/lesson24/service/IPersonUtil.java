package lesson24.service;

import java.io.IOException;

public interface IPersonUtil {
    void printPersonsSort(int amount) throws IOException, InterruptedException;
    void printPersonsWithSeparator(int amount) throws IOException, InterruptedException;
    void printPersonsAvgAge(int amount) throws IOException, InterruptedException;
    void printPersonsAddMrMs(int amount) throws IOException, InterruptedException;
    void printPersonsDivisionGender(int amount) throws IOException, InterruptedException;
}
