package Interfaces3;

public interface MyIF {
    public int getUserId();

    default int getAdminId(){
        return 1;
    }


}
