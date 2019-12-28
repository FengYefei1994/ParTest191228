package Lock;

public class ClassLock {
	private static Object lock = new Object(); 

/**
* 锁住静态变量
* @throws InterruptedException
*/
	public void lockStaticObjectField() throws InterruptedException{
		synchronized (lock){
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(10*1000);
		} 
	}
	
/**
* 锁住静态方法
* @throws InterruptedException
*/
	public static synchronized void methodLock() throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(10*1000);
	}

/**
* 锁住 xxx.class
* @throws InterruptedException
*/

	public void lockClass() throws InterruptedException{
		synchronized (ClassLock.class){
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(2*1000);
		}
	}
	
	public static void main(String[] args){
		for (int i = 0; i < 5; i++) {
			Thread worker = new Thread(new ClassLockWorker());
			worker.setName("kite-" + i);
			worker.start();
		}
	}
	
	public static class ClassLockWorker implements Runnable{
		@Override
		public void run() {
			try {
				ClassLock classLock = new ClassLock();
				classLock.lockStaticObjectField();         // 方式1
				ClassLock.methodLock();                    // 方式2
				classLock.lockClass();                     // 方式3
				}
			catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}

/*
 *我们预测的结果就是刚开始只有1个线程抢到锁，然后输出线程名，之后等待 10 秒中，
 *之后是下一个抢到锁的线程，输出线程名，然后等待 10 秒。直到最后一个抢到锁的线程，
 *整个过程历时大约 50 秒。分别调用方式1、2、3，观察执行结果，和我们预测的是一致的。
 */
