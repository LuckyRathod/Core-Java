/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teluskolearnings;

/**
 *
 * @author Lucky_Rathod
 */
public class DesignPatterns {
    
    
   /*
    Method 1
    ****
    ****
    ****
    ****
    Normal i=1;i<=4;i++ and innner loop j=1;j<=4;j++
    
    Method 2
    *
    **
    ***
    ****
    
    Now here Columns depends on row 
    i=1;i<=4;i++ and inner loop j=1;j<=i;j++
    
    
    
    */
    
    
    /*
   Method 3
    
    first check i==1 || j==1 || i==4 || j==4
    if we want to print same in above varaibles
    ****
    *  *
    *  *
    ****
    
    method 4
    
    
    check whether the value is inc in next rows 
    In print() of inner loop wrtie i+j-1
    if it becomes i+j-1>4 then print i+j-1 -4 and all wala methods see below
    1234
    2341
    3412
    4123
    
    
    
    Method 5
    
    Now when u want to print 0 and 1 and if its traingle then go for i+j%2==0 odd even method
    First try too see pattern then print * and then go for 0 and 1
    1 i=1 j=1-->i+j=2 even = 1
    01 i=2 j=1 -->i+j=3 odd =0 for 1 i=2 j=2 i+j = 4 even 1
    101
    0101
    10101
    
    
    Method 6
    
    Depending on only rows no and print star like 
    1 
    22
    333
    4444
    55555
    
    
    Method 7 
    1
    12 
    123
    1234    
    
    
    Method 8 
    
    Print stars in reverse order as triangle
    
    *****
    ****
    ***
    **
    *
    
    Method 9 
    
    Printing Number pattern as triangle from right side
    
    
       1
      12
     123
    1234
    
    Method 10
    
    Printing no in reverse order with reverse traingle method 8
    
    54321
    5432
    543
    54
    5
    
    
    */
    
        //Method 11 
//            0
//           1 2
//          3 4 5
//         6 7 8 9
    
    
    
    //Method12
//        * * * *
//         * * *
//          * *
//           *
    
    
    
    public static void main(String[] args) {
        int i,j,k;
        
        /*
        ****
        ****
        ****
        ****
        */
        System.out.println("Simple pattern with all stars Method 1");
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
        /*
        *
        **
        ***
        ****
        */
        System.out.println("Pattern with triangle where col depends on rows Method 2");
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        
        
        /*
        ****
        *  *
        *  *
        ****
        */
        System.out.println("Pattern with space in between rows and columns Method 3");
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4)
                System.out.print(" * ");
                else
                System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("Pattern with nos Telusko_30 tutorial H/W Method 4");
        // 1 2 3 4
        // 2 3 4 1
        // 3 4 1 2
        // 4 1 2 3
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                if(i==1)
                    System.out.print(""+j);
                else if(j==1)
                    System.out.print(""+i);
                else if(j==4)
                    System.out.print("" +(i-1));
                else if(i==4)
                    System.out.print("" +(j-1));
                else
                {
                    if(i==2 && j==3 || i==3 && j==2)
                        System.out.print("4");
                    if(i==2 && j==2)
                        System.out.print("3");
                    if(i==3 && j==3)
                        System.out.print("1");
                }
            }
            System.out.println();
        }
        
        System.out.println("OR");
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                //first put only j-->1 2 3 4 in all
                //then i+j-->2 3 4 5
                           //3 4 5 6
                           //4 5 6 7
                //we want -1
                //1 2 3 4
                //2 3 4 5..
                //now if val is >4 then -4
                k = i+j-1;
                if(k > 4)
                System.out.print(k-4+" ");
                else
                    System.out.print(k+" ");
            }
            System.out.println();
            
            
          
        }
        System.out.println("ODD EVEN  METHOD 5");
           for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
           
           
           
           
           
           /*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
           */
           System.out.println("Dpending only on rows *Number* METHOD 6");
           for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
         System.out.println("Dpending only on rows *Number*Method 7");
         /*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
         */
           for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
                   
         /*
        *****
        ****
        ***
        **
        *
         */
         System.out.println("Printing in Reverse order of 5stars then4 3 ,2 ,1 ");
         //int star=5;
           for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
            //star--;
        }
           
           
        System.out.println(" Printing Number pattern as triangle from right side Method 9");
        /*
        
       1
      12
     123
    1234
        
        NOW for the first line we first need to print * or spaces of 3 and then value
        so its very easy before printing values we will make another for loop inside outer loop for * or spaces of reverse print order of stars 
        ***1
        **12
        *123
        1234
        
        */
    for(i=1;i<=4;i++){
        
        for(k=3;k>=i;k--){
            System.out.print("  ");
        }
        for(j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    
    
    System.out.println("Printing no in reverse order with reverse traingle method 8 ---> These is Method 10");
    /*
    54321
    5432
    543
    54
    5
    
    */
    for(i=1;i<=5;i++){
        for(j=5;j>=i;j--){
            System.out.print(j+" ");
            
        }
        System.out.println();
    }
        
    //Method 11 
//            0
//           1 2
//          3 4 5
//         6 7 8 9
int num = 0;
for(i = 1 ; i <= 4 ;i++){
     
    for(k = 3 ; k >=i ;k--){
        System.out.print("*");
    }
    for(j = 1 ; j <= i ;j++){
        System.out.print(num + " ");
         num=num+1;
    }
   
    System.out.println();
    
    
    
}

//Method12
//        * * * *
//         * * *
//          * *
//           *


    for(i = 1 ; i <=4 ; i++){
        
        
        for(k=1 ; k<=i ; k++){
            System.out.print(" ");
        }
        for(j=4; j>=i ; j--){
            System.out.print("* ");
            
        }
        System.out.println();
    }
         
         
    }
    
}
