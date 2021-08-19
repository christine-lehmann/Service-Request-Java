//AUTHOR: CHRISTINE MAE T. CION 

import java.util.Objects;
import java.util.Scanner;
public class Service {
    public static Scanner s= new Scanner(System.in);
    public static Scanner i= new Scanner(System.in);
    public static String[] ServiceType = {"Cleaning","Repair","Both"};
    public static String admin_user="Admin", passwordkey ="12345";
    public static String temp_user="", temp_pass="";
    public static int admin_choice=0;
    public static int dashboard_choice=0;
    public static int pending_choice;
    public static String [][][] ClientReg = new String[20][100][100];
    
    public static int service;
    public static int ClientRegTix=0;
    public static int table=0;
    public static int on=0;
    public static int a=0;
    public static int b=0; 
    public static int onn=0;
    public static int index;
    public static int amp;
    public static float pending=0;
    public static float on_going=0;
    public static float closed=0;
    public static float total=0;
    public static String temp_date="",temp_date1="";
    public static String[] temp_array_date= new String[100];
    
    static void home(){
        //home choice
        int home_choice;
           System.out.println("\n\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
          System.out.println("\t▀▄         WELCOME TO GREEN COOL         ▄▀");
          System.out.println("\t▀▄            SERVICE REQUEST            ▄▀");
          System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
          System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
          System.out.println("\t▀▄             LOG IN AS                 ▄▀");
          System.out.println("\t▀▄                                       ▄▀");
          System.out.println("\t▀▄             [1] Admin                 ▄▀");
          System.out.println("\t▀▄             [2] Client                ▄▀");
          System.out.println("\t▀▄             [3] Exit                  ▄▀");
          System.out.println("\t▀▄                                       ▄▀");
          System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
          System.out.print("\n\t\tEnter your choice: ");
          home_choice=i.nextInt();
        if(home_choice==1){
         //Admin  
         admin_log_in();
        }
        else if(home_choice==2){
         //Customer  
         customer_log_in();
        }
        else{
            //Exit
            System.out.print("\nGood Bye (●╭╮●)");
        }
    }
    static void admin_home(){
        table=0;
          System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
          System.out.println("\t▀▄            WELCOME BACK ADMIN!        ▄▀");
          System.out.println("\t▀▄                                       ▄▀");
          System.out.println("\t▀▄           [1] Client Register         ▄▀");
          System.out.println("\t▀▄           [2] Dashboard               ▄▀");
          System.out.println("\t▀▄           [3] Exit                    ▄▀");
          System.out.println("\t▀▄                                       ▄▀");
          System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
          System.out.print("\n\t\tEnter your choice: ");
          admin_choice=i.nextInt();
          if(admin_choice==1){
              ClientReg();
          }
          else if(admin_choice==2){
              dashboard();
          }
          else{
              home();
          }
}
    static void admin_log_in(){
      
      System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
      System.out.println("\t▀▄             ADMIN LOGIN               ▄▀");
      System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
      System.out.print("\n\tUsername: ");
      temp_user=s.next();
      System.out.print("\tPassword: ");
      temp_pass=s.next();
      if (temp_user.equals(admin_user)&&temp_pass.equals(passwordkey)){
          admin_home();
      }
      else{
          System.out.println("\n\t✖Incorrect username/password. Try Again.✖");
          admin_log_in();
      }
    }
    static void ClientReg(){
       
        table=0;
        System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("\t▀▄           CLIENT REGISTRATION         ▄▀");
        System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.print("\n\tFull Name: ");
        s.nextLine();
        ClientReg[table][0][ClientRegTix]=s.nextLine();
        System.out.print("\tAge: ");
        ClientReg[table][1][ClientRegTix]=s.nextLine();
        System.out.print("\tGender: ");
        ClientReg[table][2][ClientRegTix]=s.nextLine();
        System.out.print("\tAddress: ");
        ClientReg[table][3][ClientRegTix]=s.nextLine();
        System.out.print("\tContact no: ");
        ClientReg[table][4][ClientRegTix]=s.nextLine();

        System.out.print("\tDate Created(mm dd yy): ");
        temp_date=s.nextLine();
        temp_array_date= temp_date.split(" ");
        ClientReg[table][8][ClientRegTix]=temp_array_date[0];
        ClientReg[table][9][ClientRegTix]=temp_array_date[1];
        ClientReg[table][10][ClientRegTix]=temp_array_date[2];
        
        
        System.out.print("\n\tUsername: ");
        ClientReg[table][5][ClientRegTix]=s.nextLine();
        System.out.print("\tPassword: ");
        ClientReg[table][6][ClientRegTix]=s.nextLine();
        
        //Choose Service
        System.out.print("\n\t               Service type\n");
        System.out.print("\n\t[0] Cleaning ");
        System.out.print("\n\t[1] Repair ");
        System.out.print("\n\t[2] Cleaning and Repair");
        System.out.print("\n\tEnter your choice:  ");
        service=i.nextInt();
        ClientReg[table][20][ClientRegTix] = "Pending";
        if (service==0){
            ClientReg[table][7][ClientRegTix]=ServiceType[service];
        }
        else if (service==1){
             ClientReg[table][7][ClientRegTix]=ServiceType[service];
        }
        else{
            service=2;
            ClientReg[table][7][ClientRegTix]=ServiceType[service];
        }
        ClientReg[table][11][ClientRegTix]=Integer.toString(ClientRegTix);
        ClientRegTix++;
        pending++;
        System.out.println("\n\tData Registered!");
        admin_home();
    }
    static void customer_log_in(){
   
      String tempUser="";
      String tempPass="";
      System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
      System.out.println("\t▀▄              CLIENT LOGIN             ▄▀");
      System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
      System.out.print("\n\tUsername: ");
      tempUser=s.next();
      System.out.print("\tPassword: ");
      tempPass=s.next();
      for(int i=0;i<=ClientRegTix;i++){
          String a="";
          String b="";
          a=ClientReg[table][5][i];
          b=ClientReg[table][6][i];
          if (Objects.equals(a, tempUser)&&Objects.equals(b, tempPass)){
              index=i;
              content();
              amp=1;
          }
      }
      if(amp!=1){
          System.out.println("\n\t✖Incorrect username/password. Try Again.✖");
          customer_log_in();
          
      }
      else{
          content();
      }
        
        
       
    }
    static void content(){
         while (ClientReg[table][0][index].equals("Empty")){
            table++;
        }
        System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("\t▀▄              WELCOME BACK             ▄▀");
        System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s%-20s\n"," Ticket #","Name","Age","Gender","Address","Contact#","Month","Day","Year","Service Type","Status");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s%-20s\n",
        ClientReg[table][11][index]
        ,ClientReg[table][0][index]
        ,ClientReg[table][1][index]
        ,ClientReg[table][2][index]
        ,ClientReg[table][3][index]
        ,ClientReg[table][4][index]
        ,ClientReg[table][8][index]
        ,ClientReg[table][9][index]
        ,ClientReg[table][10][index]
        ,ClientReg[table][7][index]    
        ,ClientReg[table][20][index]);
        home();
 
    }
    static void dashboard(){

    total=ClientRegTix;
    pending=(pending/total)*100;
    on_going=(on_going/total)*100;
    closed=(closed/total)*100;
        System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("\t▀▄                DASHBOARD              ▄▀");
        System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀\n");
        System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("\t▀▄                                       ▄▀");
        System.out.printf("\t▀▄%-11s%-11s%-11s%-10s\n", "   [0]" , "   [1]" , " [2]", "[3]   ▄▀");
        System.out.println("\t▀▄                                       ▄▀");
        System.out.printf("\t▀▄%-11s%-11s%-11s%-10s\n", " PENDING" , " ONGOING" ,"CLOSED","BACK  ▄▀");
        System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.print("\n\t\tEnter your choice: ");
    dashboard_choice=i.nextInt();
    if(dashboard_choice==0){
        table=0;
        System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("\t▀▄                PENDING                ▄▀");
        System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s\n"," Ticket #","Name","Age","Gender","Address","Contact#","Month","Day","Year","Service Type");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    for(int i=0;i<total;i++){
        
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s\n",
        ClientReg[table][11][i]
        ,ClientReg[table][0][i]
        ,ClientReg[table][1][i]
        ,ClientReg[table][2][i]
        ,ClientReg[table][3][i]
        ,ClientReg[table][4][i]
        ,ClientReg[table][8][i]
        ,ClientReg[table][9][i]
        ,ClientReg[table][10][i]
        ,ClientReg[table][7][i]);
        a++;
    }
    System.out.print("\nSelect Ticket Number to Work: ");
    pending_choice=i.nextInt();
    if(pending_choice<=a){
    ClientReg[table+1][11][on]=ClientReg[table][11][pending_choice];
    ClientReg[table+1][0][on]=ClientReg[table][0][pending_choice];
    ClientReg[table+1][1][on]=ClientReg[table][1][pending_choice];
    ClientReg[table+1][2][on]=ClientReg[table][2][pending_choice];
    ClientReg[table+1][3][on]=ClientReg[table][3][pending_choice];
    ClientReg[table+1][4][on]=ClientReg[table][4][pending_choice];
    ClientReg[table+1][8][on]=ClientReg[table][8][pending_choice];
    ClientReg[table+1][9][on]=ClientReg[table][9][pending_choice];
    ClientReg[table+1][10][on]=ClientReg[table][10][pending_choice];
    ClientReg[table+1][7][on]=ClientReg[table][7][pending_choice];
    on++;
    ClientReg[table][11][pending_choice]="Empty";
    ClientReg[table][0][pending_choice]="Empty";
    ClientReg[table][1][pending_choice]="Empty";
    ClientReg[table][2][pending_choice]="Empty";
    ClientReg[table][3][pending_choice]="Empty";
    ClientReg[table][4][pending_choice]="Empty";
    ClientReg[table][8][pending_choice]="Empty";
    ClientReg[table][9][pending_choice]="Empty";
    ClientReg[table][10][pending_choice]="Empty";
    ClientReg[table][7][pending_choice]="Empty";
    ClientReg[table][20][pending_choice] = "On Going";
    dashboard();
    }
    else{
        System.out.println("\nInvalid ticket");
        dashboard();
    }
    }
    else if(dashboard_choice==1){
   table=1;
        System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("\t▀▄                ON GOING               ▄▀");
        System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s\n"," Ticket #","Name","Age","Gender","Address","Contact#","Month","Day","Year","Service Type");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    for(int i=0;i<total;i++){
              
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s\n",
        ClientReg[table][11][i]
        ,ClientReg[table][0][i]
        ,ClientReg[table][1][i]
        ,ClientReg[table][2][i]
        ,ClientReg[table][3][i]
        ,ClientReg[table][4][i]
        ,ClientReg[table][8][i]
        ,ClientReg[table][9][i]
        ,ClientReg[table][10][i]
        ,ClientReg[table][7][i]);
        b++;
    }
    System.out.print("\nSelect Ticket Number to Finish: ");
    pending_choice=i.nextInt();
    System.out.print("\nInput Execution Day ");
    System.out.print("\nDate Schedule(mm dd yy): ");
    temp_date1=s.nextLine();
    temp_array_date= temp_date1.split(" ");
    ClientReg[table+1][12][pending_choice]=temp_array_date[0];
    ClientReg[table+1][13][pending_choice]=temp_array_date[1];
    ClientReg[table+1][14][pending_choice]=temp_array_date[2];
    System.out.print("\nAssign Technician: ");
    ClientReg[table+1][15][pending_choice]=s.nextLine();
    
        
    if(pending_choice<=b){
    ClientReg[table+1][11][onn]=ClientReg[table][11][pending_choice];
    ClientReg[table+1][0][onn]=ClientReg[table][0][pending_choice];
    ClientReg[table+1][1][onn]=ClientReg[table][1][pending_choice];
    ClientReg[table+1][2][onn]=ClientReg[table][2][pending_choice];
    ClientReg[table+1][3][onn]=ClientReg[table][3][pending_choice];
    ClientReg[table+1][4][onn]=ClientReg[table][4][pending_choice];
    ClientReg[table+1][8][onn]=ClientReg[table][8][pending_choice];
    ClientReg[table+1][9][onn]=ClientReg[table][9][pending_choice];
    ClientReg[table+1][10][onn]=ClientReg[table][10][pending_choice];
    ClientReg[table+1][7][onn]=ClientReg[table][7][pending_choice];
    onn++;
    ClientReg[table][11][pending_choice]="Empty";
    ClientReg[table][0][pending_choice]="Empty";
    ClientReg[table][1][pending_choice]="Empty";
    ClientReg[table][2][pending_choice]="Empty";
    ClientReg[table][3][pending_choice]="Empty";
    ClientReg[table][4][pending_choice]="Empty";
    ClientReg[table][8][pending_choice]="Empty";
    ClientReg[table][9][pending_choice]="Empty";
    ClientReg[table][10][pending_choice]="Empty";
    ClientReg[table][7][pending_choice]="Empty";
    ClientReg[table][20][pending_choice] = "Closed";
    dashboard();
    }
    else{
         System.out.println("\nInvalid ticket");
        dashboard();
    }
    }
    else if(dashboard_choice==2){
    table=2;
    ClientReg[table][20][pending_choice] = "Closed";
    System.out.println("\n\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
    System.out.println("\t▀▄                  CLOSED               ▄▀");
    System.out.println("\t▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀");
      System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s%-20s%-10s%-20s%-20s\n"," Ticket #","Name","Age","Gender","Address","Contact#","Month","Day","Year","Service Type","Month","Day","Year","Technician");
    System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    for(int i=0;i<total;i++){
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-20s%-20s%-10s%-20s%-20s%-20s%-10s%-20s%-20s\n",
         ClientReg[table][11][i]
        ,ClientReg[table][0][i]
        ,ClientReg[table][1][i]
        ,ClientReg[table][2][i]
        ,ClientReg[table][3][i]
        ,ClientReg[table][4][i]
        ,ClientReg[table][8][i]
        ,ClientReg[table][9][i]
        ,ClientReg[table][10][i]
        ,ClientReg[table][7][i]
        ,ClientReg[table][12][i]
        ,ClientReg[table][13][i]
        ,ClientReg[table][14][i]
        ,ClientReg[table][15][i]);
    }
    dashboard();
    }
    else{
        admin_home();
    }
    }
    
    public static void main(String[] args) {
 home();

    }
    
}
