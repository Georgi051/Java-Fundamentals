    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        boolean isOutofAge = false;

        int price = 0;

        if (age > 64 && age <= 122){
                switch (dayType){
                    case "Weekday":
                        price = 12;
                        break;
                    case "Weekend":
                        price = 15;
                        break;
                    case "Holiday":
                        price = 10;
                        break;
                }
        }else if (age > 18 && age <= 64){
                switch (dayType){
                    case "Weekday":
                        price = 18;
                        break;
                    case "Weekend":
                        price = 20;
                        break;
                    case "Holiday":
                        price = 12;
                        break;
                }
        }else if (age >= 0 && age <= 18){
               switch (dayType){
                   case "Weekday":
                       price = 12;
                       break;
                   case "Weekend":
                       price = 15;
                       break;
                   case "Holiday":
                       price = 5;
                       break;
                }
        }else {
            isOutofAge = true;
        }

        if (isOutofAge){
            System.out.println("Error!");
        }else {
            System.out.printf("%d$",price);
        }
    }

}