<html>

<head>

<title>First Web Application</title>

</head>

<body bgcolor="#E77BBB">
//console.log(${todos});
//${todos[1]}
<p id="demo"> (innerHTML).</p>

<script>
function myFunction() 
{
var i;
var s;
var t="";
var p = [];
p=${todos};
s="";
//console.log("debasree");
for(i=0;i<p.length;i++){
	//console.log(p[i]);
	s=s+p[i]+"\n"+"\n"+"\n";
	document.getElementById("demo").innerHTML =s+"<BR/>";
	
}  
}
myFunction();
</script>
</body>

</html>