package Lock;

public class ClassLock {
	private static Object lock = new Object(); 

/**
* ��ס��̬����
* @throws InterruptedException
*/
	public void lockStaticObjectField() throws InterruptedException{
		synchronized (lock){
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(10*1000);
		} 
	}
	
/**
* ��ס��̬����
* @throws InterruptedException
*/
	public static synchronized void methodLock() throws InterruptedException{
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(10*1000);
	}

/**
* ��ס xxx.class
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
				classLock.lockStaticObjectField();         // ��ʽ1
				ClassLock.methodLock();                    // ��ʽ2
				classLock.lockClass();                     // ��ʽ3
				}
			catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}

/*
 *����Ԥ��Ľ�����Ǹտ�ʼֻ��1���߳���������Ȼ������߳�����֮��ȴ� 10 ���У�
 *֮������һ�����������̣߳�����߳�����Ȼ��ȴ� 10 �롣ֱ�����һ�����������̣߳�
 *����������ʱ��Լ 50 �롣�ֱ���÷�ʽ1��2��3���۲�ִ�н����������Ԥ�����һ�µġ�
 */
