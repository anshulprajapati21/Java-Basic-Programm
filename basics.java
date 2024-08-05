

import java.util.Scanner;

// add two number 
 
public class basics {
/* 
    public static void main(String[] args) {
        int a =10, b =20;
        int c = a+b;
        System.err.println(c);
    }
    
    
// how to take input from user
public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value");
    a = sc.nextInt();
    System.out.println(a);
}
    

// how check odd and even number'
public static void main(String[] args) {
    int n;
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     
     if (n%2==0)
     {
        System.err.println("This is even Number");
      }
      else
      {
        System.out.println("THis is odd number");
      }
       
        
     
}
      
      

// sum of two number..

public static void main(String[] args) {
    int a,b, sum;
    System.out.println(" enter two value");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();

    b = sc.nextInt();
     sum = a+b;
     System.out.println("Addition " + sum);
}

//Natural Number Program..
public static void main(String[] args) {
    int n;
    System.out.println("Enter Number of Term");
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();

    for (int i=1; i<=n; i++)
    {
        System.out.println(i + " ");
    }
}

// Sum of first natural number - Result 55
 public static void main(String[] args) {
    
int n, sum=0;
System.out.println(" enter number of  term");
Scanner sc = new Scanner(System.in);
n= sc.nextInt();


for( int i=1; i<= n; i++)
{
    sum = sum+i;

}
System.out.println(" " + sum);

 }

 
//Print odd number.
public static void main(String[] args) {
    int n;
    System.out.println("Enter Number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

for( int i=1; i<=n; i=i+2)
{
    System.out.println(i + " ");
}
}
 

// Print Even Number;
public static void main(String[] args) {
    int n;
    System.out.println("Enter even number of term");
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();
     for(int i=0;  i<=n; i=i+2)
{
    System.out.println( i +  " ");
}



//Print sum of odd or even number;
 

public static void main(String[] args) {
    int n,sum=0;
    System.out.println("enter Number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
     if (n%2 == 0)
     {
        for( int i=0; i<=n; i=i+2 )
        
     {
     sum = sum+i;
    }
    System.out.println("Enter sum of even number" + sum);
    }
    else
    {
      for(int i=1; i<=n; i=i+2)
      {
        sum=sum+i;

      }
      System.out.println("enter odd number" + sum);
}

    
}
}




//
public static void main(String[] args)
 {
    char ch;
   System.out.println("Enter any character");
   Scanner sc = new Scanner(System.in);
   ch = sc.next().charAt(0);
   System.out.println(ch);
}



// check vowel or consonant
public static void main(String[] args) {
    char ch;
    System.out.println("Enter any Character");
    Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);

    if (ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u') 
    {
        System.out.println("it's vowel");
        while (condition) {
            System.out.println("it's consonat");
            
        }
    }

    else
    {
        System.out.println("it's consonat");
    }

 }



// print ASCII value of cbharacter;

public static void main(String[] args) {
    char ch;

    System.out.println("enter any character");
    Scanner sc= new Scanner(System.in);
    ch= sc.next().charAt(0);

    int a=ch;
    System.out.println("ASCII vALUE OF " + a);
}

// Print to Alphabets;
public static void main(String[] args)
 {
    for(char i='A'; i<= 'Z'; i++)
    {
        System.out.println(i + " ");
    }
}

//MAximum number between two  number,
 public static void main(String[] args) {
    int a,b ;
    System.out.println(" enter two number");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
  
    if (a>b) 
    {
        System.out.println(a);
    }

        else

        {
            System.out.println(b);
           
        
    }
 }
 

 //calculate power of a number.
 
 public static void main(String[] args) {
    int n,p, Result=1;
    System.out.println("Enter Number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    System.out.println("Enter power");
    p = sc.nextInt();
    for(int i = 1; i<=p; i++)
    {
        Result = n*Result;
    }

        System.err.println("Power " + Result);

    }


    //find gratest number among three number;

    public static void main(String[] args) {
        int a=2, b=4, c=8;

        if (a>b)
         { 
            if (a>c)
            System.out.println(a);
            else
            System.out.println(c);
         }
         else
             {
                if (b>c)
                System.out.println(b);
                else 
                System.out.println(c);
                 
                    
                }
            
      

         //Calculate average marks of five subject..

        public static void main(String[] args) {
            int a,b,c,d,e,f;

            System.out.println("enter marks");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b= sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            f = sc.nextInt();

            int  sum = a+b+c+d+e+f;
            System.err.println(" total marks " + sum);

            double average =  sum/6;
            System.out.println("print average"  + average );
        }
         

        // find factorial number;

        public static void main(String[] args) {
            int n, fact=1;
            System.out.println( " Entre any number");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            for(int i=0; i<=n;i++)
            {
                fact = fact*i;


            }

            System.out.println("factorial  "  + fact);
        }
       

        // eligible for vote

            public static void main(String[] args) {
                int age;
                System.out.println("enter your age ");
                Scanner sc = new Scanner(System.in);
                age = sc.nextInt();
                
                if(age>=18){
                    System.out.println("elegible for vote");
                }
                else{
                    System.out.println("not eleigle for vote");
                }
                    
                }
                

                 // print multiplication tablee
      
                 public static void main(String[] args) {
                    int num;
                    System.out.println("Enter multiplication number");
                    Scanner sc = new Scanner(System.in);
                    num = sc.nextInt();

                    for (int i=1; i<=10 ; i++)
                     {
                        System.out.println(num+"*"+i+"="+num*i);
                
                        
                    }
                 }
                 */
                 
                 // Tax calculaton..
                 
                 
            }
        

    












