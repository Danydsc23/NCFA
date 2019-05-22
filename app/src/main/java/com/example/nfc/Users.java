package com.example.nfc;

import java.util.Hashtable;

  class Users {
    public static Hashtable<String,TreinadorUser> usersTrein =new Hashtable<>();
    public static Hashtable<String,Atleta> usersAthl =new Hashtable<>();

    private static int [] TreinadID= {23112,1234};
    private static  int [] AtletaID= {2311,2121};

    public static void addRandomUsers(){
        TreinadorUser treinador1=new TreinadorUser("Mario","eusouomario",8402);
        usersTrein.put("Mario",treinador1);
        TreinadorUser treinador2=new TreinadorUser("Andre","eusouoandre",8402);
        usersTrein.put("Andre",treinador2);

        Atleta atleta1=new Atleta("Afonso","eusouoafonso",1234);
        usersAthl.put("Afonso",atleta1);
        Atleta atleta2=new Atleta("Joao","eusouojoao",54321);
        usersAthl.put("Joao",atleta2);

    }

    public  static boolean validAthleteID(int athID){
        boolean existe=false;
        for (int i=0; i<AtletaID.length;i++){
            if(AtletaID[i]==(athID)) existe=true;
        }
        return existe;
    }

    public static boolean validCouchID(int CouchID){
        boolean existe=false;
        for (int i = 0; i < TreinadID.length; i++) {
            if (TreinadID[i] == (CouchID)) existe = true;
        }
        return existe;
        }

    public static void addCouchUser(String name,String pass, String reppass,int couchID  ){
        if(pass.equals(reppass) && !usersTrein.containsKey(name)){
            usersTrein.put(name,new TreinadorUser(name,pass,couchID));

        }
    }
    public static void addAtuser(String name,String pass, String reppass,int athID){
        if(pass.equals(reppass) && !usersAthl.containsKey(name)){
            usersAthl.put(name,new Atleta(name,pass,athID));
        }
    }
    public static boolean logUser(String name,String pass){
        if((usersAthl.containsKey(name) && usersAthl.get((name)).getPassword().equals(pass) || (usersTrein.containsKey(name) && usersTrein.get((name)).getPassword().equals(pass)))){
            return true;
      }
        return false;
    }

}
