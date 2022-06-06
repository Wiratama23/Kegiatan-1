public class Laki extends contoh1{
    String nama = "Santoso",hobby;
    int umur = 18;

    @Override
    void getName() {
        System.out.println("Nama\t : "+nama);
    }

    @Override
    void getAge() {
        System.out.println("Umur\t : "+umur);
    }

    @Override
    void setHobby(String hobby) {
        this.hobby = hobby;
    }

    String getHobby(){
        return hobby;
    }
    public void keterangan(){
        getName();
        getAge();
        setHobby("Basket");
        System.out.println("Memiliki Hobby\t : "+getHobby());
    }
}
