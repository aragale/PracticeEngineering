package util;

import java.util.ArrayList;
import entity.Alarm;
import entity.Record;

public class Analyse {

	/**public static Alarm TempAnalyse(ArrayList<entity.Record> records){
		Alarm alarm = new Alarm();
		alarm.setGateWayId("HDT-001");
		alarm.setGateWayName("1号网关");
		alarm.setAlarmType("温度");
		alarm.setChargePerson("001");
		alarm.setIsCleared("否");
		if (records.size() != 0) {
			//统计所有记录的最大值和最小值
			double max = records.get(0).getValue();
			int maxId = 0;
			for (entity.Record record : records) {
				if(max <= record.getValue()){
					max = record.getValue();
					maxId = record.getId();
				}
			}
			alarm.setInfo("最高值:" + max);
			alarm.setOccurTime(getRecordById(maxId, records).getTime());
			//以温度数据为例分析
			if(max < 30){
				alarm.setAlarmLevel("无预警");
			}
			if(max >= 30 && max < 40){
				alarm.setAlarmLevel("轻微预警");
			}
			if(max >= 40 && max < 50){
				alarm.setAlarmLevel("火灾预警");
			}
			if(max >= 50){
				alarm.setAlarmLevel("严重告警");
			}
		}else {
			alarm.setInfo("无数据");
			alarm.setOccurTime("无数据");
			alarm.setAlarmLevel("无数据");
		}
		return alarm;
	}
	public static Alarm FireAnalyse(ArrayList<entity.Record> records) {
		Alarm alarm = new Alarm();
		alarm.setGateWayId("HDT-002");
		alarm.setGateWayName("2号网关");
		alarm.setAlarmType("火焰");
		alarm.setChargePerson("002");
		alarm.setIsCleared("否");
		if (records.size() != 0) {
			//统计所有记录的最大值和最小值
			double max = records.get(0).getValue();
			int maxId = 0;
			for (entity.Record record : records) {
				if(max <= record.getValue()){
					max = record.getValue();
					maxId = record.getId();
				}
			}
			alarm.setInfo("最高值:" + max);
			alarm.setOccurTime(getRecordById(maxId, records).getTime());
			if(max == 0){
				alarm.setAlarmLevel("无预警");
			}else{
				alarm.setAlarmLevel("严重告警");
			}
		}else {
			alarm.setInfo("无数据");
			alarm.setOccurTime("无数据");
			alarm.setAlarmLevel("无数据");
		}
		return alarm;
	}
	public static Alarm GasAnalyse(ArrayList<entity.Record> records) {
		Alarm alarm = new Alarm();
		alarm.setGateWayId("HDT-003");
		alarm.setGateWayName("3号网关");
		alarm.setAlarmType("气体");
		alarm.setChargePerson("003");
		alarm.setIsCleared("否");
		if (records.size() != 0) {
			//统计所有记录的最大值和最小值
			double max = records.get(0).getValue();
			int maxId = 0;
			for (entity.Record record : records) {
				if(max <= record.getValue()){
					max = record.getValue();
					maxId = record.getId();
				}
			}
			alarm.setInfo("最高值:" + max);
			alarm.setOccurTime(getRecordById(maxId, records).getTime());
			if(max < 30){
				alarm.setAlarmLevel("无预警");
			}
			if(max >= 30 && max < 40){
				alarm.setAlarmLevel("轻微预警");
			}
			if(max >= 40 && max < 50){
				alarm.setAlarmLevel("火灾预警");
			}
			if(max >= 50){
				alarm.setAlarmLevel("严重告警");
			}
		}else {
			alarm.setInfo("无数据");
			alarm.setOccurTime("无数据");
			alarm.setAlarmLevel("无数据");
		}
		return alarm;
	}
	public static Record getRecordById(int id,ArrayList<Record> records) {
		Record r = new Record();
		for (Record record : records) {
			if (record.getId() == id) {
				r = record;
			}
		}
		return r;
	}**/
}
