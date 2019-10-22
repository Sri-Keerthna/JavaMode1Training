function show(){
	var today=new Date();
	var fullyear=today.getFullYear();
	var future=new Date("December 31,"+fullyear);
	var diff=future.getTime()-today.getTime();
	//no of milliseconds
	var days=Math.ceil(diff/(1000*60*60*24));
	//convert to days
	var res="only <u>"+days+"</u> days left till NewYear Day!";
	document.getElementById("res").innerHTML=res;
}