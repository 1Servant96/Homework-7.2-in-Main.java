//import org.w3c.dom.ls.LSOutput;

//import java.sql.SQLOutput;
//import java.util.Random;


import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        //System.out.println(string.substring(0,2).equals("e"));
        System.out.println(method(string));
    }

    public static boolean method(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e') {
                count++;
            }
        }
        return count >= 1 && count <= 3;
    }
}
         //  if(){ return string.substring(0,2).equals("e");
    /*Scanner scanner= new Scanner(System.in);
    String string= scanner.nextLine();

        if(string.length()<=3) {
                System.out.println(string.toUpperCase());
                }
                else{

                String first = string.substring(0,string.length()-3);
                String second = string.substring(string.length()-3);
                String result = first+second.toUpperCase();
                System.out.println(result);

                }

  /*static void method(String...arguments){
    for (String name:arguments) {
        System.out.println("I love you "+ name);
    }}}

   /*Random random = new Random();
        int[] massive = new int[100];
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < massive.length; i++) {
            massive[i]=random.nextInt(1,101);
            if(massive[i]==a){
                System.out.println(massive[i]);
                System.out.println("You  have a same number in "+i+" index");
            }
            else {System.out.println("You didn`t have same in this index ");}

            break;  }









        }}
        /*static boolean method02() {
        Scanner scanner = new Scanner(System.in);
        int[] massive = new int[]{1, 2, 3, 4, 1, 4};
        int counter = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == massive[i += 1])
                System.out.println(massive[i]);
                counter++;
        }
        //massive[i] = scanner.nextInt();


        return counter>0;
    }

            //  System.out.println(true);
        //else {
        //System.out.println(false);
        //}






        //method(massive);

        //method7(arr,arr2);
        // method6(arr);
        //method1();
        //System.out.println("Enter the one day of week:");
        //Scanner scanner = new Scanner(System.in);
        // method4(scanner.nextLine());
        //method3(scanner.nextInt());
        //System.out.println("You need to type char, int and int.");
        // method5(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());



    //check method later
    static void method(int[] massive) {
        System.out.print("First half: ");
        for (int i = 0; i < (massive.length)/2 ; i++) {
                System.out.print(massive[i]+",");
            }
        System.out.println("Second half: ");
        for (int i = (massive.length)/2; i >massive.length; i++) {
            System.out.println(massive[i]+",");

        }
        }}



        /*System.out.println(Arrays.toString( massive));
        for (int i = massive.length-1; i>=0;  i--) {
            System.out.print(massive[i]+" ");
        }
        System.out.println(Arrays.toString(massive));

    }
    static void method3 (int b) {
        int z = 0;
        int z1 = 0;
        Random random = new Random();
        for (; 0 < b; ) {
            int i = random.nextInt(0, 101);
            if (i< 51 && i > 0) {
                System.out.println(i);
                z += i;
            } else {
                System.out.println(i);
                z1 += i;

            }

        }
        System.out.println("The sum of first 50 numbers: " + z + " and sum of next 50 numbers: " + z1);
    }
    static void method1(){
        System.out.println("Enter your number variable");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Type even or odd");
        String word = scanner.nextLine();
        switch (word) {
            case "even": {
                while (x > 0) ;
                {
                    if (x % 2 == 0) {
                        System.out.println(x);
                        x--;
                    }
                }
            }
            break;
            case "odd":
                while (x > 0) {
                    if (x % 3 == 0) {
                            System.out.println(x);
                            x--;
                    }
                }
                break; }




        // amount++;

    }
    static void method4(String word) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        //toUpperCase(day);
        switch (day) {
            case "mo", "eighth day":
                System.out.println("On Monday we have technical english"   );
                break;
            case "tu":
                System.out.println("On Tuesday practice lesson"  );
            break;
                case "we":
                System.out.println("On wednesday" );
                break;
            case "th":
                System.out.println("On Thursday softskills");
                break;
            case "fr":
                System.out.println("On Friday event"  );
                break;
            case "sa":
                System.out.println("On Saturday review"  );
                break;
            case "su":
                System.out.println("On Sunday reading"  );
                break;
            default:
                System.out.println("You are wrong");
        }
    }

    static void method5(String q, int a, int b ){
//char Char=scanner();
        switch (q){
            case "+":
                System.out.println("a+b="+(a+b));
                break;
            case "-":
                System.out.println("a-b="+(a-b));
                break;
            case "%":
                System.out.println("a%b="+a%b);
                break;
            case "/":
                System.out.println("a/b="+a/b);
                break;
            case "*":
                System.out.println("a*b="+a*b);
                break;

        }

    }

    static void method6(int[] arr){

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(1,100);
            System.out.println(i +"="+arr[i]);


        }

    }
    static void method7 (int[] arr, int[] arr2){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>10){
              arr2[i]=arr[i];
                System.out.println(i +"="+arr2[i]);

            }


        }

    }
}



        /*/

        /*Scanner scanner = new Scanner(System.in);
        int a;
        Random number = new Random();
        int[] massive= new int[99];
        for (int i = 0; i < massive.length; i++) {
            massive[i]=number.nextInt(1,99);
        }
        System.out.println("Enter the number:");
        a = scanner.nextInt();

            for (int i = 0; i < massive.length; i++) {
                int b = massive[i];
                if (a == b) {
                    System.out.println("You have a same number in the array");

                    System.out.println(i);
                }
            }
             {System.out.println("System do not found in array.Enter new value:");
            a = scanner.nextInt();

    }
static void method(int a){
        int i;
        //if()
}


}






      /*

    int methods = scanner.nextInt();
    if(methods==1){
        System.out.println("Bir san beriniz");
        method1();
    }
    else if(methods==2){
        System.out.println("Bir san beriniz");
        int a = scanner.nextInt();
        method2(a);
    }
    else if(methods==3){
        System.out.println("Bir animal beriniz");
        String value = sc.nextLine();
        method3(value);
    }


    }

    static void method1(){
        int day = scanner.nextInt();
        String dayString=null;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println(dayString);
        //System.out.println(dayString);
    }
    static void method2(int i){
        if(i==10) {
            System.out.println("i is 10");
        }
            else if(i==15){
            System.out.println("i is 15");
            }
            else if(i==20){
            System.out.println("i is 20");
        }
            else if(i==25){
            System.out.println("i is 25");
        }
            else if(i==30){
            System.out.println("i is 30");
        }
            else if(i==35){
            System.out.println("i is 35");
        }
            else {
            System.out.println("Invalid present");}
        System.out.println(i);
    }


    static void method3(String animal){
        String result=null;
        switch(animal){
            case "Dog":
                result="Domestic dog animal";
                break;
            case "Cat":
                result="Domestic animal";
                break;
            case "Tiger":
                result="wild animal";
                break;
            case "Horse":
                result="Domestic horse animal";
                break;
            default:
                System.out.println("Not animal");


        }
        System.out.println(result);



    }



}
   /* static void method(int[]array) {

        Random random = new Random();
        System.out.println("Even numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
            if (array[i] % 2 == 0) {
                System.out.println(array[i]++);
            }


        }
        System.out.println("massivtin bardyk ");
        //System.out.println(Arrays.toString(array));


    }


}

    /*
    public static void method(double points)

    {
        if (points>=202.7){
            System.out.println("Raund:A1");
        }
        else if (points<=122.2)
        {
            System.out.println("Raund:A2");}
            else {
                System.out.println("Invalid raund:A3");}

    };

       /* Scanner name = new Scanner(System.in);

        int a= name.nextInt();
        int b = name.nextInt();
qwer1( a,  b);


    }


        static void qwer1(int a, int b) {

            Scanner name = new Scanner(System.in);
           // int number = name.nextInt();
            //int number2 = name.nextInt();
            System.out.println((a+b)/2);
        }


        /*int i = 0;
            for(i=0 ;a<11 ;i++)
            {

            }

        };
        /*Scanner scanner = new Scanner(System.in) ;

        int[] intArray= new int [10];
        Random weq = new Random();
        int array = weq.nextInt(0,10);
int c =0 ;


        for (int b = 0; array< intArray.length; b++)
        {
            System.out.println(intArray[array]);

        b++;
        }





        //if (a>0 && a<5){ System.out.println(Math.floor((double)number/10)*10);}
        //else if(a>5 && a<=9) {
            //System.out.println(Math.round((double) number / 10) * 10);
        //};





         /*else if (number<0) {
            System.out.println(  "Negative integer"  );
        }
        else {
            System.out.println("Zero"); Scanner value = new Scanner(System.in);
        System.out.println("Enter the four ordered number:");
        int a = value.nextInt();
        if (a>0&&a<10000 && a/100<a%100) {
            System.out.println(a/100+"<"+a%100);
        }
        e

        lse if (a>0&&a<10000 && a/100>a%100) {
          */




        /*for ( int i = 0; i<=10; i++){

         System.out.println( "5"+"*"+i+"="+5*i  );
        }







                /*do  {
                    if(b%2!=c) {
                        System.out.println(b++);
                        b++;
                    }


                }
                while (b<a);






















        /*Scanner value = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = value.nextInt();
        int number1 = 1;
        boolean rem = (number1%2==0) ;

        number1++;
        while (  number1<number) {
            if (number1%2==0)
            {
                System.out.println("Even number: " +number1);
            }
            number1++;*/


            //System.out.println(number1);




        //System.out.println(number);

        /*Scanner value = new Scanner (System.in);
        System.out.println("Enter the two numbers:");

        int number = value.nextInt();
        int number1 = value.nextInt();

        number++;

        while (number<number1  ) {
            System.out.println(Math.pow(number,2));
            number+=2;*/




        /*int number= value.nextInt();
        int score = 0;
        while (number>0)

        {
            number/=10;
            score++;





        }
        System.out.println(score);







        /*Scanner goal = new Scanner(System.in);


         Random score=new Random();

         int asan=score.nextInt(1,101);
        int uson=score.nextInt(1,101);
         if(asan>1 && asan<=59 || uson>1 && uson<=59 ) {System.out.println("failed the exam");}


         else {System.out.println("You passed the exam");}







        /*System.out.println("Type the numbers from 0 to 59");
        Scanner number = new Scanner(System.in);
        int minutes = number.nextInt();
        if (minutes <= 0 && minutes <= 15) {
            System.out.println(" First part");
        } else if (minutes > 15 && minutes <= 30) {
            System.out.println("second part");
        } else if (minutes > 30 && minutes <= 45) {
            System.out.println("third part");
        } else if (minutes > 45 && minutes <= 60) {
            System.out.println("fourth part");
        } else {
            System.out.println("wrong");
        }
        ;













      }





        /*Scanner number= new Scanner(System.in);
        Random qwer = new Random( );

        System.out.println("Enter the first age:");
        int a = qwer.nextInt(2,10);
        System.out.println("Enter the second age:");
        int b = qwer.nextInt(1,10);

        String result = (a>b)?"The age of first person is bigger":"The age of second person is bigger";

        System.out.print(result);

        /*if (a>b && a>c) {   System.out.println  (a);   }

        else if (b>a && b > c) {System.out.println( b );    }

        else {   System.out.println(c);   }




















               /*Scanner number = new Scanner (System.in);

                System.out.println("Enter the number:");
                   int a = number.nextInt();

                    System.out.print( (a/100)+(a/10)+(a)              );

                System.out.println( given.nextInt(100,999) );*/









                /*System.out.printf (" time is = "+ hour +":"+ minutes + ":" + seconds + ", by changing the time to seconds and summing them up = " +( (hour*3600)+(minutes*60)+seconds )    );
                System.out.print*/










