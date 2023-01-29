import person.*;

public class Object {
    public static void main(String[] args) {
        // Person クラスと BusinessPerson クラスのインスタンスを作成
        Person p1 = new Person("田中太郎", 20);
        Person p2 = new Person("佐藤花子", 25);
        BusinessPerson bp1 = new BusinessPerson("鈴木一郎", 30, "エンジニア");
        BusinessPerson bp2 = new BusinessPerson("山田智子", 35, "営業");
        Person p3 = new Person("加藤浩一", 40);
        BusinessPerson bp3 = new BusinessPerson("渡辺麻美", 45, "デザイナー");
        Person p4 = new Person("伊藤陽子", 50);
        BusinessPerson bp4 = new BusinessPerson("山口智子", 55, "経営者");

        // Person クラスと BusinessPerson クラスのインスタンスを配列に格納
        Person[] people = new Person[8];
        people[0] = p1;
        people[1] = p2;
        people[2] = bp1;
        people[3] = bp2;
        people[4] = p3;
        people[5] = bp3;
        people[6] = p4;
        people[7] = bp4;

        // for 文を使って各インスタンスの print メソッドを呼び出す
        for (Person p : people) { // 拡張forループ
            // スーパークラスのリファレンス変数からサブクラスのインスタンスを参照することで
            // サブクラスのオーバーライドした print メソッドが呼び出されることにより
            // ポリモーフィズムを実現している
            p.print();
        }
    }
}
