function deleteRecord(id){
	var isDelete = confirm("是否删除该条记录？");
	if (isDelete == true) {
		location.href = "Delete?id=" + id;
	}
}
function query(name){
	var starttime = $("input[name='starttime']").val();
	var endtime = $("input[name='endtime']").val();
	if(starttime == "" || endtime == ""){
		alert("请选择时间后重试！");
	}else{
		var isQuery = confirm("开始时间：" + starttime + "\n结束时间：" + endtime + "\n数据类型：" + name);
		if(isQuery == true){
			window.location.href =  "Record?name=" + name + "&starttime=" + starttime + "&endtime=" + endtime;;
		}	
	}
}
function refresh(){
	location.href = "Alarm?name=all";
}
function alarmSet(){
	// 设置告警
	alert("空操作");
}

function viewExpired(){
	// 查看过期警告
	alert("空操作");
}
function clearAlarm(){
	// 清除警告
	location.href = "Alarm?name=null";
}