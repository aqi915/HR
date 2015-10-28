
//这个系统目前没有用到
/*function onLoad() {
	var today;
	var hour;
	var second;
	var minute;
	var year;
	var month;
	var date;
	var strDate;
	today = new Date();
	var n_day = today.getDay();
	switch (n_day) {
	case 0: {
		strDate = "星期日"
	}
		break;
	case 1: {
		strDate = "星期一"
	}
		break;
	case 2: {
		strDate = "星期二"
	}
		break;
	case 3: {
		strDate = "星期三"
	}
		break;
	case 4: {
		strDate = "星期四"
	}
		break;
	case 5: {
		strDate = "星期五"
	}
		break;
	case 6: {
		strDate = "星期六"
	}
		break;
	case 7: {
		strDate = "星期日"
	}
		break;
	}
	year = today.getYear();
	month = today.getMonth() + 1;
	date = today.getDate();
	hour = today.getHours();
	minute = today.getMinutes();
	second = today.getSeconds();
	if (month < 10)
		month = "0" + month;
	if (date < 10)
		date = "0" + date;
	if (hour < 10)
		hour = "0" + hour;
	if (minute < 10)
		minute = "0" + minute;
	if (second < 10)
		second = "0" + second;
	document.getElementById('getsystemtime').innerHTML = year + "年" + month
			+ "月" + date + "日 " + strDate + " " + hour + ":" + minute + ":"
			+ second;
	setTimeout("onLoad();", 1000);
}*/

	function getTime(){
		var now= new Date();
		var year=now.getYear();
		var month=now.getMonth()+1;
		var day=now.getDate();
		var hour=now.getHours();
		var minute=now.getMinutes();
		var second=now.getSeconds();
		year ='2'+year;
		return year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
	}

	function onLoad(){
		var timeStr = getTime();
		document.getElementById('getsystemtime').innerHTML = timeStr;
		setTimeout(onLoad,1000);
	}
