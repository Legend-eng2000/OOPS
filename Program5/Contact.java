package Program5;

public class Contact {
    EnhancedString name;
    String mobile;
    Contact(String name,String mobile){
        this.name=new EnhancedString(name);
        this.name.titleCase();
        this.mobile=mobile;
    }
    public void display(){
        System.out.println("Name: "+name.str+"\t Mobile: "+mobile);
    }
    public static void findByPrefix(Contact[] liContacts,String prefix){
        for(Contact con:liContacts){
            if(con.name.str.startsWith(prefix)){
                con.display();
            }
        }
    }
    public static void sortByName(Contact[] liContacts){
        for(int i=0; i<liContacts.length-1 ; i++){
            for(int j=i+1; j<liContacts.length; j++){
                if((liContacts[i].name.str.compareTo(liContacts[j].name.str))>0){
                    Contact temp=liContacts[j];
                    liContacts[j]=liContacts[i];
                    liContacts[i]=temp;
                }
            } 
        }
    }
    public static void displayAll(Contact[] liContacts){
        int num=1;
        for(Contact con:liContacts){
            System.out.print(num++ +". ");
            con.display();
        }
    }
}
