package entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午1:28:44
* 類說明
*/
public class SpringApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Adventurer ninja1 = context.getBean("ninja",Adventurer.class);
		
		System.out.println(ninja1.getDailyWork());	
		System.out.println(ninja1.getService());

		Adventurer knight1 = context.getBean("knight",Adventurer.class);
		
		System.out.println(knight1.getDailyWork());
		System.out.println(knight1.getService());
		
		Knight knight2 = context.getBean("knight",Knight.class);

		System.out.println("騎士的名字: " + knight2.getName());
		System.out.println("騎士的年紀: " + knight2.getAge());
		
		context.close();
		
	}

}
