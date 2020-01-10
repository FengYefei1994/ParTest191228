package Polymorphism;

public class Farm {

	public static void main(String[] args) {
		
		// 阶段1：类对象.类方法/属性 System.out.println("调用Apple类的harvest()方法的结果：");
		System.out.println("阶段1");
        // 声明Apple类的一个对象apple，并分配内存 apple.harvest(); 调用Apple的方法
		Apple apple = new Apple();
		System.out.println("调用Orange类的harvest()方法的结果：");
		Orange orange = new Orange();
		orange.harvest();		 
		
		//阶段2：父类类型子类对象.父类方法/属性（由父类方法入，去调用子类具体实现）
		System.out.println("");
		System.out.println("阶段2");
		System.out.print("生成Fruit类的苹果对象，调用其harvest()方法的结果：");
		Fruit fruit = new Apple();
		fruit.harvest();

		System.out.print("生成Fruit类的橘子对象，调用其harvest()方法的结果：");
		Fruit fruit2 = new Orange();
		fruit2.harvest();



		/*
		 * 阶段3：把父类抽象方法（方法体）部分根据父类类型作为参数/返回值重写一个类，便于后续程序更新维护
		 * 增加新对象时：
		 * 1、增加对象类，完成对象方法
		 * 2、增加主程序中调用部分
		 */
		
		//父类作为方法形参
		System.out.println("");
		System.out.println("阶段3");
		System.out.println("父类作为方法形参");
		Fruit apple2 = new Apple();
		Fruit orange2 = new Orange();
		Collect c1 = new Collect(apple2);
		Collect c2 = new Collect(orange2);
		
		
		//父类作为方法返回
		System.out.println("");
		System.out.println("阶段4");
		System.out.println("父类作为方法返回");
		Givefruit givef=new Givefruit();
		Fruit f=givef.Givefruit("orange");
		Collect c3=new Collect(f);                     //调用上一段方法

	}
}
