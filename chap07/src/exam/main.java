package exam;

public class main {
    public static void main(String[] args) {

            AnimalHospital hospital = new AnimalHospital();

            // 추상 클래스는 인스턴스를 만들수 없다 (규격으로만 사용 )
            //Animal a = new animal(); 불가
            Dog d1 = new Dog(20);
            Dog d2 = new Dog(60);

            hospital.CheckPatient(d1);
            hospital.CheckPatient(d2);




            Cat c1 = new Cat(0.5);
            Cat c2 = new Cat(1.5);

            hospital.CheckPatient(c1);
            hospital.CheckPatient(c2);

    }
}
