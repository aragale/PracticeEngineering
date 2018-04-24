package entity;

public class Alarm {
	private String gateWayId;
	private String gateWayName;
	private String alarmLevel;
	private String alarmType;
	private String info;
	private String chargePerson;
	private String occurTime;
	private String isCleared;
	private String clearPerson;
	private String clearTime;
	
	public Alarm() {
		// TODO Auto-generated constructor stub
	}
	public String getGateWayId() {
		return gateWayId;
	}
	public void setGateWayId(String gateWayId) {
		this.gateWayId = gateWayId;
	}
	public String getGateWayName() {
		return gateWayName;
	}
	public void setGateWayName(String gateWayName) {
		this.gateWayName = gateWayName;
	}

	public String getAlarmType() {
		return alarmType;
	}
	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getChargePerson() {
		return chargePerson;
	}
	public void setChargePerson(String chargePerson) {
		this.chargePerson = chargePerson;
	}
	public String getOccurTime() {
		return occurTime;
	}
	public void setOccurTime(String occurTime) {
		this.occurTime = occurTime;
	}
	public String getIsCleared() {
		return isCleared;
	}
	public void setIsCleared(String isCleared) {
		this.isCleared = isCleared;
	}
	public String getClearPerson() {
		return clearPerson;
	}
	public void setClearPerson(String clearPerson) {
		this.clearPerson = clearPerson;
	}
	public String getClearTime() {
		return clearTime;
	}
	public void setClearTime(String clearTime) {
		this.clearTime = clearTime;
	}
	public String getAlarmLevel() {
		return alarmLevel;
	}
	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}


}
