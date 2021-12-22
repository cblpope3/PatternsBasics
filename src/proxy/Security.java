package proxy;

public class Security {

    private Door door;

    public Security(Door door) {
        this.door = door;
    }

    public void open(String password){
        if(auth(password)){
            door.open();
        }else System.out.println("Пароль не верный");
    }

    public void close(String password){
        door.close();
    }

    public boolean auth(String password){
       return password.equals("1234");
    }
}
