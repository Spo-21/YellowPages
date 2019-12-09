import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashMap<String, Company> companies = new HashMap<>();

        Company sfl = new Company("SFL", "24/19 Azatutyan avenue, 3rd floor", 90, "https://www.google.ru/maps/place/SFL+LLC/@40.2082179,44.5290171,15z/data=!4m5!3m4!1s0x0:0x3bdb56d2f44309dd!8m2!3d40.2082179!4d44.5290171", "https://sflpro.com/");
        Company picsArt = new Company("PicsArt", "Halabyan St 16", 39, "https://www.google.ru/maps/place/%D0%9F%D0%B8%D0%BA%D1%81%D0%90%D1%80%D1%82/@40.1966917,44.4800082,15z/data=!4m5!3m4!1s0x0:0x92d25db256756521!8m2!3d40.1966917!4d44.4800082", "https://picsart.com/");
        Company nextStack = new Company("NextStack", "48 Mamikonyants street", 8, "https://www.google.com/maps/place/NextStack+LLC/@40.20976,44.516131,15z/data=!4m5!3m4!1s0x0:0x479a752085ab6fff!8m2!3d40.20976!4d44.516131", "https://nextstack.org/");
        Company zero = new Company("ZERO", "59 Hanrapetutyan Street, 7th floor", 30, "https://www.google.ru/maps/place/ZER%C3%98+App/@40.1772956,44.5172216,15z/data=!4m5!3m4!1s0x0:0x7834e3d07472f16c!8m2!3d40.1772956!4d44.5172216", "https://zeroapp.ai/");

        companies.put(sfl.getName(), sfl);
        companies.put(picsArt.getName(), picsArt);
        companies.put(nextStack.getName(), nextStack);
        companies.put(zero.getName(), zero);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input company name");
        String inputName = scanner.nextLine();

        if (companies.containsKey(inputName)){
            companies.get(inputName).printProperties();
        }
        else {
            System.out.println("We do not have information about this company");
        }
    }
}
