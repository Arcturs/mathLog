package ru.vsu.csf.Sashina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class fromDocument {

    public static List<String> processFile (String name) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            String s = br.readLine();
            List<String> list = new ArrayList<>();
            while (s != null) {
                list.add(s);
                s = br.readLine();
            }
            br.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
