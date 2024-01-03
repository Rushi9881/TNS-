package Day5.TaxCalculator;


public class person { 
        // Data members
        String Name;
        int age;
        String gender;
        int income;
        double tax;

        public person(String setName, int setAge, String setgender, int setIncome) {
            this.setName(setName);
            this.setAge(setAge);
            this.setgender(setgender);
            this.setIncome(setIncome);
            
        }
        //getter and setter
        public String getName() {
            return Name;
        }
        public void setName(String name) {
            Name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getgender(){
            return gender;
        }
        public void setgender(String gender){
            this.gender = gender;
        }
        public int getIncome() {
            return income;
        }
        public void setIncome(int income) {
            this.income = income;
        }
        public double getTax() {
            return tax;
        }
        public void setTax(double tax) {
            this.tax = tax;
        }

        //toString method
        public String toString(){
            return "Person [name="+ getName() + ", age="+getAge()+", gender="+ getgender() + ", income="+ getIncome()+ ", tax="+ getTax()+"]";
        }


       }

    
