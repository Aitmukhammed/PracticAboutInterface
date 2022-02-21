package Practic;

public interface Beta extends Alpha {

    default public int getAteb() {

        return 50;
    }
    default public int showAlpha(){
        Alpha.super.getAteb();
        return getAteb();
    }

}
