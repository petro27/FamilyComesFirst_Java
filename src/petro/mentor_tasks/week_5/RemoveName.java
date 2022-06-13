package petro.mentor_tasks.week_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveName {
    /*
    ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Petro"));
        list.removeIf(each -> (each.equals("Ahmed")));
        System.out.println(list);
        }

    }

