import java.util.*;


class animal {
    String name;
    double height;
    double weight;
    double speed;
 
    animal(String name, double height, double weight, double speed) {
      this.name = name;
      this.height = height;
      this.weight = weight;
      this.speed = speed;
    }
 
    void show() {
      System.out.println("姓名：" + this.name);
      System.out.println("身高：" + this.height);
      System.out.println("體重：" + this.weight);
      System.out.println("速度：" + this.speed);
    }

    double distance(int x, double y) {
      return x * y * this.speed;
    }
 
    double distance(int x) {
      return x * this.speed;
    }

    static void showinfo() {
      System.out.println("歡迎進入冰雪奇緣系統");
    }
  }

class human extends animal {
    String gender;

    human(String name, double height, double weight, double speed, String gender) {
      super(name, height, weight, speed);
      this.gender = gender;
    }

    void show() {
      super.show();
      System.out.println("性別：" + this.gender);
    }
  }

class snow extends human {
    String frozenSkill;
 
    snow(String name, double height, double weight, double speed, String gender,String frozenSkill) {
      super(name, height, weight, speed, gender);
      this.frozenSkill = frozenSkill;
    }
 
    // 改寫show方法，增加冰凍技能屬性
    void show() {
      super.show();
      System.out.println("冰凍技能：" + frozenSkill);
    }
 
    // 改寫distance方法，讓距離值乘以2
    double distance(int x, double y) {
      return 2 * super.distance(x, y);
    }
    double distance(int x) {
        return 2 * super.distance(x);
    }
}
public class A1113357_0331{
    public static void main(String[] argv){
    animal.showinfo();
        animal []animals = {new animal("雪寶",1.1,52,100),
        new animal("驢子",1.5,99,200)};

        human [] people = {new human("阿克", 1.9, 80, 150, "男"),
        new human("漢斯", 1.8, 78, 130, "男"),
        new human("安娜", 1.7, 48, 120, "女")};
        
        snow queen = new snow("愛沙", 1.7, 50, 120, "女", "Yes");
                
        
        for(animal a : animals){
            a.show();
            System.out.println();
        }
        for(human h : people){
            h.show();
            System.out.println();
        }
        queen.show();
        System.out.println();        

        Scanner sc = new Scanner(System.in);
        double dist;
        for (animal a : animals){
            System.out.println("請輸入"+a.name+"的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入"+a.name+"的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            if (y==0)
                dist = a.distance(x,y);
            else
                dist = a.distance(x);
            System.out.println(a.name+"的奔跑距離為"+dist+"\n");
        }   

        for(human h : people){
            System.out.println("請輸入"+h.name+"的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入"+h.name+"的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            
            if (y==0)
                dist = h.distance(x,y);
            else
                dist = h.distance(x);
            System.out.println(h.name+"的奔跑距離為"+dist+"\n");
        }

        System.out.println("請輸入"+queen.name+"的奔跑時間(x)");
        int x = sc.nextInt();
        System.out.println("請輸入"+queen.name+"的加速度(y)。若無請輸入0");
        double y = sc.nextDouble();
        
        if (y!=0)
            dist = queen.distance(x,y);
        else
            dist = queen.distance(x);
        System.out.println(queen.name+"的奔跑距離為"+dist+"\n");   
        sc.close();
    }
  }
