$(function(){
	handleMenuClass();
	handleCarousel();
	$("video").prop('muted', true); 
});

function handleMenuClass(){
	$("#menu-header ul li").click(function(){
		$("li").each(function(i){
			if($(this).hasClass("active")){
				$(this).removeClass("active");
			}
		});
		$(this).addClass("active");
	});
}

function handleCarousel(){
	$("#inf-ref").click(function(){
		document.location.href = "http://www.inf.pucrs.br";
	});
	$("med-ref").click(function(){
		document.location.href = "http://hms.harvard.edu/";
	});
	$("astr-ref").click(function(){
		document.location.href = "http://www.nasa.gov/news/";
	});
}