package edu.ufp.inf.lp2.aulas.pl._1_intro;

import java.lang.String;

public class Person {

  private String idNumber;
  private String name;
  private String address;
  private Date birth;

  public Person(String idNumber, String name, String address, Date birth) {
    this.idNumber = idNumber;
    this.name = name;
    this.address = address;
    this.birth = birth;
  }

  public Person(String name) {
    this.name = name;
    this.idNumber = "N/A";
    this.address = "N/A";
    this.birth = new Date(); // estanciar o atributo birth da classe Date
    // o que passamos como parametros Date() é o que define qual o construtor
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  public int age() {
    return this.birth.differenceYears(new Date(System.currentTimeMillis()));
  }

  public boolean olderThan(Person p) {
    return !this.birth.afterDate(p.birth); // comparar o nosso objeto com aquele que é enviado como parametro
  }

  public static void main(String[] args) {
    Person teste = new Person("Tiago");
    teste.age();
  }

  @Override
  public String toString() { // é defino por defeito atraves do java mas podemos mudar para a nossa maneira
    return "Person{" +
            "idNumber='" + idNumber + '\'' +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", birth=" + birth +
            '}';
  }
}
