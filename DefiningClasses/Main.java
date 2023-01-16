package DefiningClasses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        //Map<Integer, Integer> mapBank = new LinkedHashMap<>();
        List<BankAccount> list = new ArrayList<>();
        int count = 0;


        while (!data[0].equals("end")) {
            switch (data[0]) {
                case "Create":
//                    bankAccount.setId(count);
//                    list.add(bankAccount);
//                    count++;
//                    break;
                case "Deposit":


                    break;


            }


            data = scanner.nextLine().split(" ");
        }
        System.out.println();


    }
}
