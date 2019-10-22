function strDemo(){
	var res="";
	var str="welcome to java script";
	var len=str.Length;
	res+="Length is"+len+"<br/>";
	res+="Lower-case String is <b>"+str.toLowerCase()+"</b><br/>";
	res+="Upper-case String is <b>"+str.toUpperCase()+"</b><br/>";
	res+="First Occurence of 'a' is <b>"+str.indexOf("a")+"</b><br/>";
	res+="Character at 5th position is <b>"+str.charAt(5)+"</b><br/>";
	res+="Replaced string is <b>"+str.replace("java","HTML")+"</b><br/>";
	
	document.getElementById("res").innerHTML=res;
	
}