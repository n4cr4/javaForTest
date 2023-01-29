package person;
public class Person { // スーパークラス
    private String name;
    private int age;

    // コンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // セッター: name の設定
    public void setName(String name) {
        this.name = name;
    }

    // ゲッター: name の取得
    public String getName() {
        return name;
    }

    // セッター: age の設定
    public void setAge(int age) {
        this.age = age;
    }

    // ゲッター: age の取得
    public int getAge() {
        return age;
    }

    // メソッド
    public void print() {
        System.out.println("名前: " + name + ", 年齢: " + age + "歳");
    }
}
