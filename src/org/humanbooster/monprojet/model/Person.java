package org.humanbooster.monprojet.model;

public class Person {

        public String name;
        public int age = 18;
        private Horse horse;

        public Person(String name) {
                this.name = name;
        }

        public Person(String name, int age){
                this(name);
                this.age = age;
        }

        public void introducing() {
                String an;
                if (this.age > 1){
                        an = " ans ";
                } else {
                        an = " an ";
                }

                System.out.println("Nom de la personne: "+ this.name + " d'âge " + this.age + an + ", il est donc " + isMajeur());
        }

        public void addToAge(int age){
                this.age += age;
        }

        public String isMajeur(){
                return this.age >= 18 ? "Majeur" : "Mineur";
        }

        @Override
        public String toString() {
                final StringBuffer sb = new StringBuffer("Person{");
                sb.append("name='").append(name).append('\'');
                sb.append(", age=").append(age);
                sb.append('}');
                return sb.toString();
        }
}
