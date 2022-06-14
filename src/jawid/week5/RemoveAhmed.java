package jawid.week5;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
/*
5️⃣ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Ahmed", "Zeynep"));

    names.removeIf(str -> str.contains("Ahmed"));
    System.out.println(names);
}
}
