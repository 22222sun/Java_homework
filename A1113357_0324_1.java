import java.util.Scanner;

class animal{
   String name;
   double height;
   int weight;
   int speed;

   void show(){
    System.out.println("Name："+this.name);
    System.out.println("Height："+this.height);
    System.out.println("Weight："+this.weight);
    System.out.println("Speed："+this.speed);
   }
  
   double distance(int x,double y){
    return x*y*this.speed;
   }
   int distance(int x){
    return x*this.speed;
   }
}

public class A1113357_0324_1{
  public static void main(String[] argv){
    animal []animals = new animal[4];
    String []name = {"雪寶","驢子","安那","愛沙"};
    double []height = {1.1,1.5,1.7,1.7};
    int []weight = {52,99,48,50};
    int []speed = {100,200,120,120};
    for(int i=0;i<4;i++){
        animals[i] = new animal();
        animals[i].name = name[i];
        animals[i].height = height[i];
        animals[i].weight = weight[i];
        animals[i].speed = speed[i];
        animals[i].show();
    }
    Scanner sc = new Scanner(System.in);
    for(animal n : animals){
        System.out.println("請輸入"+n.name+"的奔跑時間(x)：");
        int x = sc.nextInt();
        System.out.println("請輸入"+n.name+"的加速度(y)，沒有則輸入0：");
        double y = sc.nextDouble();
        double distance;
        if(y>0)
            distance = n.distance(x,y);
        else
            distance = n.distance(x);
        System.out.println(n.name+"的奔跑距離為："+distance);
    }
  }
}
