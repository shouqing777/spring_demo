package entity;
/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午2:49:38
* 類說明
*/
public class Knight implements Adventurer{
	
	private String name;
	public int age;

	private AdventurerService adventurerService;
	
	@Override
	public String getDailyWork() {
		return "騎士每天都要練習騎術";
	}

	@Override
	public String getService() {
		return adventurerService.getService();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AdventurerService getAdventurerService() {
		return adventurerService;
	}

	public void setAdventurerService(AdventurerService adventurerService) {
		this.adventurerService = adventurerService;
	}
	
	public void init() {
		System.out.println("騎士初始化");
	}
	
	public void destroy() {
		System.out.println("騎士已經毀滅");
	}

}
