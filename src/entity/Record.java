package entity;
/**
 * Created by yz on 12/26/16.
 */
public class Record {
    //时间
    private String time;
    //名称
    private int lightz;
    private int lightx;
    private int lightl;
    private int tempx;
    private int tempz;
    private int templ;
    private int wetz;
    private int wetx;
    private int wetl;
    //编号
    private int id;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

	public int getLightz() {
		return lightz;
	}

	public void setLightz(int lightz) {
		this.lightz = lightz;
	}

	public int getLightx() {
		return lightx;
	}

	public void setLightx(int lightx) {
		this.lightx = lightx;
	}

	public int getLightl() {
		return lightl;
	}

	public void setLightl(int lightl) {
		this.lightl = lightl;
	}

	public int getTempx() {
		return tempx;
	}

	public void setTempx(int tempx) {
		this.tempx = tempx;
	}

	public int getTempz() {
		return tempz;
	}

	public void setTempz(int tempz) {
		this.tempz = tempz;
	}

	public int getTempl() {
		return templ;
	}

	public void setTempl(int templ) {
		this.templ = templ;
	}

	public int getWetz() {
		return wetz;
	}

	public void setWetz(int wetz) {
		this.wetz = wetz;
	}

	public int getWetx() {
		return wetx;
	}

	public void setWetx(int wetx) {
		this.wetx = wetx;
	}

	public int getWetl() {
		return wetl;
	}

	public void setWetl(int wetl) {
		this.wetl = wetl;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Record(){

    }

}
