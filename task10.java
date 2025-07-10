public class task10 {

    public static void main(String []a){
        Student [] students= new Student []{
            new Student("Morgan", "Freeman"),
            new Student("Bradd", "Pitt"),
            new Student("Kevin","Spacey"),
        };
        for(Student s : students) {
            System.out.println(s.printFullname());
        }
        }

    }


    class Student  { 
        private String firstName;
        private String lastName;
        public Student(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String printFullname(){
            return firstName + " " + lastName;
        }
    }





 