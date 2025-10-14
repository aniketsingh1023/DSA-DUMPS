public class Conditionals {

    public static void main(String[] args) {
        // int budget = 30000;
        // if(budget > 10000){
        //     budget = budget + 100;
        // }else{
        //     budget = budget - 1000;
        // }
        // System.out.println(budget);



        //Multiple is else statements 
        // calculate bonus
        int bonus;
        int salary = 10000;
        if (salary < 5000){
                salary += 200;
        }else if (salary < 15000){
                salary += 1500;
        }else{
            salary += 500;
        }

         bonus = salary;
        System.out.println(bonus);
    }
}