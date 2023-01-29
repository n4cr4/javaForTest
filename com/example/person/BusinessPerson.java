package person;
public class BusinessPerson extends Person { // サブクラス
    private String job;

    public BusinessPerson(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public void print() {
        System.out.println("名前: " + getName() + ", 年齢: " + getAge() + "歳, 職業: " + job);
    }
}

