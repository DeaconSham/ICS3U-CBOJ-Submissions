class Student {
    String name, password, address, phone, email;
    int age;
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
    public boolean checkPassword (String password) {
      if (password.matches(this.password)) return true;
      return false;
    }
    public void copyHomeInfo (Student other) {
      this.address = other.address;
      this.phone = other.phone;
      this.email = other.email;
    }
}