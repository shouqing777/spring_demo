package entity;
/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月10日 下午1:27:05
* 類說明
*/
public class Ninja implements Adventurer {

	private AdventurerService adventurerService;

	public Ninja(AdventurerService adventurerService) {
		this.adventurerService = adventurerService;
	}

	@Override
	public String getDailyWork() {
		return "忍者每天都要練習忍術...";
	}

	@Override
	public String getService() {
		return adventurerService.getService();
	}
}
