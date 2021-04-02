package sec09.exam01_execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		// 1. ������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			// 2. �۾� ���� : Runnable �������̽��� �͸� ���� ��ü --> task ����
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// ������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};

			// 3. �۾� ó�� ��û (�۾�ť�� �����Ų��.)
			executorService.execute(runnable);
			// executorService.submit(runnable);

			Thread.sleep(10);
		}
		// 4. ������Ǯ ����
		executorService.shutdown();
	}
}
