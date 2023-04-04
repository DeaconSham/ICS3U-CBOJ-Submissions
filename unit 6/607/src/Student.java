class Student {
    String name, address, phone, email;
    int age;
    private String password;

    public void print() {
        System.out.println("-------------------------------------------------");
        System.out.println("STUDENT INFO |             ");
        System.out.println("Name         | " + this.name);
        System.out.println("Age          | " + this.age);
        System.out.println("Password     | " + this.password);
        System.out.println("---------------------------");
        System.out.println("CONTACT INFO |             ");
        System.out.println("Address      | " + this.address);
        System.out.println("Phone        | " + this.phone);
        System.out.println("Email        | " + this.email);
        System.out.println("-------------------------------------------------");
    }
    public void setStudentPassword() {
        this.password = this.name.charAt(1) + Integer.toString(age % 10) + this.address.charAt(0) + this.phone.substring(3, 6);
    }
    public String getStudentPassword(String adminPass) {
        if (adminPass.matches("admin")) {
            return this.password;
        }
        else return "invalid";
    }
}