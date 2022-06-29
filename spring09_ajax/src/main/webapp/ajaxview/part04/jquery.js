$(document).ready(function(){
	$('#btn').click(function(){
		
		$.ajax({
			type:'GET',
		    dataType:'json',
		    url:'searchOpen.do?search='+$('#search').val(),
		    success:viewMessage,
		    error: function(xhr, textStatus, error){
			         alert(xhr.status);
		           }
		    });
	});
});

function viewMessage(res){
	//console.log(res);
	//alert(res.documents.item[0].title);
	//alert(res.documents[0].contents);
	
	$('#wrap').empty();
	$('#wrap').append('<table><tr><th>title</th><th>image</th><th>author</th><th>price</th></tr></table>');
	
	$.each(res.documents,function(index, element){
		$('#wrap table').append(`<tr><td>${element.title}</td><td><a href="${element.url}"><img src="${element.thumbnail}" /></a></td><td>${element.authors}</td><td>${element.price}</td></tr>`);
	});
	
	$('#search').val('');
	$('#search').focus();
}







