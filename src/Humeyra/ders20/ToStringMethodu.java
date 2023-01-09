package Humeyra.ders20;

public class ToStringMethodu {
    String model="a";
    String marka="b";
    int yas=12;

    @Override
    public String toString() {
        return "ToStringMethodu{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yas=" + yas +
                '}';
    }
//code -->Generate--> toString
    //bu siralama ile yazdirabiluiriz.
    public static void main(String[] args) {
        ToStringMethodu object=new ToStringMethodu();
        object.model="K modeli";
        object.marka="Kalite";
        object.yas=23;

    }
}
