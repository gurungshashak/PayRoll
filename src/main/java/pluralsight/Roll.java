package pluralsight;
import java.io.*;

public class Roll {
    public static void main(String[] args) {

        try {
            FileReader fileReader =new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader =new BufferedReader(fileReader);
            String line;
            bufReader.readLine();
            System.out.println("Id" + "|" + "Name" + "|" + "Hour-Worked" + "|" + "Salary");

            while ((line = bufReader.readLine()) != null) {
                String[] rollLine = line.split("\\|");
                System.out.println(line);
                int id=Integer.parseInt(rollLine[0]);
                String name=rollLine[1];
                double salary=Double.parseDouble(rollLine[2]);
                double payRate=Double.parseDouble(rollLine[3]);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
