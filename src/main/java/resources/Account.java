package resources;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        //Мметод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
        //Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
        if (checkNameLength() && checkSpaceChar() && checkMediumSpace()) {
            return true;
        } else return false;
    }
    
    public  boolean checkNameLength(){
        if (name.length()>=3 && name.length()<=19) {return true;}        
            else return false;
    }

    public boolean checkSpaceChar(){
        int count = 0;
        for (int i = 0; i < name.length(); i++ ) {
            if (name.charAt(i) == ' ') { count++; }
        }
        
        if (count == 1) {return true;}
        else return false;
    }

    public boolean checkMediumSpace(){
        if (name.charAt(0) != ' ' || name.charAt(name.length()) != ' ') {
            return true;
        } else return false;
    }



    
    

}
