package exam;

public class AnimalHospital {
        public void CheckPatient(Animal animal) {
            if (animal.IsHealthy())
                System.out.println("건강한 상태");
            else
                System.out.println("건강에 문제가 있음");


//    public void CheckPatient(Dog dog) {
//        if (dog.IsHealthy())
//            System.out.println("건강한 상태");
//        else
//            System.out.println("건강에 문제가 있음");
//    }
//
//    public void CheckPatient(Cat cat) {
//        if (cat.IsHealthy())
//            System.out.println("건강한 상태");
//        else
//            System.out.println("건강에 문제가 있음");
//    }

        }
    }

// 오버로딩 한 상황이다. 다양한 동물들을 구현할수록 코드는 길어진다.


