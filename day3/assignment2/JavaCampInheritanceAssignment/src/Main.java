public class Main {
    public static void main(String[] args) {


        Student emre = new Student(1,
                "Yunus Emre",
                "Korkmaz",
                "dolphinium",
                "yunusemrekorkmaz@gmail.com",
                "Eskişehir Teknik Üniversitesi",
                "2",
                23,
                2);

        Student berke = new Student(1,
                "Berkcan",
                "Solmaz",
                "Berkokvs",
                "bekoberk12@gmail.com",
                "Ortadoğu Teknik Üniversitesi",
                "4",
                24,
                1);

        Student sinem = new Student(1,
                "Sinem",
                "Osmanoğlu",
                "siynosmanov",
                "siynem123@gmail.com",
                "Kırıkkale Üniversitesi",
                "1",
                20,
                4);


        // emre.setAge(23);

        Student[] students = {
                emre,
                berke,
                sinem
        };

        // single user register attempt
        UserManager userManager = new UserManager();
        userManager.addUser(emre);

        // multiple user register attempt

        userManager.addMultipleUser(students);

        System.out.println(emre.getAge());

    }
}
